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

package it.gebhard.qa.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import it.gebhard.qa.model.Notification;

import java.util.List;

/**
 * The persistence utility for the Notification service. This utility wraps {@link NotificationPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Philipp Gebhard
 * @see NotificationPersistence
 * @see NotificationPersistenceImpl
 * @generated
 */
public class NotificationUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Notification notification) {
		getPersistence().clearCache(notification);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Notification> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Notification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Notification> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Notification update(Notification notification, boolean merge)
		throws SystemException {
		return getPersistence().update(notification, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Notification update(Notification notification, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(notification, merge, serviceContext);
	}

	/**
	* Caches the Notification in the entity cache if it is enabled.
	*
	* @param notification the Notification
	*/
	public static void cacheResult(
		it.gebhard.qa.model.Notification notification) {
		getPersistence().cacheResult(notification);
	}

	/**
	* Caches the Notifications in the entity cache if it is enabled.
	*
	* @param notifications the Notifications
	*/
	public static void cacheResult(
		java.util.List<it.gebhard.qa.model.Notification> notifications) {
		getPersistence().cacheResult(notifications);
	}

	/**
	* Creates a new Notification with the primary key. Does not add the Notification to the database.
	*
	* @param notificationId the primary key for the new Notification
	* @return the new Notification
	*/
	public static it.gebhard.qa.model.Notification create(long notificationId) {
		return getPersistence().create(notificationId);
	}

	/**
	* Removes the Notification with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param notificationId the primary key of the Notification
	* @return the Notification that was removed
	* @throws it.gebhard.qa.NoSuchNotificationException if a Notification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.gebhard.qa.model.Notification remove(long notificationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.gebhard.qa.NoSuchNotificationException {
		return getPersistence().remove(notificationId);
	}

	public static it.gebhard.qa.model.Notification updateImpl(
		it.gebhard.qa.model.Notification notification, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(notification, merge);
	}

	/**
	* Returns the Notification with the primary key or throws a {@link it.gebhard.qa.NoSuchNotificationException} if it could not be found.
	*
	* @param notificationId the primary key of the Notification
	* @return the Notification
	* @throws it.gebhard.qa.NoSuchNotificationException if a Notification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.gebhard.qa.model.Notification findByPrimaryKey(
		long notificationId)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.gebhard.qa.NoSuchNotificationException {
		return getPersistence().findByPrimaryKey(notificationId);
	}

	/**
	* Returns the Notification with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param notificationId the primary key of the Notification
	* @return the Notification, or <code>null</code> if a Notification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.gebhard.qa.model.Notification fetchByPrimaryKey(
		long notificationId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(notificationId);
	}

	/**
	* Returns all the Notifications where userId = &#63;.
	*
	* @param userId the user ID
	* @return the matching Notifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.gebhard.qa.model.Notification> findByUserId(
		long userId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId);
	}

	/**
	* Returns a range of all the Notifications where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of Notifications
	* @param end the upper bound of the range of Notifications (not inclusive)
	* @return the range of matching Notifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.gebhard.qa.model.Notification> findByUserId(
		long userId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByUserId(userId, start, end);
	}

	/**
	* Returns an ordered range of all the Notifications where userId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param userId the user ID
	* @param start the lower bound of the range of Notifications
	* @param end the upper bound of the range of Notifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching Notifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.gebhard.qa.model.Notification> findByUserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByUserId(userId, start, end, orderByComparator);
	}

	/**
	* Returns the first Notification in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Notification
	* @throws it.gebhard.qa.NoSuchNotificationException if a matching Notification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.gebhard.qa.model.Notification findByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.gebhard.qa.NoSuchNotificationException {
		return getPersistence().findByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the first Notification in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching Notification, or <code>null</code> if a matching Notification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.gebhard.qa.model.Notification fetchByUserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId_First(userId, orderByComparator);
	}

	/**
	* Returns the last Notification in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Notification
	* @throws it.gebhard.qa.NoSuchNotificationException if a matching Notification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.gebhard.qa.model.Notification findByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.gebhard.qa.NoSuchNotificationException {
		return getPersistence().findByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the last Notification in the ordered set where userId = &#63;.
	*
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching Notification, or <code>null</code> if a matching Notification could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.gebhard.qa.model.Notification fetchByUserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByUserId_Last(userId, orderByComparator);
	}

	/**
	* Returns the Notifications before and after the current Notification in the ordered set where userId = &#63;.
	*
	* @param notificationId the primary key of the current Notification
	* @param userId the user ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next Notification
	* @throws it.gebhard.qa.NoSuchNotificationException if a Notification with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static it.gebhard.qa.model.Notification[] findByUserId_PrevAndNext(
		long notificationId, long userId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			it.gebhard.qa.NoSuchNotificationException {
		return getPersistence()
				   .findByUserId_PrevAndNext(notificationId, userId,
			orderByComparator);
	}

	/**
	* Returns all the Notifications.
	*
	* @return the Notifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.gebhard.qa.model.Notification> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the Notifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of Notifications
	* @param end the upper bound of the range of Notifications (not inclusive)
	* @return the range of Notifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.gebhard.qa.model.Notification> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the Notifications.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of Notifications
	* @param end the upper bound of the range of Notifications (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of Notifications
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<it.gebhard.qa.model.Notification> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the Notifications where userId = &#63; from the database.
	*
	* @param userId the user ID
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByUserId(userId);
	}

	/**
	* Removes all the Notifications from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of Notifications where userId = &#63;.
	*
	* @param userId the user ID
	* @return the number of matching Notifications
	* @throws SystemException if a system exception occurred
	*/
	public static int countByUserId(long userId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByUserId(userId);
	}

	/**
	* Returns the number of Notifications.
	*
	* @return the number of Notifications
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static NotificationPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (NotificationPersistence)PortletBeanLocatorUtil.locate(it.gebhard.qa.service.ClpSerializer.getServletContextName(),
					NotificationPersistence.class.getName());

			ReferenceRegistry.registerReference(NotificationUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(NotificationPersistence persistence) {
	}

	private static NotificationPersistence _persistence;
}