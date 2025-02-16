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

package com.liferay.commerce.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for CommerceSubscriptionEntry. This utility wraps
 * <code>com.liferay.commerce.service.impl.CommerceSubscriptionEntryServiceImpl</code> and is an
 * access point for service operations in application layer code running on a
 * remote server. Methods of this service are expected to have security checks
 * based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Alessio Antonio Rendina
 * @see CommerceSubscriptionEntryService
 * @generated
 */
public class CommerceSubscriptionEntryServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.liferay.commerce.service.impl.CommerceSubscriptionEntryServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static void deleteCommerceSubscriptionEntry(
			long commerceSubscriptionEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		getService().deleteCommerceSubscriptionEntry(
			commerceSubscriptionEntryId);
	}

	public static com.liferay.commerce.model.CommerceSubscriptionEntry
			fetchCommerceSubscriptionEntry(long commerceSubscriptionEntryId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().fetchCommerceSubscriptionEntry(
			commerceSubscriptionEntryId);
	}

	/**
	 * @deprecated As of Athanasius (7.3.x)
	 */
	@Deprecated
	public static java.util.List
		<com.liferay.commerce.model.CommerceSubscriptionEntry>
				getCommerceSubscriptionEntries(
					long companyId, long userId, int start, int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.liferay.commerce.model.CommerceSubscriptionEntry>
							orderByComparator)
			throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getCommerceSubscriptionEntries(
			companyId, userId, start, end, orderByComparator);
	}

	public static java.util.List
		<com.liferay.commerce.model.CommerceSubscriptionEntry>
				getCommerceSubscriptionEntries(
					long companyId, long groupId, long userId, int start,
					int end,
					com.liferay.portal.kernel.util.OrderByComparator
						<com.liferay.commerce.model.CommerceSubscriptionEntry>
							orderByComparator)
			throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getCommerceSubscriptionEntries(
			companyId, groupId, userId, start, end, orderByComparator);
	}

	/**
	 * @deprecated As of Athanasius (7.3.x)
	 */
	@Deprecated
	public static int getCommerceSubscriptionEntriesCount(
			long companyId, long userId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getCommerceSubscriptionEntriesCount(
			companyId, userId);
	}

	public static int getCommerceSubscriptionEntriesCount(
			long companyId, long groupId, long userId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getCommerceSubscriptionEntriesCount(
			companyId, groupId, userId);
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.search.BaseModelSearchResult
		<com.liferay.commerce.model.CommerceSubscriptionEntry>
				searchCommerceSubscriptionEntries(
					long companyId, Long maxSubscriptionCycles,
					Integer subscriptionStatus, String keywords, int start,
					int end, com.liferay.portal.kernel.search.Sort sort)
			throws com.liferay.portal.kernel.exception.PortalException {

		return getService().searchCommerceSubscriptionEntries(
			companyId, maxSubscriptionCycles, subscriptionStatus, keywords,
			start, end, sort);
	}

	/**
	 * @deprecated As of Athanasius (7.3.x)
	 */
	@Deprecated
	public static com.liferay.portal.kernel.search.BaseModelSearchResult
		<com.liferay.commerce.model.CommerceSubscriptionEntry>
				searchCommerceSubscriptionEntries(
					long companyId, long[] groupIds, Long maxSubscriptionCycles,
					Integer subscriptionStatus, String keywords, int start,
					int end, com.liferay.portal.kernel.search.Sort sort)
			throws com.liferay.portal.kernel.exception.PortalException {

		return getService().searchCommerceSubscriptionEntries(
			companyId, groupIds, maxSubscriptionCycles, subscriptionStatus,
			keywords, start, end, sort);
	}

	public static com.liferay.commerce.model.CommerceSubscriptionEntry
			updateCommerceSubscriptionEntry(
				long commerceSubscriptionEntryId, int subscriptionLength,
				String subscriptionType,
				com.liferay.portal.kernel.util.UnicodeProperties
					subscriptionTypeSettingsUnicodeProperties,
				long maxSubscriptionCycles, int subscriptionStatus,
				int nextIterationDateMonth, int nextIterationDateDay,
				int nextIterationDateYear, int nextIterationDateHour,
				int nextIterationDateMinute, int deliverySubscriptionLength,
				String deliverySubscriptionType,
				com.liferay.portal.kernel.util.UnicodeProperties
					deliverySubscriptionTypeSettingsUnicodeProperties,
				long deliveryMaxSubscriptionCycles,
				int deliverySubscriptionStatus,
				int deliveryNextIterationDateMonth,
				int deliveryNextIterationDateDay,
				int deliveryNextIterationDateYear,
				int deliveryNextIterationDateHour,
				int deliveryNextIterationDateMinute)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateCommerceSubscriptionEntry(
			commerceSubscriptionEntryId, subscriptionLength, subscriptionType,
			subscriptionTypeSettingsUnicodeProperties, maxSubscriptionCycles,
			subscriptionStatus, nextIterationDateMonth, nextIterationDateDay,
			nextIterationDateYear, nextIterationDateHour,
			nextIterationDateMinute, deliverySubscriptionLength,
			deliverySubscriptionType,
			deliverySubscriptionTypeSettingsUnicodeProperties,
			deliveryMaxSubscriptionCycles, deliverySubscriptionStatus,
			deliveryNextIterationDateMonth, deliveryNextIterationDateDay,
			deliveryNextIterationDateYear, deliveryNextIterationDateHour,
			deliveryNextIterationDateMinute);
	}

	/**
	 * @deprecated As of Athanasius (7.3.x)
	 */
	@Deprecated
	public static com.liferay.commerce.model.CommerceSubscriptionEntry
			updateSubscriptionStatus(
				long commerceSubscriptionEntryId, int subscriptionStatus)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateSubscriptionStatus(
			commerceSubscriptionEntryId, subscriptionStatus);
	}

	public static CommerceSubscriptionEntryService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<CommerceSubscriptionEntryService, CommerceSubscriptionEntryService>
			_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			CommerceSubscriptionEntryService.class);

		ServiceTracker
			<CommerceSubscriptionEntryService, CommerceSubscriptionEntryService>
				serviceTracker =
					new ServiceTracker
						<CommerceSubscriptionEntryService,
						 CommerceSubscriptionEntryService>(
							 bundle.getBundleContext(),
							 CommerceSubscriptionEntryService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}