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

package it.gebhard.qa.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import it.gebhard.qa.model.GuestUser;
import it.gebhard.qa.model.GuestUserModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the GuestUser service. Represents a row in the &quot;QuickAnswer_GuestUser&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link it.gebhard.qa.model.GuestUserModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link GuestUserImpl}.
 * </p>
 *
 * @author Philipp Gebhard
 * @see GuestUserImpl
 * @see it.gebhard.qa.model.GuestUser
 * @see it.gebhard.qa.model.GuestUserModel
 * @generated
 */
public class GuestUserModelImpl extends BaseModelImpl<GuestUser>
	implements GuestUserModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a GuestUser model instance should use the {@link it.gebhard.qa.model.GuestUser} interface instead.
	 */
	public static final String TABLE_NAME = "QuickAnswer_GuestUser";
	public static final Object[][] TABLE_COLUMNS = {
			{ "guestUserId", Types.BIGINT },
			{ "name", Types.VARCHAR },
			{ "email", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table QuickAnswer_GuestUser (guestUserId LONG not null primary key,name VARCHAR(250) null,email VARCHAR(250) null)";
	public static final String TABLE_SQL_DROP = "drop table QuickAnswer_GuestUser";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.it.gebhard.qa.model.GuestUser"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.it.gebhard.qa.model.GuestUser"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.it.gebhard.qa.model.GuestUser"),
			true);
	public static long EMAIL_COLUMN_BITMASK = 1L;
	public static long NAME_COLUMN_BITMASK = 2L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.it.gebhard.qa.model.GuestUser"));

	public GuestUserModelImpl() {
	}

	public long getPrimaryKey() {
		return _guestUserId;
	}

	public void setPrimaryKey(long primaryKey) {
		setGuestUserId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_guestUserId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return GuestUser.class;
	}

	public String getModelClassName() {
		return GuestUser.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("guestUserId", getGuestUserId());
		attributes.put("name", getName());
		attributes.put("email", getEmail());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long guestUserId = (Long)attributes.get("guestUserId");

		if (guestUserId != null) {
			setGuestUserId(guestUserId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}
	}

	public long getGuestUserId() {
		return _guestUserId;
	}

	public void setGuestUserId(long guestUserId) {
		_guestUserId = guestUserId;
	}

	public String getGuestUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getGuestUserId(), "uuid", _guestUserUuid);
	}

	public void setGuestUserUuid(String guestUserUuid) {
		_guestUserUuid = guestUserUuid;
	}

	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	public void setName(String name) {
		_columnBitmask |= NAME_COLUMN_BITMASK;

		if (_originalName == null) {
			_originalName = _name;
		}

		_name = name;
	}

	public String getOriginalName() {
		return GetterUtil.getString(_originalName);
	}

	public String getEmail() {
		if (_email == null) {
			return StringPool.BLANK;
		}
		else {
			return _email;
		}
	}

	public void setEmail(String email) {
		_columnBitmask |= EMAIL_COLUMN_BITMASK;

		if (_originalEmail == null) {
			_originalEmail = _email;
		}

		_email = email;
	}

	public String getOriginalEmail() {
		return GetterUtil.getString(_originalEmail);
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			GuestUser.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public GuestUser toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (GuestUser)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		GuestUserImpl guestUserImpl = new GuestUserImpl();

		guestUserImpl.setGuestUserId(getGuestUserId());
		guestUserImpl.setName(getName());
		guestUserImpl.setEmail(getEmail());

		guestUserImpl.resetOriginalValues();

		return guestUserImpl;
	}

	public int compareTo(GuestUser guestUser) {
		long primaryKey = guestUser.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		GuestUser guestUser = null;

		try {
			guestUser = (GuestUser)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = guestUser.getPrimaryKey();

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
		GuestUserModelImpl guestUserModelImpl = this;

		guestUserModelImpl._originalName = guestUserModelImpl._name;

		guestUserModelImpl._originalEmail = guestUserModelImpl._email;

		guestUserModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<GuestUser> toCacheModel() {
		GuestUserCacheModel guestUserCacheModel = new GuestUserCacheModel();

		guestUserCacheModel.guestUserId = getGuestUserId();

		guestUserCacheModel.name = getName();

		String name = guestUserCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			guestUserCacheModel.name = null;
		}

		guestUserCacheModel.email = getEmail();

		String email = guestUserCacheModel.email;

		if ((email != null) && (email.length() == 0)) {
			guestUserCacheModel.email = null;
		}

		return guestUserCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{guestUserId=");
		sb.append(getGuestUserId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("it.gebhard.qa.model.GuestUser");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>guestUserId</column-name><column-value><![CDATA[");
		sb.append(getGuestUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = GuestUser.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			GuestUser.class
		};
	private long _guestUserId;
	private String _guestUserUuid;
	private String _name;
	private String _originalName;
	private String _email;
	private String _originalEmail;
	private long _columnBitmask;
	private GuestUser _escapedModelProxy;
}