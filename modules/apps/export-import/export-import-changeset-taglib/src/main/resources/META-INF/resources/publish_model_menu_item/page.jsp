<%--
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
--%>

<%@ include file="/publish_model_menu_item/init.jsp" %>

<c:if test="<%= GroupPermissionUtil.contains(permissionChecker, themeDisplay.getScopeGroup(), ActionKeys.EXPORT_IMPORT_PORTLET_INFO) && showMenuItem %>">

	<%
	PortletURL portletURL = PortletURLFactoryUtil.create(request, ChangesetPortletKeys.CHANGESET, PortletRequest.ACTION_PHASE);

	portletURL.setParameter(ActionRequest.ACTION_NAME, "/export_import_changeset/export_import_changeset");
	portletURL.setParameter("mvcRenderCommandName", "/export_import_changeset/export_import_changeset");
	portletURL.setParameter("cmd", Constants.PUBLISH);
	portletURL.setParameter("backURL", currentURL);
	portletURL.setParameter("changesetUuid", changesetUuid);
	portletURL.setParameter("portletId", portletDisplay.getId());
	%>

	<liferay-ui:icon
		message="publish-to-live"
		url="<%= portletURL.toString() %>"
	/>
</c:if>