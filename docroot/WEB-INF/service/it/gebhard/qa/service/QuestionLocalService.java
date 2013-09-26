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

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.service.BaseLocalService;
import com.liferay.portal.service.InvokableLocalService;
import com.liferay.portal.service.PersistedModelLocalService;

/**
 * The interface for the Question local service.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Philipp Gebhard
 * @see QuestionLocalServiceUtil
 * @see it.gebhard.qa.service.base.QuestionLocalServiceBaseImpl
 * @see it.gebhard.qa.service.impl.QuestionLocalServiceImpl
 * @generated
 */
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface QuestionLocalService extends BaseLocalService,
	InvokableLocalService, PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link QuestionLocalServiceUtil} to access the Question local service. Add custom service methods to {@link it.gebhard.qa.service.impl.QuestionLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the Question to the database. Also notifies the appropriate model listeners.
	*
	* @param question the Question
	* @return the Question that was added
	* @throws SystemException if a system exception occurred
	*/
	public it.gebhard.qa.model.Question addQuestion(
		it.gebhard.qa.model.Question question)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Creates a new Question with the primary key. Does not add the Question to the database.
	*
	* @param questionId the primary key for the new Question
	* @return the new Question
	*/
	public it.gebhard.qa.model.Question createQuestion(long questionId);

	/**
	* Deletes the Question with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param questionId the primary key of the Question
	* @return the Question that was removed
	* @throws PortalException if a Question with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.gebhard.qa.model.Question deleteQuestion(long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Deletes the Question from the database. Also notifies the appropriate model listeners.
	*
	* @param question the Question
	* @return the Question that was removed
	* @throws SystemException if a system exception occurred
	*/
	public it.gebhard.qa.model.Question deleteQuestion(
		it.gebhard.qa.model.Question question)
		throws com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery();

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
		throws com.liferay.portal.kernel.exception.SystemException;

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
		int end) throws com.liferay.portal.kernel.exception.SystemException;

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
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public it.gebhard.qa.model.Question fetchQuestion(long questionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Question with the primary key.
	*
	* @param questionId the primary key of the Question
	* @return the Question
	* @throws PortalException if a Question with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public it.gebhard.qa.model.Question getQuestion(long questionId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the Questions.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of Questions
	* @param end the upper bound of the range of Questions (not inclusive)
	* @return the range of Questions
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<it.gebhard.qa.model.Question> getQuestions(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of Questions.
	*
	* @return the number of Questions
	* @throws SystemException if a system exception occurred
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getQuestionsCount()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the Question in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param question the Question
	* @return the Question that was updated
	* @throws SystemException if a system exception occurred
	*/
	public it.gebhard.qa.model.Question updateQuestion(
		it.gebhard.qa.model.Question question)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Updates the Question in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param question the Question
	* @param merge whether to merge the Question with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the Question that was updated
	* @throws SystemException if a system exception occurred
	*/
	public it.gebhard.qa.model.Question updateQuestion(
		it.gebhard.qa.model.Question question, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier();

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier);

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable;

	public java.util.List<it.gebhard.qa.model.Question> filterQuestions(
		int begin, int end, boolean unansweredFirst,
		java.lang.String searchString)
		throws com.liferay.portal.kernel.exception.SystemException;

	public java.util.List<it.gebhard.qa.model.Question> filterQuestions(
		boolean unansweredFirst, java.lang.String searchString)
		throws com.liferay.portal.kernel.exception.SystemException;

	public int countAnswers(it.gebhard.qa.model.Question question)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<it.gebhard.qa.model.Answer> getAnswers(
		it.gebhard.qa.model.Question question)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<it.gebhard.qa.model.Answer> getAcceptedAnswers(
		it.gebhard.qa.model.Question question)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<it.gebhard.qa.model.Comment> getComments(
		it.gebhard.qa.model.Question question)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public boolean hasTagAssociated(it.gebhard.qa.model.Question question,
		java.lang.String name)
		throws com.liferay.portal.kernel.exception.SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public java.util.List<it.gebhard.qa.model.Tag> getTags(
		it.gebhard.qa.model.Question question)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void assignTagToQuestion(it.gebhard.qa.model.Question question,
		it.gebhard.qa.model.Tag tag)
		throws com.liferay.portal.kernel.exception.SystemException;

	public void deleteTags(it.gebhard.qa.model.Question question)
		throws com.liferay.portal.kernel.exception.SystemException;
}