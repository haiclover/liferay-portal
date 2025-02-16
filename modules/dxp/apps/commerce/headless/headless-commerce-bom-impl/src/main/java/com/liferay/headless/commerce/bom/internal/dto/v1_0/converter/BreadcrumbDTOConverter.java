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

package com.liferay.headless.commerce.bom.internal.dto.v1_0.converter;

import com.liferay.commerce.bom.model.CommerceBOMFolder;
import com.liferay.commerce.bom.service.CommerceBOMFolderService;
import com.liferay.headless.commerce.bom.dto.v1_0.Breadcrumb;
import com.liferay.portal.vulcan.dto.converter.DTOConverter;
import com.liferay.portal.vulcan.dto.converter.DTOConverterContext;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Alessio Antonio Rendina
 */
@Component(
	enabled = false, property = "model.class.name=breadcrumb",
	service = {BreadcrumbDTOConverter.class, DTOConverter.class}
)
public class BreadcrumbDTOConverter
	implements DTOConverter<CommerceBOMFolder, Breadcrumb> {

	@Override
	public String getContentType() {
		return Breadcrumb.class.getSimpleName();
	}

	@Override
	public Breadcrumb toDTO(DTOConverterContext dtoConverterContext)
		throws Exception {

		CommerceBOMFolder commerceBOMFolder =
			_commerceBOMFolderService.getCommerceBOMFolder(
				(Long)dtoConverterContext.getId());

		return new Breadcrumb() {
			{
				label = commerceBOMFolder.getName();
				url = "/folders/" + commerceBOMFolder.getCommerceBOMFolderId();
			}
		};
	}

	@Reference
	private CommerceBOMFolderService _commerceBOMFolderService;

}