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

package com.liferay.portal.kernel.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.change.tracking.CTModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the PortletPreferenceValue service. Represents a row in the &quot;PortletPreferenceValue&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.liferay.portal.model.impl.PortletPreferenceValueModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.liferay.portal.model.impl.PortletPreferenceValueImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PortletPreferenceValue
 * @generated
 */
@ProviderType
public interface PortletPreferenceValueModel
	extends BaseModel<PortletPreferenceValue>, CTModel<PortletPreferenceValue>,
			MVCCModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a portlet preference value model instance should use the {@link PortletPreferenceValue} interface instead.
	 */

	/**
	 * Returns the primary key of this portlet preference value.
	 *
	 * @return the primary key of this portlet preference value
	 */
	@Override
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this portlet preference value.
	 *
	 * @param primaryKey the primary key of this portlet preference value
	 */
	@Override
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the mvcc version of this portlet preference value.
	 *
	 * @return the mvcc version of this portlet preference value
	 */
	@Override
	public long getMvccVersion();

	/**
	 * Sets the mvcc version of this portlet preference value.
	 *
	 * @param mvccVersion the mvcc version of this portlet preference value
	 */
	@Override
	public void setMvccVersion(long mvccVersion);

	/**
	 * Returns the ct collection ID of this portlet preference value.
	 *
	 * @return the ct collection ID of this portlet preference value
	 */
	@Override
	public long getCtCollectionId();

	/**
	 * Sets the ct collection ID of this portlet preference value.
	 *
	 * @param ctCollectionId the ct collection ID of this portlet preference value
	 */
	@Override
	public void setCtCollectionId(long ctCollectionId);

	/**
	 * Returns the portlet preference value ID of this portlet preference value.
	 *
	 * @return the portlet preference value ID of this portlet preference value
	 */
	public long getPortletPreferenceValueId();

	/**
	 * Sets the portlet preference value ID of this portlet preference value.
	 *
	 * @param portletPreferenceValueId the portlet preference value ID of this portlet preference value
	 */
	public void setPortletPreferenceValueId(long portletPreferenceValueId);

	/**
	 * Returns the company ID of this portlet preference value.
	 *
	 * @return the company ID of this portlet preference value
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this portlet preference value.
	 *
	 * @param companyId the company ID of this portlet preference value
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the portlet preferences ID of this portlet preference value.
	 *
	 * @return the portlet preferences ID of this portlet preference value
	 */
	public long getPortletPreferencesId();

	/**
	 * Sets the portlet preferences ID of this portlet preference value.
	 *
	 * @param portletPreferencesId the portlet preferences ID of this portlet preference value
	 */
	public void setPortletPreferencesId(long portletPreferencesId);

	/**
	 * Returns the index of this portlet preference value.
	 *
	 * @return the index of this portlet preference value
	 */
	public int getIndex();

	/**
	 * Sets the index of this portlet preference value.
	 *
	 * @param index the index of this portlet preference value
	 */
	public void setIndex(int index);

	/**
	 * Returns the large value of this portlet preference value.
	 *
	 * @return the large value of this portlet preference value
	 */
	@AutoEscape
	public String getLargeValue();

	/**
	 * Sets the large value of this portlet preference value.
	 *
	 * @param largeValue the large value of this portlet preference value
	 */
	public void setLargeValue(String largeValue);

	/**
	 * Returns the name of this portlet preference value.
	 *
	 * @return the name of this portlet preference value
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this portlet preference value.
	 *
	 * @param name the name of this portlet preference value
	 */
	public void setName(String name);

	/**
	 * Returns the read only of this portlet preference value.
	 *
	 * @return the read only of this portlet preference value
	 */
	public boolean getReadOnly();

	/**
	 * Returns <code>true</code> if this portlet preference value is read only.
	 *
	 * @return <code>true</code> if this portlet preference value is read only; <code>false</code> otherwise
	 */
	public boolean isReadOnly();

	/**
	 * Sets whether this portlet preference value is read only.
	 *
	 * @param readOnly the read only of this portlet preference value
	 */
	public void setReadOnly(boolean readOnly);

	/**
	 * Returns the small value of this portlet preference value.
	 *
	 * @return the small value of this portlet preference value
	 */
	@AutoEscape
	public String getSmallValue();

	/**
	 * Sets the small value of this portlet preference value.
	 *
	 * @param smallValue the small value of this portlet preference value
	 */
	public void setSmallValue(String smallValue);

}