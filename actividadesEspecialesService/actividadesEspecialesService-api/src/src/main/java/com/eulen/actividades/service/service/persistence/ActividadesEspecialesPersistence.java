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

package com.eulen.actividades.service.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.eulen.actividades.service.exception.NoSuchActividadesEspecialesException;
import com.eulen.actividades.service.model.ActividadesEspeciales;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the actividades especiales service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.eulen.actividades.service.service.persistence.impl.ActividadesEspecialesPersistenceImpl
 * @see ActividadesEspecialesUtil
 * @generated
 */
@ProviderType
public interface ActividadesEspecialesPersistence extends BasePersistence<ActividadesEspeciales> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ActividadesEspecialesUtil} to access the actividades especiales persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the actividades especialeses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching actividades especialeses
	*/
	public java.util.List<ActividadesEspeciales> findByUuid(
		java.lang.String uuid);

	/**
	* Returns a range of all the actividades especialeses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ActividadesEspecialesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of actividades especialeses
	* @param end the upper bound of the range of actividades especialeses (not inclusive)
	* @return the range of matching actividades especialeses
	*/
	public java.util.List<ActividadesEspeciales> findByUuid(
		java.lang.String uuid, int start, int end);

	/**
	* Returns an ordered range of all the actividades especialeses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ActividadesEspecialesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of actividades especialeses
	* @param end the upper bound of the range of actividades especialeses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching actividades especialeses
	*/
	public java.util.List<ActividadesEspeciales> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ActividadesEspeciales> orderByComparator);

	/**
	* Returns an ordered range of all the actividades especialeses where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ActividadesEspecialesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of actividades especialeses
	* @param end the upper bound of the range of actividades especialeses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching actividades especialeses
	*/
	public java.util.List<ActividadesEspeciales> findByUuid(
		java.lang.String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ActividadesEspeciales> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first actividades especiales in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching actividades especiales
	* @throws NoSuchActividadesEspecialesException if a matching actividades especiales could not be found
	*/
	public ActividadesEspeciales findByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ActividadesEspeciales> orderByComparator)
		throws NoSuchActividadesEspecialesException;

	/**
	* Returns the first actividades especiales in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching actividades especiales, or <code>null</code> if a matching actividades especiales could not be found
	*/
	public ActividadesEspeciales fetchByUuid_First(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ActividadesEspeciales> orderByComparator);

	/**
	* Returns the last actividades especiales in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching actividades especiales
	* @throws NoSuchActividadesEspecialesException if a matching actividades especiales could not be found
	*/
	public ActividadesEspeciales findByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ActividadesEspeciales> orderByComparator)
		throws NoSuchActividadesEspecialesException;

	/**
	* Returns the last actividades especiales in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching actividades especiales, or <code>null</code> if a matching actividades especiales could not be found
	*/
	public ActividadesEspeciales fetchByUuid_Last(java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ActividadesEspeciales> orderByComparator);

	/**
	* Returns the actividades especialeses before and after the current actividades especiales in the ordered set where uuid = &#63;.
	*
	* @param actividadId the primary key of the current actividades especiales
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next actividades especiales
	* @throws NoSuchActividadesEspecialesException if a actividades especiales with the primary key could not be found
	*/
	public ActividadesEspeciales[] findByUuid_PrevAndNext(long actividadId,
		java.lang.String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<ActividadesEspeciales> orderByComparator)
		throws NoSuchActividadesEspecialesException;

	/**
	* Removes all the actividades especialeses where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(java.lang.String uuid);

	/**
	* Returns the number of actividades especialeses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching actividades especialeses
	*/
	public int countByUuid(java.lang.String uuid);

	/**
	* Returns the actividades especiales where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchActividadesEspecialesException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching actividades especiales
	* @throws NoSuchActividadesEspecialesException if a matching actividades especiales could not be found
	*/
	public ActividadesEspeciales findByUUID_G(java.lang.String uuid,
		long groupId) throws NoSuchActividadesEspecialesException;

	/**
	* Returns the actividades especiales where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching actividades especiales, or <code>null</code> if a matching actividades especiales could not be found
	*/
	public ActividadesEspeciales fetchByUUID_G(java.lang.String uuid,
		long groupId);

	/**
	* Returns the actividades especiales where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching actividades especiales, or <code>null</code> if a matching actividades especiales could not be found
	*/
	public ActividadesEspeciales fetchByUUID_G(java.lang.String uuid,
		long groupId, boolean retrieveFromCache);

	/**
	* Removes the actividades especiales where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the actividades especiales that was removed
	*/
	public ActividadesEspeciales removeByUUID_G(java.lang.String uuid,
		long groupId) throws NoSuchActividadesEspecialesException;

	/**
	* Returns the number of actividades especialeses where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching actividades especialeses
	*/
	public int countByUUID_G(java.lang.String uuid, long groupId);

	/**
	* Returns all the actividades especialeses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching actividades especialeses
	*/
	public java.util.List<ActividadesEspeciales> findBySite(long groupId);

	/**
	* Returns a range of all the actividades especialeses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ActividadesEspecialesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of actividades especialeses
	* @param end the upper bound of the range of actividades especialeses (not inclusive)
	* @return the range of matching actividades especialeses
	*/
	public java.util.List<ActividadesEspeciales> findBySite(long groupId,
		int start, int end);

	/**
	* Returns an ordered range of all the actividades especialeses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ActividadesEspecialesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of actividades especialeses
	* @param end the upper bound of the range of actividades especialeses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching actividades especialeses
	*/
	public java.util.List<ActividadesEspeciales> findBySite(long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ActividadesEspeciales> orderByComparator);

	/**
	* Returns an ordered range of all the actividades especialeses where groupId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ActividadesEspecialesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param groupId the group ID
	* @param start the lower bound of the range of actividades especialeses
	* @param end the upper bound of the range of actividades especialeses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching actividades especialeses
	*/
	public java.util.List<ActividadesEspeciales> findBySite(long groupId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ActividadesEspeciales> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first actividades especiales in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching actividades especiales
	* @throws NoSuchActividadesEspecialesException if a matching actividades especiales could not be found
	*/
	public ActividadesEspeciales findBySite_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<ActividadesEspeciales> orderByComparator)
		throws NoSuchActividadesEspecialesException;

	/**
	* Returns the first actividades especiales in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching actividades especiales, or <code>null</code> if a matching actividades especiales could not be found
	*/
	public ActividadesEspeciales fetchBySite_First(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<ActividadesEspeciales> orderByComparator);

	/**
	* Returns the last actividades especiales in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching actividades especiales
	* @throws NoSuchActividadesEspecialesException if a matching actividades especiales could not be found
	*/
	public ActividadesEspeciales findBySite_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<ActividadesEspeciales> orderByComparator)
		throws NoSuchActividadesEspecialesException;

	/**
	* Returns the last actividades especiales in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching actividades especiales, or <code>null</code> if a matching actividades especiales could not be found
	*/
	public ActividadesEspeciales fetchBySite_Last(long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<ActividadesEspeciales> orderByComparator);

	/**
	* Returns the actividades especialeses before and after the current actividades especiales in the ordered set where groupId = &#63;.
	*
	* @param actividadId the primary key of the current actividades especiales
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next actividades especiales
	* @throws NoSuchActividadesEspecialesException if a actividades especiales with the primary key could not be found
	*/
	public ActividadesEspeciales[] findBySite_PrevAndNext(long actividadId,
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<ActividadesEspeciales> orderByComparator)
		throws NoSuchActividadesEspecialesException;

	/**
	* Removes all the actividades especialeses where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public void removeBySite(long groupId);

	/**
	* Returns the number of actividades especialeses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching actividades especialeses
	*/
	public int countBySite(long groupId);

	/**
	* Caches the actividades especiales in the entity cache if it is enabled.
	*
	* @param actividadesEspeciales the actividades especiales
	*/
	public void cacheResult(ActividadesEspeciales actividadesEspeciales);

	/**
	* Caches the actividades especialeses in the entity cache if it is enabled.
	*
	* @param actividadesEspecialeses the actividades especialeses
	*/
	public void cacheResult(
		java.util.List<ActividadesEspeciales> actividadesEspecialeses);

	/**
	* Creates a new actividades especiales with the primary key. Does not add the actividades especiales to the database.
	*
	* @param actividadId the primary key for the new actividades especiales
	* @return the new actividades especiales
	*/
	public ActividadesEspeciales create(long actividadId);

	/**
	* Removes the actividades especiales with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param actividadId the primary key of the actividades especiales
	* @return the actividades especiales that was removed
	* @throws NoSuchActividadesEspecialesException if a actividades especiales with the primary key could not be found
	*/
	public ActividadesEspeciales remove(long actividadId)
		throws NoSuchActividadesEspecialesException;

	public ActividadesEspeciales updateImpl(
		ActividadesEspeciales actividadesEspeciales);

	/**
	* Returns the actividades especiales with the primary key or throws a {@link NoSuchActividadesEspecialesException} if it could not be found.
	*
	* @param actividadId the primary key of the actividades especiales
	* @return the actividades especiales
	* @throws NoSuchActividadesEspecialesException if a actividades especiales with the primary key could not be found
	*/
	public ActividadesEspeciales findByPrimaryKey(long actividadId)
		throws NoSuchActividadesEspecialesException;

	/**
	* Returns the actividades especiales with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param actividadId the primary key of the actividades especiales
	* @return the actividades especiales, or <code>null</code> if a actividades especiales with the primary key could not be found
	*/
	public ActividadesEspeciales fetchByPrimaryKey(long actividadId);

	@Override
	public java.util.Map<java.io.Serializable, ActividadesEspeciales> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the actividades especialeses.
	*
	* @return the actividades especialeses
	*/
	public java.util.List<ActividadesEspeciales> findAll();

	/**
	* Returns a range of all the actividades especialeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ActividadesEspecialesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of actividades especialeses
	* @param end the upper bound of the range of actividades especialeses (not inclusive)
	* @return the range of actividades especialeses
	*/
	public java.util.List<ActividadesEspeciales> findAll(int start, int end);

	/**
	* Returns an ordered range of all the actividades especialeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ActividadesEspecialesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of actividades especialeses
	* @param end the upper bound of the range of actividades especialeses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of actividades especialeses
	*/
	public java.util.List<ActividadesEspeciales> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ActividadesEspeciales> orderByComparator);

	/**
	* Returns an ordered range of all the actividades especialeses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ActividadesEspecialesModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of actividades especialeses
	* @param end the upper bound of the range of actividades especialeses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of actividades especialeses
	*/
	public java.util.List<ActividadesEspeciales> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<ActividadesEspeciales> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the actividades especialeses from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of actividades especialeses.
	*
	* @return the number of actividades especialeses
	*/
	public int countAll();

	@Override
	public java.util.Set<java.lang.String> getBadColumnNames();
}