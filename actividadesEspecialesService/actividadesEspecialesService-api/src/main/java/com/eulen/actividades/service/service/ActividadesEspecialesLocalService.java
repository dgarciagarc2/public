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

import com.eulen.actividades.service.model.ActividadesEspeciales;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service interface for ActividadesEspeciales. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see ActividadesEspecialesLocalServiceUtil
 * @see com.eulen.actividades.service.service.base.ActividadesEspecialesLocalServiceBaseImpl
 * @see com.eulen.actividades.service.service.impl.ActividadesEspecialesLocalServiceImpl
 * @generated
 */
@ProviderType
@Transactional(isolation = Isolation.PORTAL, rollbackFor =  {
	PortalException.class, SystemException.class})
public interface ActividadesEspecialesLocalService extends BaseLocalService,
	PersistedModelLocalService {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ActividadesEspecialesLocalServiceUtil} to access the actividades especiales local service. Add custom service methods to {@link com.eulen.actividades.service.service.impl.ActividadesEspecialesLocalServiceImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	* Adds the actividades especiales to the database. Also notifies the appropriate model listeners.
	*
	* @param actividadesEspeciales the actividades especiales
	* @return the actividades especiales that was added
	*/
	@Indexable(type = IndexableType.REINDEX)
	public ActividadesEspeciales addActividadesEspeciales(
		ActividadesEspeciales actividadesEspeciales);

	/**
	* Creates a new actividades especiales with the primary key. Does not add the actividades especiales to the database.
	*
	* @param actividadId the primary key for the new actividades especiales
	* @return the new actividades especiales
	*/
	@Transactional(enabled = false)
	public ActividadesEspeciales createActividadesEspeciales(long actividadId);

	/**
	* Deletes the actividades especiales from the database. Also notifies the appropriate model listeners.
	*
	* @param actividadesEspeciales the actividades especiales
	* @return the actividades especiales that was removed
	*/
	@Indexable(type = IndexableType.DELETE)
	public ActividadesEspeciales deleteActividadesEspeciales(
		ActividadesEspeciales actividadesEspeciales);

	/**
	* Deletes the actividades especiales with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param actividadId the primary key of the actividades especiales
	* @return the actividades especiales that was removed
	* @throws PortalException if a actividades especiales with the primary key could not be found
	*/
	@Indexable(type = IndexableType.DELETE)
	public ActividadesEspeciales deleteActividadesEspeciales(long actividadId)
		throws PortalException;

	/**
	* @throws PortalException
	*/
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery, int start,
		int end, OrderByComparator<T> orderByComparator);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery,
		Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActividadesEspeciales fetchActividadesEspeciales(long actividadId);

	/**
	* Returns the actividades especiales matching the UUID and group.
	*
	* @param uuid the actividades especiales's UUID
	* @param groupId the primary key of the group
	* @return the matching actividades especiales, or <code>null</code> if a matching actividades especiales could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActividadesEspeciales fetchActividadesEspecialesByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	/**
	* Returns the actividades especiales with the primary key.
	*
	* @param actividadId the primary key of the actividades especiales
	* @return the actividades especiales
	* @throws PortalException if a actividades especiales with the primary key could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActividadesEspeciales getActividadesEspeciales(long actividadId)
		throws PortalException;

	/**
	* Returns the actividades especiales matching the UUID and group.
	*
	* @param uuid the actividades especiales's UUID
	* @param groupId the primary key of the group
	* @return the matching actividades especiales
	* @throws PortalException if a matching actividades especiales could not be found
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActividadesEspeciales getActividadesEspecialesByUuidAndGroupId(
		String uuid, long groupId) throws PortalException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<ActividadesEspeciales> getActividadesEspecialeses(int start,
		int end);

	/**
	* Returns the number of actividades especialeses.
	*
	* @return the number of actividades especialeses
	*/
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getActividadesEspecialesesCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public String getOSGiServiceIdentifier();

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	* Updates the actividades especiales in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param actividadesEspeciales the actividades especiales
	* @return the actividades especiales that was updated
	*/
	@Indexable(type = IndexableType.REINDEX)
	public ActividadesEspeciales updateActividadesEspeciales(
		ActividadesEspeciales actividadesEspeciales);
}