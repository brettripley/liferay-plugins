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
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the HRAsset service. Represents a row in the &quot;HRAsset&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.hr.model.impl.HRAssetModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.hr.model.impl.HRAssetImpl}.
 * </p>
 *
 * @author Wesley Gong
 * @see HRAsset
 * @see com.liferay.hr.model.impl.HRAssetImpl
 * @see com.liferay.hr.model.impl.HRAssetModelImpl
 * @generated
 */
public interface HRAssetModel extends BaseModel<HRAsset>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a h r asset model instance should use the {@link HRAsset} interface instead.
	 */

	/**
	 * Returns the primary key of this h r asset.
	 *
	 * @return the primary key of this h r asset
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this h r asset.
	 *
	 * @param primaryKey the primary key of this h r asset
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the hr asset ID of this h r asset.
	 *
	 * @return the hr asset ID of this h r asset
	 */
	public long getHrAssetId();

	/**
	 * Sets the hr asset ID of this h r asset.
	 *
	 * @param hrAssetId the hr asset ID of this h r asset
	 */
	public void setHrAssetId(long hrAssetId);

	/**
	 * Returns the group ID of this h r asset.
	 *
	 * @return the group ID of this h r asset
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this h r asset.
	 *
	 * @param groupId the group ID of this h r asset
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this h r asset.
	 *
	 * @return the company ID of this h r asset
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this h r asset.
	 *
	 * @param companyId the company ID of this h r asset
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this h r asset.
	 *
	 * @return the user ID of this h r asset
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this h r asset.
	 *
	 * @param userId the user ID of this h r asset
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this h r asset.
	 *
	 * @return the user uuid of this h r asset
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this h r asset.
	 *
	 * @param userUuid the user uuid of this h r asset
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this h r asset.
	 *
	 * @return the user name of this h r asset
	 */
	@AutoEscape
	public String getUserName();

	/**
	 * Sets the user name of this h r asset.
	 *
	 * @param userName the user name of this h r asset
	 */
	public void setUserName(String userName);

	/**
	 * Returns the create date of this h r asset.
	 *
	 * @return the create date of this h r asset
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this h r asset.
	 *
	 * @param createDate the create date of this h r asset
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this h r asset.
	 *
	 * @return the modified date of this h r asset
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this h r asset.
	 *
	 * @param modifiedDate the modified date of this h r asset
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the hr asset definition ID of this h r asset.
	 *
	 * @return the hr asset definition ID of this h r asset
	 */
	public long getHrAssetDefinitionId();

	/**
	 * Sets the hr asset definition ID of this h r asset.
	 *
	 * @param hrAssetDefinitionId the hr asset definition ID of this h r asset
	 */
	public void setHrAssetDefinitionId(long hrAssetDefinitionId);

	/**
	 * Returns the hr asset type ID of this h r asset.
	 *
	 * @return the hr asset type ID of this h r asset
	 */
	public long getHrAssetTypeId();

	/**
	 * Sets the hr asset type ID of this h r asset.
	 *
	 * @param hrAssetTypeId the hr asset type ID of this h r asset
	 */
	public void setHrAssetTypeId(long hrAssetTypeId);

	/**
	 * Returns the serial number of this h r asset.
	 *
	 * @return the serial number of this h r asset
	 */
	@AutoEscape
	public String getSerialNumber();

	/**
	 * Sets the serial number of this h r asset.
	 *
	 * @param serialNumber the serial number of this h r asset
	 */
	public void setSerialNumber(String serialNumber);

	/**
	 * Returns the inactive date of this h r asset.
	 *
	 * @return the inactive date of this h r asset
	 */
	public Date getInactiveDate();

	/**
	 * Sets the inactive date of this h r asset.
	 *
	 * @param inactiveDate the inactive date of this h r asset
	 */
	public void setInactiveDate(Date inactiveDate);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(HRAsset hrAsset);

	public int hashCode();

	public CacheModel<HRAsset> toCacheModel();

	public HRAsset toEscapedModel();

	public String toString();

	public String toXmlString();
}