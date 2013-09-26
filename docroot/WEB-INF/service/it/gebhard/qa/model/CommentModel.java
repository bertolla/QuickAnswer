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

package it.gebhard.qa.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Comment service. Represents a row in the &quot;QuickAnswer_Comment&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link it.gebhard.qa.model.impl.CommentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link it.gebhard.qa.model.impl.CommentImpl}.
 * </p>
 *
 * @author Philipp Gebhard
 * @see Comment
 * @see it.gebhard.qa.model.impl.CommentImpl
 * @see it.gebhard.qa.model.impl.CommentModelImpl
 * @generated
 */
public interface CommentModel extends BaseModel<Comment> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a Comment model instance should use the {@link Comment} interface instead.
	 */

	/**
	 * Returns the primary key of this Comment.
	 *
	 * @return the primary key of this Comment
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this Comment.
	 *
	 * @param primaryKey the primary key of this Comment
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the comment ID of this Comment.
	 *
	 * @return the comment ID of this Comment
	 */
	public long getCommentId();

	/**
	 * Sets the comment ID of this Comment.
	 *
	 * @param commentId the comment ID of this Comment
	 */
	public void setCommentId(long commentId);

	/**
	 * Returns the question ID of this Comment.
	 *
	 * @return the question ID of this Comment
	 */
	public long getQuestionId();

	/**
	 * Sets the question ID of this Comment.
	 *
	 * @param questionId the question ID of this Comment
	 */
	public void setQuestionId(long questionId);

	/**
	 * Returns the answer ID of this Comment.
	 *
	 * @return the answer ID of this Comment
	 */
	public long getAnswerId();

	/**
	 * Sets the answer ID of this Comment.
	 *
	 * @param answerId the answer ID of this Comment
	 */
	public void setAnswerId(long answerId);

	/**
	 * Returns the user ID of this Comment.
	 *
	 * @return the user ID of this Comment
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this Comment.
	 *
	 * @param userId the user ID of this Comment
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this Comment.
	 *
	 * @return the user uuid of this Comment
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this Comment.
	 *
	 * @param userUuid the user uuid of this Comment
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the message of this Comment.
	 *
	 * @return the message of this Comment
	 */
	@AutoEscape
	public String getMessage();

	/**
	 * Sets the message of this Comment.
	 *
	 * @param message the message of this Comment
	 */
	public void setMessage(String message);

	/**
	 * Returns the created of this Comment.
	 *
	 * @return the created of this Comment
	 */
	public Date getCreated();

	/**
	 * Sets the created of this Comment.
	 *
	 * @param created the created of this Comment
	 */
	public void setCreated(Date created);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(Comment comment);

	public int hashCode();

	public CacheModel<Comment> toCacheModel();

	public Comment toEscapedModel();

	public String toString();

	public String toXmlString();
}