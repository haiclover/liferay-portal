/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.liferay.portal.template;

import com.liferay.portal.kernel.io.unsync.UnsyncCharArrayWriter;
import com.liferay.portal.kernel.io.unsync.UnsyncStringReader;
import com.liferay.portal.kernel.template.TemplateResource;

import java.io.IOException;
import java.io.Reader;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author Tina Tian
 */
public class CacheTemplateResource implements TemplateResource {

	public CacheTemplateResource(TemplateResource templateResource) {
		if (templateResource == null) {
			throw new IllegalArgumentException("Template resource is null");
		}

		_templateResource = templateResource;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CacheTemplateResource)) {
			return false;
		}

		CacheTemplateResource cacheTemplateResource =
			(CacheTemplateResource)obj;

		if (_templateResource.equals(cacheTemplateResource._templateResource)) {
			return true;
		}

		return false;
	}

	public long getLastModified() {
		return _lastModified;
	}

	public Reader getReader() throws IOException {
		String templateContent = _templateContent.get();

		if (templateContent != null) {
			return new UnsyncStringReader(templateContent);
		}

		Reader reader = null;
		UnsyncCharArrayWriter unsyncCharArrayWriter = null;

		try {
			reader = _templateResource.getReader();

			char[] buffer = new char[1024];

			int result = -1;

			unsyncCharArrayWriter = new UnsyncCharArrayWriter();

			while ((result = reader.read(buffer)) != -1) {
				unsyncCharArrayWriter.write(buffer, 0, result);
			}

			templateContent = unsyncCharArrayWriter.toString();

			_templateContent.set(templateContent);
		}
		finally {
			if (reader != null) {
				reader.close();
			}

			if (unsyncCharArrayWriter != null) {
				unsyncCharArrayWriter.close();
			}
		}

		return new UnsyncStringReader(templateContent);
	}

	public String getTemplateId() {
		return _templateResource.getTemplateId();
	}

	@Override
	public int hashCode() {
		return _templateResource.hashCode();
	}

	private long _lastModified = System.currentTimeMillis();
	private AtomicReference<String> _templateContent =
		new AtomicReference<String>();
	private TemplateResource _templateResource;

}