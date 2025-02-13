/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * The contents of this file are subject to the terms of the Liferay Enterprise
 * Subscription License ("License"). You may not use this file except in
 * compliance with the License. You can obtain a copy of the License by
 * contacting Liferay, Inc. See the License for the specific language governing
 * permissions and limitations under the License, including but not limited to
 * distribution rights of the Software.
 *
 *
 *
 */

package com.liferay.commerce.data.integration.service;

import com.liferay.portal.kernel.exception.PortalException;

import java.io.IOException;

/**
 * @author guywandji
 * @author Alessio Antonio Rendina
 */
public interface ScheduledTaskExecutorService {

	/**
	 * This method returns the name of the process type
	 */
	public String getName();

	/**
	 * This method execute the selected process
	 *
	 * @param commerceDataIntegrationProcessId
	 * @throws IOException
	 * @throws PortalException
	 */
	public void runProcess(long commerceDataIntegrationProcessId)
		throws IOException, PortalException;

}