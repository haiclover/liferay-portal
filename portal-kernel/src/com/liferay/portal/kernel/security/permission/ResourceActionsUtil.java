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

package com.liferay.portal.kernel.security.permission;

import com.liferay.portal.kernel.exception.NoSuchResourceActionException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Portlet;
import com.liferay.portal.kernel.model.Role;

import java.util.List;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Brian Wing Shun Chan
 * @author Daeyoung Song
 */
public class ResourceActionsUtil {

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #check(String)}
	 */
	@Deprecated
	public static void check(Portlet portlet) {
		getResourceActions().check(portlet);
	}

	public static void check(String portletName) {
		getResourceActions().check(portletName);
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void checkAction(String name, String actionId)
		throws NoSuchResourceActionException {

		getResourceActions().checkAction(name, actionId);
	}

	public static String getAction(
		HttpServletRequest httpServletRequest, String action) {

		return getResourceActions().getAction(httpServletRequest, action);
	}

	public static String getAction(Locale locale, String action) {
		return getResourceActions().getAction(locale, action);
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static String getActionNamePrefix() {
		return getResourceActions().getActionNamePrefix();
	}

	public static String getCompositeModelName(String... classNames) {
		return getResourceActions().getCompositeModelName(classNames);
	}

	public static String getCompositeModelNameSeparator() {
		return getResourceActions().getCompositeModelNameSeparator();
	}

	public static List<String> getModelNames() {
		return getResourceActions().getModelNames();
	}

	public static List<String> getModelPortletResources(String name) {
		return getResourceActions().getModelPortletResources(name);
	}

	public static String getModelResource(
		HttpServletRequest httpServletRequest, String name) {

		return getResourceActions().getModelResource(httpServletRequest, name);
	}

	public static String getModelResource(Locale locale, String name) {
		return getResourceActions().getModelResource(locale, name);
	}

	public static List<String> getModelResourceActions(String name) {
		return getResourceActions().getModelResourceActions(name);
	}

	public static List<String> getModelResourceGroupDefaultActions(
		String name) {

		return getResourceActions().getModelResourceGroupDefaultActions(name);
	}

	public static List<String> getModelResourceGuestDefaultActions(
		String name) {

		return getResourceActions().getModelResourceGuestDefaultActions(name);
	}

	public static List<String> getModelResourceGuestUnsupportedActions(
		String name) {

		return getResourceActions().getModelResourceGuestUnsupportedActions(
			name);
	}

	public static String getModelResourceNamePrefix() {
		return getResourceActions().getModelResourceNamePrefix();
	}

	public static List<String> getModelResourceOwnerDefaultActions(
		String name) {

		return getResourceActions().getModelResourceOwnerDefaultActions(name);
	}

	public static Double getModelResourceWeight(String name) {
		return getResourceActions().getModelResourceWeight(name);
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static String[] getOrganizationModelResources() {
		return getResourceActions().getOrganizationModelResources();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static String[] getPortalModelResources() {
		return getResourceActions().getPortalModelResources();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static String getPortletBaseResource(String portletName) {
		return getResourceActions().getPortletBaseResource(portletName);
	}

	public static List<String> getPortletModelResources(String portletName) {
		return getResourceActions().getPortletModelResources(portletName);
	}

	public static List<String> getPortletNames() {
		return getResourceActions().getPortletNames();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static List<String> getPortletResourceActions(Portlet portlet) {
		return getResourceActions().getPortletResourceActions(portlet);
	}

	public static List<String> getPortletResourceActions(String name) {
		return getResourceActions().getPortletResourceActions(name);
	}

	public static List<String> getPortletResourceGroupDefaultActions(
		String name) {

		return getResourceActions().getPortletResourceGroupDefaultActions(name);
	}

	public static List<String> getPortletResourceGuestDefaultActions(
		String name) {

		return getResourceActions().getPortletResourceGuestDefaultActions(name);
	}

	public static List<String> getPortletResourceGuestUnsupportedActions(
		String name) {

		return getResourceActions().getPortletResourceGuestUnsupportedActions(
			name);
	}

	public static List<String> getPortletResourceLayoutManagerActions(
		String name) {

		return getResourceActions().getPortletResourceLayoutManagerActions(
			name);
	}

	public static String getPortletRootModelResource(String portletName) {
		return getResourceActions().getPortletRootModelResource(portletName);
	}

	public static ResourceActions getResourceActions() {
		return _resourceActions;
	}

	public static List<String> getResourceActions(String name) {
		return getResourceActions().getResourceActions(name);
	}

	public static List<String> getResourceActions(
		String portletResource, String modelResource) {

		return getResourceActions().getResourceActions(
			portletResource, modelResource);
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static List<String> getResourceGroupDefaultActions(String name) {
		return getResourceActions().getResourceGroupDefaultActions(name);
	}

	public static List<String> getResourceGuestUnsupportedActions(
		String portletResource, String modelResource) {

		return getResourceActions().getResourceGuestUnsupportedActions(
			portletResource, modelResource);
	}

	public static List<Role> getRoles(
		long companyId, Group group, String modelResource, int[] roleTypes) {

		return getResourceActions().getRoles(
			companyId, group, modelResource, roleTypes);
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static String[] getRootModelResources() {
		return getResourceActions().getRootModelResources();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static boolean hasModelResourceActions(String name) {
		return getResourceActions().hasModelResourceActions(name);
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static boolean isOrganizationModelResource(String modelResource) {
		return getResourceActions().isOrganizationModelResource(modelResource);
	}

	public static boolean isPortalModelResource(String modelResource) {
		return getResourceActions().isPortalModelResource(modelResource);
	}

	public static boolean isRootModelResource(String modelResource) {
		return getResourceActions().isRootModelResource(modelResource);
	}

	public static void read(ClassLoader classLoader, String source)
		throws Exception {

		getResourceActions().read(classLoader, source);
	}

	public static void read(ClassLoader classLoader, String... sources)
		throws Exception {

		getResourceActions().read(classLoader, sources);
	}

	/**
	 * @deprecated As of Cavanaugh (7.4.x), with no direct replacement
	 */
	@Deprecated
	public static void read(
			String servletContextName, ClassLoader classLoader, String source)
		throws Exception {

		getResourceActions().read(servletContextName, classLoader, source);
	}

	/**
	 * @deprecated As of Cavanaugh (7.4.x), with no direct replacement
	 */
	@Deprecated
	public static void read(
			String servletContextName, ClassLoader classLoader,
			String... sources)
		throws Exception {

		getResourceActions().read(servletContextName, classLoader, sources);
	}

	public static void readAndCheck(ClassLoader classLoader, String... sources)
		throws Exception {

		getResourceActions().readAndCheck(classLoader, sources);
	}

	/**
	 * @deprecated As of Cavanaugh (7.4.x), with no direct replacement
	 */
	@Deprecated
	public static void readAndCheck(
			String servletContextName, ClassLoader classLoader,
			String... sources)
		throws Exception {

		getResourceActions().readAndCheck(
			servletContextName, classLoader, sources);
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void removePortletResource(String portletName) {
		getResourceActions().removePortletResource(portletName);
	}

	public void setResourceActions(ResourceActions resourceActions) {
		_resourceActions = resourceActions;
	}

	private static ResourceActions _resourceActions;

}