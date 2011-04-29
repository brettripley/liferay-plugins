/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.hr.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the HRAssetModelId service. Represents a row in the &quot;HRAssetModelId&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.hr.model.impl.HRAssetModelIdModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.hr.model.impl.HRAssetModelIdImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HRAssetModelId
 * @see com.liferay.hr.model.impl.HRAssetModelIdImpl
 * @see com.liferay.hr.model.impl.HRAssetModelIdModelImpl
 * @generated
 */
public interface HRAssetModelIdModel extends BaseModel<HRAssetModelId>,
	GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a h r asset model ID model instance should use the {@link HRAssetModelId} interface instead.
	 */

	/**
	 * Gets the primary key of this h r asset model ID.
	 *
	 * @return the primary key of this h r asset model ID
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this h r asset model ID
	 *
	 * @param pk the primary key of this h r asset model ID
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the hr asset model ID of this h r asset model ID.
	 *
	 * @return the hr asset model ID of this h r asset model ID
	 */
	public long getHrAssetModelId();

	/**
	 * Sets the hr asset model ID of this h r asset model ID.
	 *
	 * @param hrAssetModelId the hr asset model ID of this h r asset model ID
	 */
	public void setHrAssetModelId(long hrAssetModelId);

	/**
	 * Gets the group ID of this h r asset model ID.
	 *
	 * @return the group ID of this h r asset model ID
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this h r asset model ID.
	 *
	 * @param groupId the group ID of this h r asset model ID
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the company ID of this h r asset model ID.
	 *
	 * @return the company ID of this h r asset model ID
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this h r asset model ID.
	 *
	 * @param companyId the company ID of this h r asset model ID
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the user ID of this h r asset model ID.
	 *
	 * @return the user ID of this h r asset model ID
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this h r asset model ID.
	 *
	 * @param userId the user ID of this h r asset model ID
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this h r asset model ID.
	 *
	 * @return the user uuid of this h r asset model ID
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this h r asset model ID.
	 *
	 * @param userUuid the user uuid of this h r asset model ID
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets the user name of this h r asset model ID.
	 *
	 * @return the user name of this h r asset model ID
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this h r asset model ID.
	 *
	 * @param userName the user name of this h r asset model ID
	 */
	public void setUserName(String userName);

	/**
	 * Gets the create date of this h r asset model ID.
	 *
	 * @return the create date of this h r asset model ID
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this h r asset model ID.
	 *
	 * @param createDate the create date of this h r asset model ID
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Gets the modified date of this h r asset model ID.
	 *
	 * @return the modified date of this h r asset model ID
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this h r asset model ID.
	 *
	 * @param modifiedDate the modified date of this h r asset model ID
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the hr asset vendor ID of this h r asset model ID.
	 *
	 * @return the hr asset vendor ID of this h r asset model ID
	 */
	public long getHrAssetVendorId();

	/**
	 * Sets the hr asset vendor ID of this h r asset model ID.
	 *
	 * @param hrAssetVendorId the hr asset vendor ID of this h r asset model ID
	 */
	public void setHrAssetVendorId(long hrAssetVendorId);

	/**
	 * Gets the name of this h r asset model ID.
	 *
	 * @return the name of this h r asset model ID
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this h r asset model ID.
	 *
	 * @param name the name of this h r asset model ID
	 */
	public void setName(String name);

	/**
	 * Gets the description of this h r asset model ID.
	 *
	 * @return the description of this h r asset model ID
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this h r asset model ID.
	 *
	 * @param description the description of this h r asset model ID
	 */
	public void setDescription(String description);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(HRAssetModelId hrAssetModelId);

	public int hashCode();

	public HRAssetModelId toEscapedModel();

	public String toString();

	public String toXmlString();
}