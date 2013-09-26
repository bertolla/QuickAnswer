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
import com.liferay.portal.kernel.util.DateUtil;
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

import it.gebhard.qa.model.Question;
import it.gebhard.qa.model.QuestionModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Question service. Represents a row in the &quot;QuickAnswer_Question&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link it.gebhard.qa.model.QuestionModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QuestionImpl}.
 * </p>
 *
 * @author Philipp Gebhard
 * @see QuestionImpl
 * @see it.gebhard.qa.model.Question
 * @see it.gebhard.qa.model.QuestionModel
 * @generated
 */
public class QuestionModelImpl extends BaseModelImpl<Question>
	implements QuestionModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a Question model instance should use the {@link it.gebhard.qa.model.Question} interface instead.
	 */
	public static final String TABLE_NAME = "QuickAnswer_Question";
	public static final Object[][] TABLE_COLUMNS = {
			{ "questionId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "guestUserId", Types.BIGINT },
			{ "title", Types.VARCHAR },
			{ "message", Types.VARCHAR },
			{ "viewCounter", Types.BIGINT },
			{ "created", Types.TIMESTAMP },
			{ "modified", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table QuickAnswer_Question (questionId LONG not null primary key,userId LONG,guestUserId LONG,title VARCHAR(500) null,message TEXT null,viewCounter LONG,created DATE null,modified DATE null)";
	public static final String TABLE_SQL_DROP = "drop table QuickAnswer_Question";
	public static final String ORDER_BY_JPQL = " ORDER BY question.created DESC, question.questionId DESC";
	public static final String ORDER_BY_SQL = " ORDER BY QuickAnswer_Question.created DESC, QuickAnswer_Question.questionId DESC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.it.gebhard.qa.model.Question"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.it.gebhard.qa.model.Question"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;
	public static final String MAPPING_TABLE_QUICKANSWER_QUESTIONTAG_NAME = "QuickAnswer_QuestionTag";
	public static final Object[][] MAPPING_TABLE_QUICKANSWER_QUESTIONTAG_COLUMNS =
		{
			{ "questionId", Types.BIGINT },
			{ "tagId", Types.BIGINT }
		};
	public static final String MAPPING_TABLE_QUICKANSWER_QUESTIONTAG_SQL_CREATE = "create table QuickAnswer_QuestionTag (questionId LONG not null,tagId LONG not null,primary key (questionId, tagId))";
	public static final boolean FINDER_CACHE_ENABLED_QUICKANSWER_QUESTIONTAG = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.QuickAnswer_QuestionTag"),
			true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.it.gebhard.qa.model.Question"));

	public QuestionModelImpl() {
	}

	public long getPrimaryKey() {
		return _questionId;
	}

	public void setPrimaryKey(long primaryKey) {
		setQuestionId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_questionId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public Class<?> getModelClass() {
		return Question.class;
	}

	public String getModelClassName() {
		return Question.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("questionId", getQuestionId());
		attributes.put("userId", getUserId());
		attributes.put("guestUserId", getGuestUserId());
		attributes.put("title", getTitle());
		attributes.put("message", getMessage());
		attributes.put("viewCounter", getViewCounter());
		attributes.put("created", getCreated());
		attributes.put("modified", getModified());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long questionId = (Long)attributes.get("questionId");

		if (questionId != null) {
			setQuestionId(questionId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long guestUserId = (Long)attributes.get("guestUserId");

		if (guestUserId != null) {
			setGuestUserId(guestUserId);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String message = (String)attributes.get("message");

		if (message != null) {
			setMessage(message);
		}

		Long viewCounter = (Long)attributes.get("viewCounter");

		if (viewCounter != null) {
			setViewCounter(viewCounter);
		}

		Date created = (Date)attributes.get("created");

		if (created != null) {
			setCreated(created);
		}

		Date modified = (Date)attributes.get("modified");

		if (modified != null) {
			setModified(modified);
		}
	}

	public long getQuestionId() {
		return _questionId;
	}

	public void setQuestionId(long questionId) {
		_questionId = questionId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
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

	public String getTitle() {
		if (_title == null) {
			return StringPool.BLANK;
		}
		else {
			return _title;
		}
	}

	public void setTitle(String title) {
		_title = title;
	}

	public String getMessage() {
		if (_message == null) {
			return StringPool.BLANK;
		}
		else {
			return _message;
		}
	}

	public void setMessage(String message) {
		_message = message;
	}

	public long getViewCounter() {
		return _viewCounter;
	}

	public void setViewCounter(long viewCounter) {
		_viewCounter = viewCounter;
	}

	public Date getCreated() {
		return _created;
	}

	public void setCreated(Date created) {
		_created = created;
	}

	public Date getModified() {
		return _modified;
	}

	public void setModified(Date modified) {
		_modified = modified;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Question.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Question toEscapedModel() {
		if (_escapedModelProxy == null) {
			_escapedModelProxy = (Question)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelProxyInterfaces,
					new AutoEscapeBeanHandler(this));
		}

		return _escapedModelProxy;
	}

	@Override
	public Object clone() {
		QuestionImpl questionImpl = new QuestionImpl();

		questionImpl.setQuestionId(getQuestionId());
		questionImpl.setUserId(getUserId());
		questionImpl.setGuestUserId(getGuestUserId());
		questionImpl.setTitle(getTitle());
		questionImpl.setMessage(getMessage());
		questionImpl.setViewCounter(getViewCounter());
		questionImpl.setCreated(getCreated());
		questionImpl.setModified(getModified());

		questionImpl.resetOriginalValues();

		return questionImpl;
	}

	public int compareTo(Question question) {
		int value = 0;

		value = DateUtil.compareTo(getCreated(), question.getCreated());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		if (getQuestionId() < question.getQuestionId()) {
			value = -1;
		}
		else if (getQuestionId() > question.getQuestionId()) {
			value = 1;
		}
		else {
			value = 0;
		}

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

		Question question = null;

		try {
			question = (Question)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = question.getPrimaryKey();

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
	}

	@Override
	public CacheModel<Question> toCacheModel() {
		QuestionCacheModel questionCacheModel = new QuestionCacheModel();

		questionCacheModel.questionId = getQuestionId();

		questionCacheModel.userId = getUserId();

		questionCacheModel.guestUserId = getGuestUserId();

		questionCacheModel.title = getTitle();

		String title = questionCacheModel.title;

		if ((title != null) && (title.length() == 0)) {
			questionCacheModel.title = null;
		}

		questionCacheModel.message = getMessage();

		String message = questionCacheModel.message;

		if ((message != null) && (message.length() == 0)) {
			questionCacheModel.message = null;
		}

		questionCacheModel.viewCounter = getViewCounter();

		Date created = getCreated();

		if (created != null) {
			questionCacheModel.created = created.getTime();
		}
		else {
			questionCacheModel.created = Long.MIN_VALUE;
		}

		Date modified = getModified();

		if (modified != null) {
			questionCacheModel.modified = modified.getTime();
		}
		else {
			questionCacheModel.modified = Long.MIN_VALUE;
		}

		return questionCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{questionId=");
		sb.append(getQuestionId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", guestUserId=");
		sb.append(getGuestUserId());
		sb.append(", title=");
		sb.append(getTitle());
		sb.append(", message=");
		sb.append(getMessage());
		sb.append(", viewCounter=");
		sb.append(getViewCounter());
		sb.append(", created=");
		sb.append(getCreated());
		sb.append(", modified=");
		sb.append(getModified());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("it.gebhard.qa.model.Question");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>questionId</column-name><column-value><![CDATA[");
		sb.append(getQuestionId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>guestUserId</column-name><column-value><![CDATA[");
		sb.append(getGuestUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>title</column-name><column-value><![CDATA[");
		sb.append(getTitle());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>message</column-name><column-value><![CDATA[");
		sb.append(getMessage());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>viewCounter</column-name><column-value><![CDATA[");
		sb.append(getViewCounter());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>created</column-name><column-value><![CDATA[");
		sb.append(getCreated());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modified</column-name><column-value><![CDATA[");
		sb.append(getModified());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Question.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			Question.class
		};
	private long _questionId;
	private long _userId;
	private String _userUuid;
	private long _guestUserId;
	private String _guestUserUuid;
	private String _title;
	private String _message;
	private long _viewCounter;
	private Date _created;
	private Date _modified;
	private Question _escapedModelProxy;
}