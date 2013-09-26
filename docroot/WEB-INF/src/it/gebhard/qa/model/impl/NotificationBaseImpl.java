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

import com.liferay.portal.kernel.exception.SystemException;

import it.gebhard.qa.model.Notification;
import it.gebhard.qa.service.NotificationLocalServiceUtil;

/**
 * The extended model base implementation for the Notification service. Represents a row in the &quot;QuickAnswer_Notification&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link NotificationImpl}.
 * </p>
 *
 * @author Philipp Gebhard
 * @see NotificationImpl
 * @see it.gebhard.qa.model.Notification
 * @generated
 */
public abstract class NotificationBaseImpl extends NotificationModelImpl
	implements Notification {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a Notification model instance should use the {@link Notification} interface instead.
	 */
	public void persist() throws SystemException {
		if (this.isNew()) {
			NotificationLocalServiceUtil.addNotification(this);
		}
		else {
			NotificationLocalServiceUtil.updateNotification(this);
		}
	}
}