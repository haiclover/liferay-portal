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

package com.liferay.dispatch.service.persistence;

import com.liferay.dispatch.model.DispatchTrigger;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the dispatch trigger service. This utility wraps <code>com.liferay.dispatch.service.persistence.impl.DispatchTriggerPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Matija Petanjek
 * @see DispatchTriggerPersistence
 * @generated
 */
public class DispatchTriggerUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(DispatchTrigger dispatchTrigger) {
		getPersistence().clearCache(dispatchTrigger);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, DispatchTrigger> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<DispatchTrigger> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<DispatchTrigger> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<DispatchTrigger> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<DispatchTrigger> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static DispatchTrigger update(DispatchTrigger dispatchTrigger) {
		return getPersistence().update(dispatchTrigger);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static DispatchTrigger update(
		DispatchTrigger dispatchTrigger, ServiceContext serviceContext) {

		return getPersistence().update(dispatchTrigger, serviceContext);
	}

	/**
	 * Returns all the dispatch triggers where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching dispatch triggers
	 */
	public static List<DispatchTrigger> findByCompanyId(long companyId) {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	 * Returns a range of all the dispatch triggers where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dispatch triggers
	 * @param end the upper bound of the range of dispatch triggers (not inclusive)
	 * @return the range of matching dispatch triggers
	 */
	public static List<DispatchTrigger> findByCompanyId(
		long companyId, int start, int end) {

		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the dispatch triggers where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dispatch triggers
	 * @param end the upper bound of the range of dispatch triggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dispatch triggers
	 */
	public static List<DispatchTrigger> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<DispatchTrigger> orderByComparator) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dispatch triggers where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dispatch triggers
	 * @param end the upper bound of the range of dispatch triggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dispatch triggers
	 */
	public static List<DispatchTrigger> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<DispatchTrigger> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first dispatch trigger in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dispatch trigger
	 * @throws NoSuchTriggerException if a matching dispatch trigger could not be found
	 */
	public static DispatchTrigger findByCompanyId_First(
			long companyId,
			OrderByComparator<DispatchTrigger> orderByComparator)
		throws com.liferay.dispatch.exception.NoSuchTriggerException {

		return getPersistence().findByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the first dispatch trigger in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dispatch trigger, or <code>null</code> if a matching dispatch trigger could not be found
	 */
	public static DispatchTrigger fetchByCompanyId_First(
		long companyId, OrderByComparator<DispatchTrigger> orderByComparator) {

		return getPersistence().fetchByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last dispatch trigger in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dispatch trigger
	 * @throws NoSuchTriggerException if a matching dispatch trigger could not be found
	 */
	public static DispatchTrigger findByCompanyId_Last(
			long companyId,
			OrderByComparator<DispatchTrigger> orderByComparator)
		throws com.liferay.dispatch.exception.NoSuchTriggerException {

		return getPersistence().findByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last dispatch trigger in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dispatch trigger, or <code>null</code> if a matching dispatch trigger could not be found
	 */
	public static DispatchTrigger fetchByCompanyId_Last(
		long companyId, OrderByComparator<DispatchTrigger> orderByComparator) {

		return getPersistence().fetchByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the dispatch triggers before and after the current dispatch trigger in the ordered set where companyId = &#63;.
	 *
	 * @param dispatchTriggerId the primary key of the current dispatch trigger
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dispatch trigger
	 * @throws NoSuchTriggerException if a dispatch trigger with the primary key could not be found
	 */
	public static DispatchTrigger[] findByCompanyId_PrevAndNext(
			long dispatchTriggerId, long companyId,
			OrderByComparator<DispatchTrigger> orderByComparator)
		throws com.liferay.dispatch.exception.NoSuchTriggerException {

		return getPersistence().findByCompanyId_PrevAndNext(
			dispatchTriggerId, companyId, orderByComparator);
	}

	/**
	 * Returns all the dispatch triggers that the user has permission to view where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching dispatch triggers that the user has permission to view
	 */
	public static List<DispatchTrigger> filterFindByCompanyId(long companyId) {
		return getPersistence().filterFindByCompanyId(companyId);
	}

	/**
	 * Returns a range of all the dispatch triggers that the user has permission to view where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dispatch triggers
	 * @param end the upper bound of the range of dispatch triggers (not inclusive)
	 * @return the range of matching dispatch triggers that the user has permission to view
	 */
	public static List<DispatchTrigger> filterFindByCompanyId(
		long companyId, int start, int end) {

		return getPersistence().filterFindByCompanyId(companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the dispatch triggers that the user has permissions to view where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of dispatch triggers
	 * @param end the upper bound of the range of dispatch triggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dispatch triggers that the user has permission to view
	 */
	public static List<DispatchTrigger> filterFindByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<DispatchTrigger> orderByComparator) {

		return getPersistence().filterFindByCompanyId(
			companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the dispatch triggers before and after the current dispatch trigger in the ordered set of dispatch triggers that the user has permission to view where companyId = &#63;.
	 *
	 * @param dispatchTriggerId the primary key of the current dispatch trigger
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dispatch trigger
	 * @throws NoSuchTriggerException if a dispatch trigger with the primary key could not be found
	 */
	public static DispatchTrigger[] filterFindByCompanyId_PrevAndNext(
			long dispatchTriggerId, long companyId,
			OrderByComparator<DispatchTrigger> orderByComparator)
		throws com.liferay.dispatch.exception.NoSuchTriggerException {

		return getPersistence().filterFindByCompanyId_PrevAndNext(
			dispatchTriggerId, companyId, orderByComparator);
	}

	/**
	 * Removes all the dispatch triggers where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public static void removeByCompanyId(long companyId) {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	 * Returns the number of dispatch triggers where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching dispatch triggers
	 */
	public static int countByCompanyId(long companyId) {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	 * Returns the number of dispatch triggers that the user has permission to view where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching dispatch triggers that the user has permission to view
	 */
	public static int filterCountByCompanyId(long companyId) {
		return getPersistence().filterCountByCompanyId(companyId);
	}

	/**
	 * Returns all the dispatch triggers where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @return the matching dispatch triggers
	 */
	public static List<DispatchTrigger> findByC_U(long companyId, long userId) {
		return getPersistence().findByC_U(companyId, userId);
	}

	/**
	 * Returns a range of all the dispatch triggers where companyId = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param start the lower bound of the range of dispatch triggers
	 * @param end the upper bound of the range of dispatch triggers (not inclusive)
	 * @return the range of matching dispatch triggers
	 */
	public static List<DispatchTrigger> findByC_U(
		long companyId, long userId, int start, int end) {

		return getPersistence().findByC_U(companyId, userId, start, end);
	}

	/**
	 * Returns an ordered range of all the dispatch triggers where companyId = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param start the lower bound of the range of dispatch triggers
	 * @param end the upper bound of the range of dispatch triggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dispatch triggers
	 */
	public static List<DispatchTrigger> findByC_U(
		long companyId, long userId, int start, int end,
		OrderByComparator<DispatchTrigger> orderByComparator) {

		return getPersistence().findByC_U(
			companyId, userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dispatch triggers where companyId = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param start the lower bound of the range of dispatch triggers
	 * @param end the upper bound of the range of dispatch triggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dispatch triggers
	 */
	public static List<DispatchTrigger> findByC_U(
		long companyId, long userId, int start, int end,
		OrderByComparator<DispatchTrigger> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByC_U(
			companyId, userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first dispatch trigger in the ordered set where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dispatch trigger
	 * @throws NoSuchTriggerException if a matching dispatch trigger could not be found
	 */
	public static DispatchTrigger findByC_U_First(
			long companyId, long userId,
			OrderByComparator<DispatchTrigger> orderByComparator)
		throws com.liferay.dispatch.exception.NoSuchTriggerException {

		return getPersistence().findByC_U_First(
			companyId, userId, orderByComparator);
	}

	/**
	 * Returns the first dispatch trigger in the ordered set where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dispatch trigger, or <code>null</code> if a matching dispatch trigger could not be found
	 */
	public static DispatchTrigger fetchByC_U_First(
		long companyId, long userId,
		OrderByComparator<DispatchTrigger> orderByComparator) {

		return getPersistence().fetchByC_U_First(
			companyId, userId, orderByComparator);
	}

	/**
	 * Returns the last dispatch trigger in the ordered set where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dispatch trigger
	 * @throws NoSuchTriggerException if a matching dispatch trigger could not be found
	 */
	public static DispatchTrigger findByC_U_Last(
			long companyId, long userId,
			OrderByComparator<DispatchTrigger> orderByComparator)
		throws com.liferay.dispatch.exception.NoSuchTriggerException {

		return getPersistence().findByC_U_Last(
			companyId, userId, orderByComparator);
	}

	/**
	 * Returns the last dispatch trigger in the ordered set where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dispatch trigger, or <code>null</code> if a matching dispatch trigger could not be found
	 */
	public static DispatchTrigger fetchByC_U_Last(
		long companyId, long userId,
		OrderByComparator<DispatchTrigger> orderByComparator) {

		return getPersistence().fetchByC_U_Last(
			companyId, userId, orderByComparator);
	}

	/**
	 * Returns the dispatch triggers before and after the current dispatch trigger in the ordered set where companyId = &#63; and userId = &#63;.
	 *
	 * @param dispatchTriggerId the primary key of the current dispatch trigger
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dispatch trigger
	 * @throws NoSuchTriggerException if a dispatch trigger with the primary key could not be found
	 */
	public static DispatchTrigger[] findByC_U_PrevAndNext(
			long dispatchTriggerId, long companyId, long userId,
			OrderByComparator<DispatchTrigger> orderByComparator)
		throws com.liferay.dispatch.exception.NoSuchTriggerException {

		return getPersistence().findByC_U_PrevAndNext(
			dispatchTriggerId, companyId, userId, orderByComparator);
	}

	/**
	 * Returns all the dispatch triggers that the user has permission to view where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @return the matching dispatch triggers that the user has permission to view
	 */
	public static List<DispatchTrigger> filterFindByC_U(
		long companyId, long userId) {

		return getPersistence().filterFindByC_U(companyId, userId);
	}

	/**
	 * Returns a range of all the dispatch triggers that the user has permission to view where companyId = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param start the lower bound of the range of dispatch triggers
	 * @param end the upper bound of the range of dispatch triggers (not inclusive)
	 * @return the range of matching dispatch triggers that the user has permission to view
	 */
	public static List<DispatchTrigger> filterFindByC_U(
		long companyId, long userId, int start, int end) {

		return getPersistence().filterFindByC_U(companyId, userId, start, end);
	}

	/**
	 * Returns an ordered range of all the dispatch triggers that the user has permissions to view where companyId = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param start the lower bound of the range of dispatch triggers
	 * @param end the upper bound of the range of dispatch triggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dispatch triggers that the user has permission to view
	 */
	public static List<DispatchTrigger> filterFindByC_U(
		long companyId, long userId, int start, int end,
		OrderByComparator<DispatchTrigger> orderByComparator) {

		return getPersistence().filterFindByC_U(
			companyId, userId, start, end, orderByComparator);
	}

	/**
	 * Returns the dispatch triggers before and after the current dispatch trigger in the ordered set of dispatch triggers that the user has permission to view where companyId = &#63; and userId = &#63;.
	 *
	 * @param dispatchTriggerId the primary key of the current dispatch trigger
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dispatch trigger
	 * @throws NoSuchTriggerException if a dispatch trigger with the primary key could not be found
	 */
	public static DispatchTrigger[] filterFindByC_U_PrevAndNext(
			long dispatchTriggerId, long companyId, long userId,
			OrderByComparator<DispatchTrigger> orderByComparator)
		throws com.liferay.dispatch.exception.NoSuchTriggerException {

		return getPersistence().filterFindByC_U_PrevAndNext(
			dispatchTriggerId, companyId, userId, orderByComparator);
	}

	/**
	 * Removes all the dispatch triggers where companyId = &#63; and userId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 */
	public static void removeByC_U(long companyId, long userId) {
		getPersistence().removeByC_U(companyId, userId);
	}

	/**
	 * Returns the number of dispatch triggers where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @return the number of matching dispatch triggers
	 */
	public static int countByC_U(long companyId, long userId) {
		return getPersistence().countByC_U(companyId, userId);
	}

	/**
	 * Returns the number of dispatch triggers that the user has permission to view where companyId = &#63; and userId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param userId the user ID
	 * @return the number of matching dispatch triggers that the user has permission to view
	 */
	public static int filterCountByC_U(long companyId, long userId) {
		return getPersistence().filterCountByC_U(companyId, userId);
	}

	/**
	 * Returns the dispatch trigger where companyId = &#63; and name = &#63; or throws a <code>NoSuchTriggerException</code> if it could not be found.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @return the matching dispatch trigger
	 * @throws NoSuchTriggerException if a matching dispatch trigger could not be found
	 */
	public static DispatchTrigger findByC_N(long companyId, String name)
		throws com.liferay.dispatch.exception.NoSuchTriggerException {

		return getPersistence().findByC_N(companyId, name);
	}

	/**
	 * Returns the dispatch trigger where companyId = &#63; and name = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @return the matching dispatch trigger, or <code>null</code> if a matching dispatch trigger could not be found
	 */
	public static DispatchTrigger fetchByC_N(long companyId, String name) {
		return getPersistence().fetchByC_N(companyId, name);
	}

	/**
	 * Returns the dispatch trigger where companyId = &#63; and name = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching dispatch trigger, or <code>null</code> if a matching dispatch trigger could not be found
	 */
	public static DispatchTrigger fetchByC_N(
		long companyId, String name, boolean useFinderCache) {

		return getPersistence().fetchByC_N(companyId, name, useFinderCache);
	}

	/**
	 * Removes the dispatch trigger where companyId = &#63; and name = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @return the dispatch trigger that was removed
	 */
	public static DispatchTrigger removeByC_N(long companyId, String name)
		throws com.liferay.dispatch.exception.NoSuchTriggerException {

		return getPersistence().removeByC_N(companyId, name);
	}

	/**
	 * Returns the number of dispatch triggers where companyId = &#63; and name = &#63;.
	 *
	 * @param companyId the company ID
	 * @param name the name
	 * @return the number of matching dispatch triggers
	 */
	public static int countByC_N(long companyId, String name) {
		return getPersistence().countByC_N(companyId, name);
	}

	/**
	 * Returns all the dispatch triggers where companyId = &#63; and taskExecutorType = &#63;.
	 *
	 * @param companyId the company ID
	 * @param taskExecutorType the task executor type
	 * @return the matching dispatch triggers
	 */
	public static List<DispatchTrigger> findByC_TET(
		long companyId, String taskExecutorType) {

		return getPersistence().findByC_TET(companyId, taskExecutorType);
	}

	/**
	 * Returns a range of all the dispatch triggers where companyId = &#63; and taskExecutorType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param taskExecutorType the task executor type
	 * @param start the lower bound of the range of dispatch triggers
	 * @param end the upper bound of the range of dispatch triggers (not inclusive)
	 * @return the range of matching dispatch triggers
	 */
	public static List<DispatchTrigger> findByC_TET(
		long companyId, String taskExecutorType, int start, int end) {

		return getPersistence().findByC_TET(
			companyId, taskExecutorType, start, end);
	}

	/**
	 * Returns an ordered range of all the dispatch triggers where companyId = &#63; and taskExecutorType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param taskExecutorType the task executor type
	 * @param start the lower bound of the range of dispatch triggers
	 * @param end the upper bound of the range of dispatch triggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dispatch triggers
	 */
	public static List<DispatchTrigger> findByC_TET(
		long companyId, String taskExecutorType, int start, int end,
		OrderByComparator<DispatchTrigger> orderByComparator) {

		return getPersistence().findByC_TET(
			companyId, taskExecutorType, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dispatch triggers where companyId = &#63; and taskExecutorType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param taskExecutorType the task executor type
	 * @param start the lower bound of the range of dispatch triggers
	 * @param end the upper bound of the range of dispatch triggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dispatch triggers
	 */
	public static List<DispatchTrigger> findByC_TET(
		long companyId, String taskExecutorType, int start, int end,
		OrderByComparator<DispatchTrigger> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByC_TET(
			companyId, taskExecutorType, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first dispatch trigger in the ordered set where companyId = &#63; and taskExecutorType = &#63;.
	 *
	 * @param companyId the company ID
	 * @param taskExecutorType the task executor type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dispatch trigger
	 * @throws NoSuchTriggerException if a matching dispatch trigger could not be found
	 */
	public static DispatchTrigger findByC_TET_First(
			long companyId, String taskExecutorType,
			OrderByComparator<DispatchTrigger> orderByComparator)
		throws com.liferay.dispatch.exception.NoSuchTriggerException {

		return getPersistence().findByC_TET_First(
			companyId, taskExecutorType, orderByComparator);
	}

	/**
	 * Returns the first dispatch trigger in the ordered set where companyId = &#63; and taskExecutorType = &#63;.
	 *
	 * @param companyId the company ID
	 * @param taskExecutorType the task executor type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dispatch trigger, or <code>null</code> if a matching dispatch trigger could not be found
	 */
	public static DispatchTrigger fetchByC_TET_First(
		long companyId, String taskExecutorType,
		OrderByComparator<DispatchTrigger> orderByComparator) {

		return getPersistence().fetchByC_TET_First(
			companyId, taskExecutorType, orderByComparator);
	}

	/**
	 * Returns the last dispatch trigger in the ordered set where companyId = &#63; and taskExecutorType = &#63;.
	 *
	 * @param companyId the company ID
	 * @param taskExecutorType the task executor type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dispatch trigger
	 * @throws NoSuchTriggerException if a matching dispatch trigger could not be found
	 */
	public static DispatchTrigger findByC_TET_Last(
			long companyId, String taskExecutorType,
			OrderByComparator<DispatchTrigger> orderByComparator)
		throws com.liferay.dispatch.exception.NoSuchTriggerException {

		return getPersistence().findByC_TET_Last(
			companyId, taskExecutorType, orderByComparator);
	}

	/**
	 * Returns the last dispatch trigger in the ordered set where companyId = &#63; and taskExecutorType = &#63;.
	 *
	 * @param companyId the company ID
	 * @param taskExecutorType the task executor type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dispatch trigger, or <code>null</code> if a matching dispatch trigger could not be found
	 */
	public static DispatchTrigger fetchByC_TET_Last(
		long companyId, String taskExecutorType,
		OrderByComparator<DispatchTrigger> orderByComparator) {

		return getPersistence().fetchByC_TET_Last(
			companyId, taskExecutorType, orderByComparator);
	}

	/**
	 * Returns the dispatch triggers before and after the current dispatch trigger in the ordered set where companyId = &#63; and taskExecutorType = &#63;.
	 *
	 * @param dispatchTriggerId the primary key of the current dispatch trigger
	 * @param companyId the company ID
	 * @param taskExecutorType the task executor type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dispatch trigger
	 * @throws NoSuchTriggerException if a dispatch trigger with the primary key could not be found
	 */
	public static DispatchTrigger[] findByC_TET_PrevAndNext(
			long dispatchTriggerId, long companyId, String taskExecutorType,
			OrderByComparator<DispatchTrigger> orderByComparator)
		throws com.liferay.dispatch.exception.NoSuchTriggerException {

		return getPersistence().findByC_TET_PrevAndNext(
			dispatchTriggerId, companyId, taskExecutorType, orderByComparator);
	}

	/**
	 * Returns all the dispatch triggers that the user has permission to view where companyId = &#63; and taskExecutorType = &#63;.
	 *
	 * @param companyId the company ID
	 * @param taskExecutorType the task executor type
	 * @return the matching dispatch triggers that the user has permission to view
	 */
	public static List<DispatchTrigger> filterFindByC_TET(
		long companyId, String taskExecutorType) {

		return getPersistence().filterFindByC_TET(companyId, taskExecutorType);
	}

	/**
	 * Returns a range of all the dispatch triggers that the user has permission to view where companyId = &#63; and taskExecutorType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param taskExecutorType the task executor type
	 * @param start the lower bound of the range of dispatch triggers
	 * @param end the upper bound of the range of dispatch triggers (not inclusive)
	 * @return the range of matching dispatch triggers that the user has permission to view
	 */
	public static List<DispatchTrigger> filterFindByC_TET(
		long companyId, String taskExecutorType, int start, int end) {

		return getPersistence().filterFindByC_TET(
			companyId, taskExecutorType, start, end);
	}

	/**
	 * Returns an ordered range of all the dispatch triggers that the user has permissions to view where companyId = &#63; and taskExecutorType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param taskExecutorType the task executor type
	 * @param start the lower bound of the range of dispatch triggers
	 * @param end the upper bound of the range of dispatch triggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dispatch triggers that the user has permission to view
	 */
	public static List<DispatchTrigger> filterFindByC_TET(
		long companyId, String taskExecutorType, int start, int end,
		OrderByComparator<DispatchTrigger> orderByComparator) {

		return getPersistence().filterFindByC_TET(
			companyId, taskExecutorType, start, end, orderByComparator);
	}

	/**
	 * Returns the dispatch triggers before and after the current dispatch trigger in the ordered set of dispatch triggers that the user has permission to view where companyId = &#63; and taskExecutorType = &#63;.
	 *
	 * @param dispatchTriggerId the primary key of the current dispatch trigger
	 * @param companyId the company ID
	 * @param taskExecutorType the task executor type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dispatch trigger
	 * @throws NoSuchTriggerException if a dispatch trigger with the primary key could not be found
	 */
	public static DispatchTrigger[] filterFindByC_TET_PrevAndNext(
			long dispatchTriggerId, long companyId, String taskExecutorType,
			OrderByComparator<DispatchTrigger> orderByComparator)
		throws com.liferay.dispatch.exception.NoSuchTriggerException {

		return getPersistence().filterFindByC_TET_PrevAndNext(
			dispatchTriggerId, companyId, taskExecutorType, orderByComparator);
	}

	/**
	 * Removes all the dispatch triggers where companyId = &#63; and taskExecutorType = &#63; from the database.
	 *
	 * @param companyId the company ID
	 * @param taskExecutorType the task executor type
	 */
	public static void removeByC_TET(long companyId, String taskExecutorType) {
		getPersistence().removeByC_TET(companyId, taskExecutorType);
	}

	/**
	 * Returns the number of dispatch triggers where companyId = &#63; and taskExecutorType = &#63;.
	 *
	 * @param companyId the company ID
	 * @param taskExecutorType the task executor type
	 * @return the number of matching dispatch triggers
	 */
	public static int countByC_TET(long companyId, String taskExecutorType) {
		return getPersistence().countByC_TET(companyId, taskExecutorType);
	}

	/**
	 * Returns the number of dispatch triggers that the user has permission to view where companyId = &#63; and taskExecutorType = &#63;.
	 *
	 * @param companyId the company ID
	 * @param taskExecutorType the task executor type
	 * @return the number of matching dispatch triggers that the user has permission to view
	 */
	public static int filterCountByC_TET(
		long companyId, String taskExecutorType) {

		return getPersistence().filterCountByC_TET(companyId, taskExecutorType);
	}

	/**
	 * Returns all the dispatch triggers where active = &#63; and taskClusterMode = &#63;.
	 *
	 * @param active the active
	 * @param taskClusterMode the task cluster mode
	 * @return the matching dispatch triggers
	 */
	public static List<DispatchTrigger> findByA_TCM(
		boolean active, int taskClusterMode) {

		return getPersistence().findByA_TCM(active, taskClusterMode);
	}

	/**
	 * Returns a range of all the dispatch triggers where active = &#63; and taskClusterMode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param active the active
	 * @param taskClusterMode the task cluster mode
	 * @param start the lower bound of the range of dispatch triggers
	 * @param end the upper bound of the range of dispatch triggers (not inclusive)
	 * @return the range of matching dispatch triggers
	 */
	public static List<DispatchTrigger> findByA_TCM(
		boolean active, int taskClusterMode, int start, int end) {

		return getPersistence().findByA_TCM(
			active, taskClusterMode, start, end);
	}

	/**
	 * Returns an ordered range of all the dispatch triggers where active = &#63; and taskClusterMode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param active the active
	 * @param taskClusterMode the task cluster mode
	 * @param start the lower bound of the range of dispatch triggers
	 * @param end the upper bound of the range of dispatch triggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dispatch triggers
	 */
	public static List<DispatchTrigger> findByA_TCM(
		boolean active, int taskClusterMode, int start, int end,
		OrderByComparator<DispatchTrigger> orderByComparator) {

		return getPersistence().findByA_TCM(
			active, taskClusterMode, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dispatch triggers where active = &#63; and taskClusterMode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param active the active
	 * @param taskClusterMode the task cluster mode
	 * @param start the lower bound of the range of dispatch triggers
	 * @param end the upper bound of the range of dispatch triggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dispatch triggers
	 */
	public static List<DispatchTrigger> findByA_TCM(
		boolean active, int taskClusterMode, int start, int end,
		OrderByComparator<DispatchTrigger> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByA_TCM(
			active, taskClusterMode, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Returns the first dispatch trigger in the ordered set where active = &#63; and taskClusterMode = &#63;.
	 *
	 * @param active the active
	 * @param taskClusterMode the task cluster mode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dispatch trigger
	 * @throws NoSuchTriggerException if a matching dispatch trigger could not be found
	 */
	public static DispatchTrigger findByA_TCM_First(
			boolean active, int taskClusterMode,
			OrderByComparator<DispatchTrigger> orderByComparator)
		throws com.liferay.dispatch.exception.NoSuchTriggerException {

		return getPersistence().findByA_TCM_First(
			active, taskClusterMode, orderByComparator);
	}

	/**
	 * Returns the first dispatch trigger in the ordered set where active = &#63; and taskClusterMode = &#63;.
	 *
	 * @param active the active
	 * @param taskClusterMode the task cluster mode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching dispatch trigger, or <code>null</code> if a matching dispatch trigger could not be found
	 */
	public static DispatchTrigger fetchByA_TCM_First(
		boolean active, int taskClusterMode,
		OrderByComparator<DispatchTrigger> orderByComparator) {

		return getPersistence().fetchByA_TCM_First(
			active, taskClusterMode, orderByComparator);
	}

	/**
	 * Returns the last dispatch trigger in the ordered set where active = &#63; and taskClusterMode = &#63;.
	 *
	 * @param active the active
	 * @param taskClusterMode the task cluster mode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dispatch trigger
	 * @throws NoSuchTriggerException if a matching dispatch trigger could not be found
	 */
	public static DispatchTrigger findByA_TCM_Last(
			boolean active, int taskClusterMode,
			OrderByComparator<DispatchTrigger> orderByComparator)
		throws com.liferay.dispatch.exception.NoSuchTriggerException {

		return getPersistence().findByA_TCM_Last(
			active, taskClusterMode, orderByComparator);
	}

	/**
	 * Returns the last dispatch trigger in the ordered set where active = &#63; and taskClusterMode = &#63;.
	 *
	 * @param active the active
	 * @param taskClusterMode the task cluster mode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching dispatch trigger, or <code>null</code> if a matching dispatch trigger could not be found
	 */
	public static DispatchTrigger fetchByA_TCM_Last(
		boolean active, int taskClusterMode,
		OrderByComparator<DispatchTrigger> orderByComparator) {

		return getPersistence().fetchByA_TCM_Last(
			active, taskClusterMode, orderByComparator);
	}

	/**
	 * Returns the dispatch triggers before and after the current dispatch trigger in the ordered set where active = &#63; and taskClusterMode = &#63;.
	 *
	 * @param dispatchTriggerId the primary key of the current dispatch trigger
	 * @param active the active
	 * @param taskClusterMode the task cluster mode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dispatch trigger
	 * @throws NoSuchTriggerException if a dispatch trigger with the primary key could not be found
	 */
	public static DispatchTrigger[] findByA_TCM_PrevAndNext(
			long dispatchTriggerId, boolean active, int taskClusterMode,
			OrderByComparator<DispatchTrigger> orderByComparator)
		throws com.liferay.dispatch.exception.NoSuchTriggerException {

		return getPersistence().findByA_TCM_PrevAndNext(
			dispatchTriggerId, active, taskClusterMode, orderByComparator);
	}

	/**
	 * Returns all the dispatch triggers that the user has permission to view where active = &#63; and taskClusterMode = &#63;.
	 *
	 * @param active the active
	 * @param taskClusterMode the task cluster mode
	 * @return the matching dispatch triggers that the user has permission to view
	 */
	public static List<DispatchTrigger> filterFindByA_TCM(
		boolean active, int taskClusterMode) {

		return getPersistence().filterFindByA_TCM(active, taskClusterMode);
	}

	/**
	 * Returns a range of all the dispatch triggers that the user has permission to view where active = &#63; and taskClusterMode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param active the active
	 * @param taskClusterMode the task cluster mode
	 * @param start the lower bound of the range of dispatch triggers
	 * @param end the upper bound of the range of dispatch triggers (not inclusive)
	 * @return the range of matching dispatch triggers that the user has permission to view
	 */
	public static List<DispatchTrigger> filterFindByA_TCM(
		boolean active, int taskClusterMode, int start, int end) {

		return getPersistence().filterFindByA_TCM(
			active, taskClusterMode, start, end);
	}

	/**
	 * Returns an ordered range of all the dispatch triggers that the user has permissions to view where active = &#63; and taskClusterMode = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param active the active
	 * @param taskClusterMode the task cluster mode
	 * @param start the lower bound of the range of dispatch triggers
	 * @param end the upper bound of the range of dispatch triggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dispatch triggers that the user has permission to view
	 */
	public static List<DispatchTrigger> filterFindByA_TCM(
		boolean active, int taskClusterMode, int start, int end,
		OrderByComparator<DispatchTrigger> orderByComparator) {

		return getPersistence().filterFindByA_TCM(
			active, taskClusterMode, start, end, orderByComparator);
	}

	/**
	 * Returns the dispatch triggers before and after the current dispatch trigger in the ordered set of dispatch triggers that the user has permission to view where active = &#63; and taskClusterMode = &#63;.
	 *
	 * @param dispatchTriggerId the primary key of the current dispatch trigger
	 * @param active the active
	 * @param taskClusterMode the task cluster mode
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next dispatch trigger
	 * @throws NoSuchTriggerException if a dispatch trigger with the primary key could not be found
	 */
	public static DispatchTrigger[] filterFindByA_TCM_PrevAndNext(
			long dispatchTriggerId, boolean active, int taskClusterMode,
			OrderByComparator<DispatchTrigger> orderByComparator)
		throws com.liferay.dispatch.exception.NoSuchTriggerException {

		return getPersistence().filterFindByA_TCM_PrevAndNext(
			dispatchTriggerId, active, taskClusterMode, orderByComparator);
	}

	/**
	 * Returns all the dispatch triggers that the user has permission to view where active = &#63; and taskClusterMode = any &#63;.
	 *
	 * @param active the active
	 * @param taskClusterModes the task cluster modes
	 * @return the matching dispatch triggers that the user has permission to view
	 */
	public static List<DispatchTrigger> filterFindByA_TCM(
		boolean active, int[] taskClusterModes) {

		return getPersistence().filterFindByA_TCM(active, taskClusterModes);
	}

	/**
	 * Returns a range of all the dispatch triggers that the user has permission to view where active = &#63; and taskClusterMode = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param active the active
	 * @param taskClusterModes the task cluster modes
	 * @param start the lower bound of the range of dispatch triggers
	 * @param end the upper bound of the range of dispatch triggers (not inclusive)
	 * @return the range of matching dispatch triggers that the user has permission to view
	 */
	public static List<DispatchTrigger> filterFindByA_TCM(
		boolean active, int[] taskClusterModes, int start, int end) {

		return getPersistence().filterFindByA_TCM(
			active, taskClusterModes, start, end);
	}

	/**
	 * Returns an ordered range of all the dispatch triggers that the user has permission to view where active = &#63; and taskClusterMode = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param active the active
	 * @param taskClusterModes the task cluster modes
	 * @param start the lower bound of the range of dispatch triggers
	 * @param end the upper bound of the range of dispatch triggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dispatch triggers that the user has permission to view
	 */
	public static List<DispatchTrigger> filterFindByA_TCM(
		boolean active, int[] taskClusterModes, int start, int end,
		OrderByComparator<DispatchTrigger> orderByComparator) {

		return getPersistence().filterFindByA_TCM(
			active, taskClusterModes, start, end, orderByComparator);
	}

	/**
	 * Returns all the dispatch triggers where active = &#63; and taskClusterMode = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param active the active
	 * @param taskClusterModes the task cluster modes
	 * @return the matching dispatch triggers
	 */
	public static List<DispatchTrigger> findByA_TCM(
		boolean active, int[] taskClusterModes) {

		return getPersistence().findByA_TCM(active, taskClusterModes);
	}

	/**
	 * Returns a range of all the dispatch triggers where active = &#63; and taskClusterMode = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param active the active
	 * @param taskClusterModes the task cluster modes
	 * @param start the lower bound of the range of dispatch triggers
	 * @param end the upper bound of the range of dispatch triggers (not inclusive)
	 * @return the range of matching dispatch triggers
	 */
	public static List<DispatchTrigger> findByA_TCM(
		boolean active, int[] taskClusterModes, int start, int end) {

		return getPersistence().findByA_TCM(
			active, taskClusterModes, start, end);
	}

	/**
	 * Returns an ordered range of all the dispatch triggers where active = &#63; and taskClusterMode = any &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param active the active
	 * @param taskClusterModes the task cluster modes
	 * @param start the lower bound of the range of dispatch triggers
	 * @param end the upper bound of the range of dispatch triggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching dispatch triggers
	 */
	public static List<DispatchTrigger> findByA_TCM(
		boolean active, int[] taskClusterModes, int start, int end,
		OrderByComparator<DispatchTrigger> orderByComparator) {

		return getPersistence().findByA_TCM(
			active, taskClusterModes, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dispatch triggers where active = &#63; and taskClusterMode = &#63;, optionally using the finder cache.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param active the active
	 * @param taskClusterMode the task cluster mode
	 * @param start the lower bound of the range of dispatch triggers
	 * @param end the upper bound of the range of dispatch triggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching dispatch triggers
	 */
	public static List<DispatchTrigger> findByA_TCM(
		boolean active, int[] taskClusterModes, int start, int end,
		OrderByComparator<DispatchTrigger> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByA_TCM(
			active, taskClusterModes, start, end, orderByComparator,
			useFinderCache);
	}

	/**
	 * Removes all the dispatch triggers where active = &#63; and taskClusterMode = &#63; from the database.
	 *
	 * @param active the active
	 * @param taskClusterMode the task cluster mode
	 */
	public static void removeByA_TCM(boolean active, int taskClusterMode) {
		getPersistence().removeByA_TCM(active, taskClusterMode);
	}

	/**
	 * Returns the number of dispatch triggers where active = &#63; and taskClusterMode = &#63;.
	 *
	 * @param active the active
	 * @param taskClusterMode the task cluster mode
	 * @return the number of matching dispatch triggers
	 */
	public static int countByA_TCM(boolean active, int taskClusterMode) {
		return getPersistence().countByA_TCM(active, taskClusterMode);
	}

	/**
	 * Returns the number of dispatch triggers where active = &#63; and taskClusterMode = any &#63;.
	 *
	 * @param active the active
	 * @param taskClusterModes the task cluster modes
	 * @return the number of matching dispatch triggers
	 */
	public static int countByA_TCM(boolean active, int[] taskClusterModes) {
		return getPersistence().countByA_TCM(active, taskClusterModes);
	}

	/**
	 * Returns the number of dispatch triggers that the user has permission to view where active = &#63; and taskClusterMode = &#63;.
	 *
	 * @param active the active
	 * @param taskClusterMode the task cluster mode
	 * @return the number of matching dispatch triggers that the user has permission to view
	 */
	public static int filterCountByA_TCM(boolean active, int taskClusterMode) {
		return getPersistence().filterCountByA_TCM(active, taskClusterMode);
	}

	/**
	 * Returns the number of dispatch triggers that the user has permission to view where active = &#63; and taskClusterMode = any &#63;.
	 *
	 * @param active the active
	 * @param taskClusterModes the task cluster modes
	 * @return the number of matching dispatch triggers that the user has permission to view
	 */
	public static int filterCountByA_TCM(
		boolean active, int[] taskClusterModes) {

		return getPersistence().filterCountByA_TCM(active, taskClusterModes);
	}

	/**
	 * Caches the dispatch trigger in the entity cache if it is enabled.
	 *
	 * @param dispatchTrigger the dispatch trigger
	 */
	public static void cacheResult(DispatchTrigger dispatchTrigger) {
		getPersistence().cacheResult(dispatchTrigger);
	}

	/**
	 * Caches the dispatch triggers in the entity cache if it is enabled.
	 *
	 * @param dispatchTriggers the dispatch triggers
	 */
	public static void cacheResult(List<DispatchTrigger> dispatchTriggers) {
		getPersistence().cacheResult(dispatchTriggers);
	}

	/**
	 * Creates a new dispatch trigger with the primary key. Does not add the dispatch trigger to the database.
	 *
	 * @param dispatchTriggerId the primary key for the new dispatch trigger
	 * @return the new dispatch trigger
	 */
	public static DispatchTrigger create(long dispatchTriggerId) {
		return getPersistence().create(dispatchTriggerId);
	}

	/**
	 * Removes the dispatch trigger with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dispatchTriggerId the primary key of the dispatch trigger
	 * @return the dispatch trigger that was removed
	 * @throws NoSuchTriggerException if a dispatch trigger with the primary key could not be found
	 */
	public static DispatchTrigger remove(long dispatchTriggerId)
		throws com.liferay.dispatch.exception.NoSuchTriggerException {

		return getPersistence().remove(dispatchTriggerId);
	}

	public static DispatchTrigger updateImpl(DispatchTrigger dispatchTrigger) {
		return getPersistence().updateImpl(dispatchTrigger);
	}

	/**
	 * Returns the dispatch trigger with the primary key or throws a <code>NoSuchTriggerException</code> if it could not be found.
	 *
	 * @param dispatchTriggerId the primary key of the dispatch trigger
	 * @return the dispatch trigger
	 * @throws NoSuchTriggerException if a dispatch trigger with the primary key could not be found
	 */
	public static DispatchTrigger findByPrimaryKey(long dispatchTriggerId)
		throws com.liferay.dispatch.exception.NoSuchTriggerException {

		return getPersistence().findByPrimaryKey(dispatchTriggerId);
	}

	/**
	 * Returns the dispatch trigger with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param dispatchTriggerId the primary key of the dispatch trigger
	 * @return the dispatch trigger, or <code>null</code> if a dispatch trigger with the primary key could not be found
	 */
	public static DispatchTrigger fetchByPrimaryKey(long dispatchTriggerId) {
		return getPersistence().fetchByPrimaryKey(dispatchTriggerId);
	}

	/**
	 * Returns all the dispatch triggers.
	 *
	 * @return the dispatch triggers
	 */
	public static List<DispatchTrigger> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the dispatch triggers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dispatch triggers
	 * @param end the upper bound of the range of dispatch triggers (not inclusive)
	 * @return the range of dispatch triggers
	 */
	public static List<DispatchTrigger> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the dispatch triggers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dispatch triggers
	 * @param end the upper bound of the range of dispatch triggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of dispatch triggers
	 */
	public static List<DispatchTrigger> findAll(
		int start, int end,
		OrderByComparator<DispatchTrigger> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the dispatch triggers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DispatchTriggerModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of dispatch triggers
	 * @param end the upper bound of the range of dispatch triggers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of dispatch triggers
	 */
	public static List<DispatchTrigger> findAll(
		int start, int end,
		OrderByComparator<DispatchTrigger> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the dispatch triggers from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of dispatch triggers.
	 *
	 * @return the number of dispatch triggers
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static DispatchTriggerPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<DispatchTriggerPersistence, DispatchTriggerPersistence>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			DispatchTriggerPersistence.class);

		ServiceTracker<DispatchTriggerPersistence, DispatchTriggerPersistence>
			serviceTracker =
				new ServiceTracker
					<DispatchTriggerPersistence, DispatchTriggerPersistence>(
						bundle.getBundleContext(),
						DispatchTriggerPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}