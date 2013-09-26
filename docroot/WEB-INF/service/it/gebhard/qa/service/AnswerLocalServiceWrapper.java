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

package it.gebhard.qa.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link AnswerLocalService}.
 * </p>
 *
 * @author    Philipp Gebhard
 * @see       AnswerLocalService
 * @generated
 */
public class AnswerLocalServiceWrapper implements AnswerLocalService,
	ServiceWrapper<AnswerLocalService> {
	public AnswerLocalServiceWrapper(AnswerLocalService answerLocalService) {
		_answerLocalService = answerLocalService;
	}

	/**
	* Adds the Answer to the database. Also notifies the appropriate model listeners.
	*
	* @param answer the Answer
	* @return the Answer that was added
	* @throws SystemException if a system exception occurred
	*/
	public it.gebhard.qa.model.Answer addAnswer(
		it.gebhard.qa.model.Answer answer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.addAnswer(answer);
	}

	/**
	* Creates a new Answer with the primary key. Does not add the Answer to the database.
	*
	* @param answerId the primary key for the new Answer
	* @return the new Answer
	*/
	public it.gebhard.qa.model.Answer createAnswer(long answerId) {
		return _answerLocalService.createAnswer(answerId);
	}

	/**
	* Deletes the Answer with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param answerId the primary key of the Answer
	* @return the Answer that was removed
	* @throws PortalException if a Answer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.gebhard.qa.model.Answer deleteAnswer(long answerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.deleteAnswer(answerId);
	}

	/**
	* Deletes the Answer from the database. Also notifies the appropriate model listeners.
	*
	* @param answer the Answer
	* @return the Answer that was removed
	* @throws SystemException if a system exception occurred
	*/
	public it.gebhard.qa.model.Answer deleteAnswer(
		it.gebhard.qa.model.Answer answer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.deleteAnswer(answer);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _answerLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.dynamicQueryCount(dynamicQuery);
	}

	public it.gebhard.qa.model.Answer fetchAnswer(long answerId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.fetchAnswer(answerId);
	}

	/**
	* Returns the Answer with the primary key.
	*
	* @param answerId the primary key of the Answer
	* @return the Answer
	* @throws PortalException if a Answer with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.gebhard.qa.model.Answer getAnswer(long answerId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.getAnswer(answerId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the Answers.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of Answers
	* @param end the upper bound of the range of Answers (not inclusive)
	* @return the range of Answers
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.gebhard.qa.model.Answer> getAnswers(int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.getAnswers(start, end);
	}

	/**
	* Returns the number of Answers.
	*
	* @return the number of Answers
	* @throws SystemException if a system exception occurred
	*/
	public int getAnswersCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.getAnswersCount();
	}

	/**
	* Updates the Answer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param answer the Answer
	* @return the Answer that was updated
	* @throws SystemException if a system exception occurred
	*/
	public it.gebhard.qa.model.Answer updateAnswer(
		it.gebhard.qa.model.Answer answer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.updateAnswer(answer);
	}

	/**
	* Updates the Answer in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param answer the Answer
	* @param merge whether to merge the Answer with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the Answer that was updated
	* @throws SystemException if a system exception occurred
	*/
	public it.gebhard.qa.model.Answer updateAnswer(
		it.gebhard.qa.model.Answer answer, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.updateAnswer(answer, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _answerLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_answerLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _answerLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	public java.util.List<it.gebhard.qa.model.Answer> getAnswersForQuestion(
		it.gebhard.qa.model.Question question)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.getAnswersForQuestion(question);
	}

	public java.util.List<it.gebhard.qa.model.Comment> getComments(
		it.gebhard.qa.model.Answer answer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _answerLocalService.getComments(answer);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public AnswerLocalService getWrappedAnswerLocalService() {
		return _answerLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedAnswerLocalService(
		AnswerLocalService answerLocalService) {
		_answerLocalService = answerLocalService;
	}

	public AnswerLocalService getWrappedService() {
		return _answerLocalService;
	}

	public void setWrappedService(AnswerLocalService answerLocalService) {
		_answerLocalService = answerLocalService;
	}

	private AnswerLocalService _answerLocalService;
}