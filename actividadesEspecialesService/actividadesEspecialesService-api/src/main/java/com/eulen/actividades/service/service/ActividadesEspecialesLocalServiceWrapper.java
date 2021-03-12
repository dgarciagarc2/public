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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ActividadesEspecialesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ActividadesEspecialesLocalService
 * @generated
 */
@ProviderType
public class ActividadesEspecialesLocalServiceWrapper
	implements ActividadesEspecialesLocalService,
		ServiceWrapper<ActividadesEspecialesLocalService> {
	public ActividadesEspecialesLocalServiceWrapper(
		ActividadesEspecialesLocalService actividadesEspecialesLocalService) {
		_actividadesEspecialesLocalService = actividadesEspecialesLocalService;
	}

	/**
	* Adds the actividades especiales to the database. Also notifies the appropriate model listeners.
	*
	* @param actividadesEspeciales the actividades especiales
	* @return the actividades especiales that was added
	*/
	@Override
	public com.eulen.actividades.service.model.ActividadesEspeciales addActividadesEspeciales(
		com.eulen.actividades.service.model.ActividadesEspeciales actividadesEspeciales) {
		return _actividadesEspecialesLocalService.addActividadesEspeciales(actividadesEspeciales);
	}

	/**
	* Creates a new actividades especiales with the primary key. Does not add the actividades especiales to the database.
	*
	* @param actividadId the primary key for the new actividades especiales
	* @return the new actividades especiales
	*/
	@Override
	public com.eulen.actividades.service.model.ActividadesEspeciales createActividadesEspeciales(
		long actividadId) {
		return _actividadesEspecialesLocalService.createActividadesEspeciales(actividadId);
	}

	/**
	* Deletes the actividades especiales from the database. Also notifies the appropriate model listeners.
	*
	* @param actividadesEspeciales the actividades especiales
	* @return the actividades especiales that was removed
	*/
	@Override
	public com.eulen.actividades.service.model.ActividadesEspeciales deleteActividadesEspeciales(
		com.eulen.actividades.service.model.ActividadesEspeciales actividadesEspeciales) {
		return _actividadesEspecialesLocalService.deleteActividadesEspeciales(actividadesEspeciales);
	}

	/**
	* Deletes the actividades especiales with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param actividadId the primary key of the actividades especiales
	* @return the actividades especiales that was removed
	* @throws PortalException if a actividades especiales with the primary key could not be found
	*/
	@Override
	public com.eulen.actividades.service.model.ActividadesEspeciales deleteActividadesEspeciales(
		long actividadId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _actividadesEspecialesLocalService.deleteActividadesEspeciales(actividadId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _actividadesEspecialesLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _actividadesEspecialesLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _actividadesEspecialesLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _actividadesEspecialesLocalService.dynamicQuery(dynamicQuery,
			start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _actividadesEspecialesLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _actividadesEspecialesLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _actividadesEspecialesLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.eulen.actividades.service.model.ActividadesEspeciales fetchActividadesEspeciales(
		long actividadId) {
		return _actividadesEspecialesLocalService.fetchActividadesEspeciales(actividadId);
	}

	/**
	* Returns the actividades especiales matching the UUID and group.
	*
	* @param uuid the actividades especiales's UUID
	* @param groupId the primary key of the group
	* @return the matching actividades especiales, or <code>null</code> if a matching actividades especiales could not be found
	*/
	@Override
	public com.eulen.actividades.service.model.ActividadesEspeciales fetchActividadesEspecialesByUuidAndGroupId(
		String uuid, long groupId) {
		return _actividadesEspecialesLocalService.fetchActividadesEspecialesByUuidAndGroupId(uuid,
			groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _actividadesEspecialesLocalService.getActionableDynamicQuery();
	}

	/**
	* Returns the actividades especiales with the primary key.
	*
	* @param actividadId the primary key of the actividades especiales
	* @return the actividades especiales
	* @throws PortalException if a actividades especiales with the primary key could not be found
	*/
	@Override
	public com.eulen.actividades.service.model.ActividadesEspeciales getActividadesEspeciales(
		long actividadId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _actividadesEspecialesLocalService.getActividadesEspeciales(actividadId);
	}

	/**
	* Returns the actividades especiales matching the UUID and group.
	*
	* @param uuid the actividades especiales's UUID
	* @param groupId the primary key of the group
	* @return the matching actividades especiales
	* @throws PortalException if a matching actividades especiales could not be found
	*/
	@Override
	public com.eulen.actividades.service.model.ActividadesEspeciales getActividadesEspecialesByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _actividadesEspecialesLocalService.getActividadesEspecialesByUuidAndGroupId(uuid,
			groupId);
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
	@Override
	public java.util.List<com.eulen.actividades.service.model.ActividadesEspeciales> getActividadesEspecialeses(
		int start, int end) {
		return _actividadesEspecialesLocalService.getActividadesEspecialeses(start,
			end);
	}

	/**
	* Returns the number of actividades especialeses.
	*
	* @return the number of actividades especialeses
	*/
	@Override
	public int getActividadesEspecialesesCount() {
		return _actividadesEspecialesLocalService.getActividadesEspecialesesCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _actividadesEspecialesLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _actividadesEspecialesLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _actividadesEspecialesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Updates the actividades especiales in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param actividadesEspeciales the actividades especiales
	* @return the actividades especiales that was updated
	*/
	@Override
	public com.eulen.actividades.service.model.ActividadesEspeciales updateActividadesEspeciales(
		com.eulen.actividades.service.model.ActividadesEspeciales actividadesEspeciales) {
		return _actividadesEspecialesLocalService.updateActividadesEspeciales(actividadesEspeciales);
	}

	@Override
	public ActividadesEspecialesLocalService getWrappedService() {
		return _actividadesEspecialesLocalService;
	}

	@Override
	public void setWrappedService(
		ActividadesEspecialesLocalService actividadesEspecialesLocalService) {
		_actividadesEspecialesLocalService = actividadesEspecialesLocalService;
	}

	private ActividadesEspecialesLocalService _actividadesEspecialesLocalService;
}