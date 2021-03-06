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

package com.liferay.socialnetworking.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.liferay.socialnetworking.model.MeetupsRegistration;
import com.liferay.socialnetworking.model.MeetupsRegistrationModel;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the MeetupsRegistration service. Represents a row in the &quot;SN_MeetupsRegistration&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.socialnetworking.model.MeetupsRegistrationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MeetupsRegistrationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MeetupsRegistrationImpl
 * @see com.liferay.socialnetworking.model.MeetupsRegistration
 * @see com.liferay.socialnetworking.model.MeetupsRegistrationModel
 * @generated
 */
public class MeetupsRegistrationModelImpl extends BaseModelImpl<MeetupsRegistration>
	implements MeetupsRegistrationModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a meetups registration model instance should use the {@link com.liferay.socialnetworking.model.MeetupsRegistration} interface instead.
	 */
	public static final String TABLE_NAME = "SN_MeetupsRegistration";
	public static final Object[][] TABLE_COLUMNS = {
			{ "meetupsRegistrationId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "meetupsEntryId", Types.BIGINT },
			{ "status", Types.INTEGER },
			{ "comments", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table SN_MeetupsRegistration (meetupsRegistrationId LONG not null primary key,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,meetupsEntryId LONG,status INTEGER,comments STRING null)";
	public static final String TABLE_SQL_DROP = "drop table SN_MeetupsRegistration";
	public static final String ORDER_BY_JPQL = " ORDER BY meetupsRegistration.modifiedDate DESC";
	public static final String ORDER_BY_SQL = " ORDER BY SN_MeetupsRegistration.modifiedDate DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.socialnetworking.model.MeetupsRegistration"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.socialnetworking.model.MeetupsRegistration"),
			true);

	public Class<?> getModelClass() {
		return MeetupsRegistration.class;
	}

	public String getModelClassName() {
		return MeetupsRegistration.class.getName();
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.socialnetworking.model.MeetupsRegistration"));

	public MeetupsRegistrationModelImpl() {
	}

	public long getPrimaryKey() {
		return _meetupsRegistrationId;
	}

	public void setPrimaryKey(long primaryKey) {
		setMeetupsRegistrationId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_meetupsRegistrationId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public long getMeetupsRegistrationId() {
		return _meetupsRegistrationId;
	}

	public void setMeetupsRegistrationId(long meetupsRegistrationId) {
		_meetupsRegistrationId = meetupsRegistrationId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getMeetupsEntryId() {
		return _meetupsEntryId;
	}

	public void setMeetupsEntryId(long meetupsEntryId) {
		if (!_setOriginalMeetupsEntryId) {
			_setOriginalMeetupsEntryId = true;

			_originalMeetupsEntryId = _meetupsEntryId;
		}

		_meetupsEntryId = meetupsEntryId;
	}

	public long getOriginalMeetupsEntryId() {
		return _originalMeetupsEntryId;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public String getComments() {
		if (_comments == null) {
			return StringPool.BLANK;
		}
		else {
			return _comments;
		}
	}

	public void setComments(String comments) {
		_comments = comments;
	}

	@Override
	public MeetupsRegistration toEscapedModel() {
		if (isEscapedModel()) {
			return (MeetupsRegistration)this;
		}
		else {
			if (_escapedModelProxy == null) {
				_escapedModelProxy = (MeetupsRegistration)Proxy.newProxyInstance(_classLoader,
						_escapedModelProxyInterfaces,
						new AutoEscapeBeanHandler(this));
			}

			return _escapedModelProxy;
		}
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					MeetupsRegistration.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		MeetupsRegistrationImpl meetupsRegistrationImpl = new MeetupsRegistrationImpl();

		meetupsRegistrationImpl.setMeetupsRegistrationId(getMeetupsRegistrationId());
		meetupsRegistrationImpl.setCompanyId(getCompanyId());
		meetupsRegistrationImpl.setUserId(getUserId());
		meetupsRegistrationImpl.setUserName(getUserName());
		meetupsRegistrationImpl.setCreateDate(getCreateDate());
		meetupsRegistrationImpl.setModifiedDate(getModifiedDate());
		meetupsRegistrationImpl.setMeetupsEntryId(getMeetupsEntryId());
		meetupsRegistrationImpl.setStatus(getStatus());
		meetupsRegistrationImpl.setComments(getComments());

		meetupsRegistrationImpl.resetOriginalValues();

		return meetupsRegistrationImpl;
	}

	public int compareTo(MeetupsRegistration meetupsRegistration) {
		int value = 0;

		value = DateUtil.compareTo(getModifiedDate(),
				meetupsRegistration.getModifiedDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		MeetupsRegistration meetupsRegistration = null;

		try {
			meetupsRegistration = (MeetupsRegistration)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = meetupsRegistration.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		MeetupsRegistrationModelImpl meetupsRegistrationModelImpl = this;

		meetupsRegistrationModelImpl._originalUserId = meetupsRegistrationModelImpl._userId;

		meetupsRegistrationModelImpl._setOriginalUserId = false;

		meetupsRegistrationModelImpl._originalMeetupsEntryId = meetupsRegistrationModelImpl._meetupsEntryId;

		meetupsRegistrationModelImpl._setOriginalMeetupsEntryId = false;
	}

	@Override
	public CacheModel<MeetupsRegistration> toCacheModel() {
		MeetupsRegistrationCacheModel meetupsRegistrationCacheModel = new MeetupsRegistrationCacheModel();

		meetupsRegistrationCacheModel.meetupsRegistrationId = getMeetupsRegistrationId();

		meetupsRegistrationCacheModel.companyId = getCompanyId();

		meetupsRegistrationCacheModel.userId = getUserId();

		meetupsRegistrationCacheModel.userName = getUserName();

		String userName = meetupsRegistrationCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			meetupsRegistrationCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			meetupsRegistrationCacheModel.createDate = createDate.getTime();
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			meetupsRegistrationCacheModel.modifiedDate = modifiedDate.getTime();
		}

		meetupsRegistrationCacheModel.meetupsEntryId = getMeetupsEntryId();

		meetupsRegistrationCacheModel.status = getStatus();

		meetupsRegistrationCacheModel.comments = getComments();

		String comments = meetupsRegistrationCacheModel.comments;

		if ((comments != null) && (comments.length() == 0)) {
			meetupsRegistrationCacheModel.comments = null;
		}

		return meetupsRegistrationCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{meetupsRegistrationId=");
		sb.append(getMeetupsRegistrationId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", meetupsEntryId=");
		sb.append(getMeetupsEntryId());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", comments=");
		sb.append(getComments());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.liferay.socialnetworking.model.MeetupsRegistration");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>meetupsRegistrationId</column-name><column-value><![CDATA[");
		sb.append(getMeetupsRegistrationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>meetupsEntryId</column-name><column-value><![CDATA[");
		sb.append(getMeetupsEntryId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>comments</column-name><column-value><![CDATA[");
		sb.append(getComments());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = MeetupsRegistration.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			MeetupsRegistration.class
		};
	private long _meetupsRegistrationId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _meetupsEntryId;
	private long _originalMeetupsEntryId;
	private boolean _setOriginalMeetupsEntryId;
	private int _status;
	private String _comments;
	private transient ExpandoBridge _expandoBridge;
	private MeetupsRegistration _escapedModelProxy;
}