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
 * This class is a wrapper for {@link VoteLocalService}.
 * </p>
 *
 * @author    Philipp Gebhard
 * @see       VoteLocalService
 * @generated
 */
public class VoteLocalServiceWrapper implements VoteLocalService,
	ServiceWrapper<VoteLocalService> {
	public VoteLocalServiceWrapper(VoteLocalService voteLocalService) {
		_voteLocalService = voteLocalService;
	}

	/**
	* Adds the Vote to the database. Also notifies the appropriate model listeners.
	*
	* @param vote the Vote
	* @return the Vote that was added
	* @throws SystemException if a system exception occurred
	*/
	public it.gebhard.qa.model.Vote addVote(it.gebhard.qa.model.Vote vote)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteLocalService.addVote(vote);
	}

	/**
	* Creates a new Vote with the primary key. Does not add the Vote to the database.
	*
	* @param voteId the primary key for the new Vote
	* @return the new Vote
	*/
	public it.gebhard.qa.model.Vote createVote(long voteId) {
		return _voteLocalService.createVote(voteId);
	}

	/**
	* Deletes the Vote with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param voteId the primary key of the Vote
	* @return the Vote that was removed
	* @throws PortalException if a Vote with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.gebhard.qa.model.Vote deleteVote(long voteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _voteLocalService.deleteVote(voteId);
	}

	/**
	* Deletes the Vote from the database. Also notifies the appropriate model listeners.
	*
	* @param vote the Vote
	* @return the Vote that was removed
	* @throws SystemException if a system exception occurred
	*/
	public it.gebhard.qa.model.Vote deleteVote(it.gebhard.qa.model.Vote vote)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteLocalService.deleteVote(vote);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _voteLocalService.dynamicQuery();
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
		return _voteLocalService.dynamicQuery(dynamicQuery);
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
		return _voteLocalService.dynamicQuery(dynamicQuery, start, end);
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
		return _voteLocalService.dynamicQuery(dynamicQuery, start, end,
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
		return _voteLocalService.dynamicQueryCount(dynamicQuery);
	}

	public it.gebhard.qa.model.Vote fetchVote(long voteId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteLocalService.fetchVote(voteId);
	}

	/**
	* Returns the Vote with the primary key.
	*
	* @param voteId the primary key of the Vote
	* @return the Vote
	* @throws PortalException if a Vote with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public it.gebhard.qa.model.Vote getVote(long voteId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _voteLocalService.getVote(voteId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _voteLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the Votes.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of Votes
	* @param end the upper bound of the range of Votes (not inclusive)
	* @return the range of Votes
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<it.gebhard.qa.model.Vote> getVotes(int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteLocalService.getVotes(start, end);
	}

	/**
	* Returns the number of Votes.
	*
	* @return the number of Votes
	* @throws SystemException if a system exception occurred
	*/
	public int getVotesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteLocalService.getVotesCount();
	}

	/**
	* Updates the Vote in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vote the Vote
	* @return the Vote that was updated
	* @throws SystemException if a system exception occurred
	*/
	public it.gebhard.qa.model.Vote updateVote(it.gebhard.qa.model.Vote vote)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteLocalService.updateVote(vote);
	}

	/**
	* Updates the Vote in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param vote the Vote
	* @param merge whether to merge the Vote with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the Vote that was updated
	* @throws SystemException if a system exception occurred
	*/
	public it.gebhard.qa.model.Vote updateVote(it.gebhard.qa.model.Vote vote,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteLocalService.updateVote(vote, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _voteLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_voteLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _voteLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	public int countVotesForQuestion(it.gebhard.qa.model.Question question)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteLocalService.countVotesForQuestion(question);
	}

	public int evaluateVotesForQuestion(it.gebhard.qa.model.Question question)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteLocalService.evaluateVotesForQuestion(question);
	}

	public int evaluateVotesForAnswer(it.gebhard.qa.model.Answer answer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteLocalService.evaluateVotesForAnswer(answer);
	}

	public java.util.List<it.gebhard.qa.model.Vote> getUserVotesOnQuestion(
		com.liferay.portal.model.User user,
		it.gebhard.qa.model.Question question)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteLocalService.getUserVotesOnQuestion(user, question);
	}

	public java.util.List<it.gebhard.qa.model.Vote> getUserVotesOnAnswer(
		com.liferay.portal.model.User user, it.gebhard.qa.model.Answer answer)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _voteLocalService.getUserVotesOnAnswer(user, answer);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public VoteLocalService getWrappedVoteLocalService() {
		return _voteLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedVoteLocalService(VoteLocalService voteLocalService) {
		_voteLocalService = voteLocalService;
	}

	public VoteLocalService getWrappedService() {
		return _voteLocalService;
	}

	public void setWrappedService(VoteLocalService voteLocalService) {
		_voteLocalService = voteLocalService;
	}

	private VoteLocalService _voteLocalService;
}