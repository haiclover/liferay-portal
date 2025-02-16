/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.opensocial.shindig.servlet;

import com.google.inject.Injector;

import com.liferay.opensocial.shindig.util.HttpServletRequestThreadLocal;
import com.liferay.opensocial.shindig.util.ShindigUtil;
import com.liferay.petra.encryptor.Encryptor;
import com.liferay.petra.encryptor.EncryptorException;
import com.liferay.petra.string.StringBundler;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.Company;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.security.auth.AuthenticatedUserUUIDStoreUtil;
import com.liferay.portal.kernel.security.auth.PrincipalThreadLocal;
import com.liferay.portal.kernel.security.permission.PermissionChecker;
import com.liferay.portal.kernel.security.permission.PermissionCheckerFactoryUtil;
import com.liferay.portal.kernel.security.permission.PermissionThreadLocal;
import com.liferay.portal.kernel.service.CompanyLocalServiceUtil;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.CookieKeys;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.Validator;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.UnavailableException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.shindig.common.servlet.GuiceServletContextListener;
import org.apache.shindig.common.servlet.InjectedFilter;

/**
 * @author Michael Young
 * @author Dennis Ju
 */
public class ShindigFilter extends InjectedFilter {

	public void destroy() {
	}

	public void doFilter(
			ServletRequest servletRequest, ServletResponse servletResponse,
			FilterChain filterChain)
		throws IOException, ServletException {

		HttpServletRequest httpServletRequest =
			(HttpServletRequest)servletRequest;

		if (injector == null) {
			HttpSession session = httpServletRequest.getSession();

			_init(session.getServletContext());
		}

		PermissionChecker permissionChecker =
			PermissionThreadLocal.getPermissionChecker();

		if (permissionChecker == null) {
			setPermissionChecker(servletRequest);
		}

		ShindigUtil.setScheme(servletRequest.getScheme());

		String host = StringBundler.concat(
			servletRequest.getServerName(), StringPool.COLON,
			servletRequest.getServerPort());

		ShindigUtil.setHost(host);

		HttpServletRequestThreadLocal.setHttpServletRequest(httpServletRequest);

		try {
			filterChain.doFilter(servletRequest, servletResponse);
		}
		finally {
			HttpServletRequestThreadLocal.setHttpServletRequest(null);
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

		// LPS-23577 and LPS-41715

		injector = null;
	}

	protected boolean setPermissionChecker(ServletRequest servletRequest) {
		String companyIdString = CookieKeys.getCookie(
			(HttpServletRequest)servletRequest, CookieKeys.COMPANY_ID);

		if (Validator.isNull(companyIdString)) {
			return false;
		}

		long companyId = GetterUtil.getLong(companyIdString);

		String userUUID = StringPool.BLANK;

		try {
			Company company = CompanyLocalServiceUtil.fetchCompany(companyId);

			if (company == null) {
				return false;
			}

			String userUUIDString = CookieKeys.getCookie(
				(HttpServletRequest)servletRequest, CookieKeys.USER_UUID);

			if (Validator.isNull(userUUIDString)) {
				return false;
			}

			userUUID = GetterUtil.getString(
				Encryptor.decrypt(company.getKeyObj(), userUUIDString));
		}
		catch (EncryptorException encryptorException) {
			return false;
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			return false;
		}

		if (!AuthenticatedUserUUIDStoreUtil.exists(userUUID)) {
			return false;
		}

		String userIdString = userUUID.substring(
			0, userUUID.indexOf(StringPool.PERIOD));

		long userId = GetterUtil.getLong(userIdString);

		try {
			User user = UserLocalServiceUtil.getUserById(userId);

			PrincipalThreadLocal.setName(userIdString);

			PermissionThreadLocal.setPermissionChecker(
				PermissionCheckerFactoryUtil.create(user));
		}
		catch (Exception exception) {
			_log.error(exception, exception);

			return false;
		}

		return true;
	}

	private void _init(ServletContext servletContext) throws ServletException {
		injector = (Injector)servletContext.getAttribute(
			GuiceServletContextListener.INJECTOR_ATTRIBUTE);

		if (injector == null) {
			injector = (Injector)servletContext.getAttribute(
				GuiceServletContextListener.INJECTOR_NAME);

			if (injector == null) {
				throw new UnavailableException(
					"Guice injector is not available. Please register " +
						GuiceServletContextListener.class.getName() + ".");
			}
		}

		injector.injectMembers(this);
	}

	private static final Log _log = LogFactoryUtil.getLog(ShindigFilter.class);

}