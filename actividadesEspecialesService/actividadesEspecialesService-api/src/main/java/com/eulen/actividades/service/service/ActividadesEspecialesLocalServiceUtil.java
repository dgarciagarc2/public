/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.eulen.actividades.service.service;

import aQute.bnd.annotation.ProviderType;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for ActividadesEspeciales. This utility wraps
 * {@link com.eulen.actividades.service.service.impl.ActividadesEspecialesLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ActividadesEspecialesLocalService
 * @see com.eulen.actividades.service.service.base.ActividadesEspecialesLocalServiceBaseImpl
 * @see com.eulen.actividades.service.service.impl.ActividadesEspecialesLocalServiceImpl
 * @generated
 */
@ProviderType
public class ActividadesEspecialesLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.eulen.actividades.service.service.impl.ActividadesEspecialesLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the actividades especiales to the database. Also notifies the appropriate model listeners.
	*
	* @param actividadesEspeciales the actividades especiales
	* @return the actividades especiales that was added
	*/
	public static com.eulen.actividades.service.model.ActividadesEspeciales addActividadesEspeciales(
		com.eulen.actividades.service.model.ActividadesEspeciales actividadesEspeciales) {
		return getService().addActividadesEspeciales(actividadesEspeciales);
	}

	/**
	* Creates a new actividades especiales with the primary key. Does not add the actividades especiales to the database.
	*
	* @param actividadId the primary key for the new actividades especiales
	* @return the new actividades especiales
	*/
	public static com.eulen.actividades.service.model.ActividadesEspeciales createActividadesEspeciales(
		long actividadId) {
		return getService().createActividadesEspeciales(actividadId);
	}

	/**
	* Deletes the actividades especiales from the database. Also notifies the appropriate model listeners.
	*
	* @param actividadesEspeciales the actividades especiales
	* @return the actividades especiales that was removed
	*/
	public static com.eulen.actividades.service.model.ActividadesEspeciales deleteActividadesEspeciales(
		com.eulen.actividades.service.model.ActividadesEspeciales actividadesEspeciales) {
		return getService().deleteActividadesEspeciales(actividadesEspeciales);
	}

	/**
	* Deletes the actividades especiales with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param actividadId the primary key of the actividades especiales
	* @return the actividades especiales that was removed
	* @throws PortalException if a actividades especiales with the primary key could not be found
	*/
	public static com.eulen.actividades.service.model.ActividadesEspeciales deleteActividadesEspeciales(
		long actividadId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteActividadesEspeciales(actividadId);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.eulen.actividades.service.model.impl.ActividadesEspecialesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.eulen.actividades.service.model.impl.ActividadesEspecialesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.eulen.actividades.service.model.ActividadesEspeciales fetchActividadesEspeciales(
		long actividadId) {
		return getService().fetchActividadesEspeciales(actividadId);
	}

	/**
	* Returns the actividades especiales matching the UUID and group.
	*
	* @param uuid the actividades especiales's UUID
	* @param groupId the primary key of the group
	* @return the matching actividades especiales, or <code>null</code> if a matching actividades especiales could not be found
	*/
	public static com.eulen.actividades.service.model.ActividadesEspeciales fetchActividadesEspecialesByUuidAndGroupId(
		String uuid, long groupId) {
		return getService()
				   .fetchActividadesEspecialesByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	/**
	* Returns the actividades especiales with the primary key.
	*
	* @param actividadId the primary key of the actividades especiales
	* @return the actividades especiales
	* @throws PortalException if a actividades especiales with the primary key could not be found
	*/
	public static com.eulen.actividades.service.model.ActividadesEspeciales getActividadesEspeciales(
		long actividadId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getActividadesEspeciales(actividadId);
	}

	/**
	* Returns the actividades especiales matching the UUID and group.
	*
	* @param uuid the actividades especiales's UUID
	* @param groupId the primary key of the group
	* @return the matching actividades especiales
	* @throws PortalException if a matching actividades especiales could not be found
	*/
	public static com.eulen.actividades.service.model.ActividadesEspeciales getActividadesEspecialesByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService()
				   .getActividadesEspecialesByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the actividades especialeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.eulen.actividades.service.model.impl.ActividadesEspecialesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of actividades especialeses
	* @param end the upper bound of the range of actividades especialeses (not inclusive)
	* @return the range of actividades especialeses
	*/
	public static java.util.List<com.eulen.actividades.service.model.ActividadesEspeciales> getActividadesEspecialeses(
		int start, int end) {
		return getService().getActividadesEspecialeses(start, end);
	}

	/**
	* Returns the number of actividades especialeses.
	*
	* @return the number of actividades especialeses
	*/
	public static int getActividadesEspecialesesCount() {
		return getService().getActividadesEspecialesesCount();
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the actividades especiales in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param actividadesEspeciales the actividades especiales
	* @return the actividades especiales that was updated
	*/
	public static com.eulen.actividades.service.model.ActividadesEspeciales updateActividadesEspeciales(
		com.eulen.actividades.service.model.ActividadesEspeciales actividadesEspeciales) {
		return getService().updateActividadesEspeciales(actividadesEspeciales);
	}

	public static ActividadesEspecialesLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ActividadesEspecialesLocalService, ActividadesEspecialesLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ActividadesEspecialesLocalService.class);

		ServiceTracker<ActividadesEspecialesLocalService, ActividadesEspecialesLocalService> serviceTracker =
			new ServiceTracker<ActividadesEspecialesLocalService, ActividadesEspecialesLocalService>(bundle.getBundleContext(),
				ActividadesEspecialesLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}