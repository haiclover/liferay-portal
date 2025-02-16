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

<%@ include file="/init.jsp" %>

<%
CPAttachmentFileEntriesDisplayContext cpAttachmentFileEntriesDisplayContext = (CPAttachmentFileEntriesDisplayContext)request.getAttribute(WebKeys.PORTLET_DISPLAY_CONTEXT);

CPAttachmentFileEntry cpAttachmentFileEntry = cpAttachmentFileEntriesDisplayContext.getCPAttachmentFileEntry();
long cpAttachmentFileEntryId = cpAttachmentFileEntriesDisplayContext.getCPAttachmentFileEntryId();
long cpDefinitionId = cpAttachmentFileEntriesDisplayContext.getCPDefinitionId();

int type = CPAttachmentFileEntryConstants.TYPE_IMAGE;

String title = (cpAttachmentFileEntry == null) ? LanguageUtil.get(request, "add-image") : LanguageUtil.format(request, "id-x", String.valueOf(cpAttachmentFileEntry.getCPAttachmentFileEntryId()), false);
%>

<%@ include file="/edit_attachment_file_entry.jspf" %>