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

import com.eulen.actividades.service.model.ActividadesEspeciales;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

import java.util.List;

/**
 * The persistence utility for the actividades especiales service. This utility wraps {@link com.eulen.actividades.service.service.persistence.impl.ActividadesEspecialesPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ActividadesEspecialesPersistence
 * @see com.eulen.actividades.service.service.persistence.impl.ActividadesEspecialesPersistenceImpl
 * @generated
 */
@ProviderType
public class ActividadesEspecialesUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(ActividadesEspeciales actividadesEspeciales) {
		getPersistence().clearCache(actividadesEspeciales);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ActividadesEspeciales> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ActividadesEspeciales> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ActividadesEspeciales> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<ActividadesEspeciales> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static ActividadesEspeciales update(
		ActividadesEspeciales actividadesEspeciales) {
		return getPersistence().update(actividadesEspeciales);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static ActividadesEspeciales update(
		ActividadesEspeciales actividadesEspeciales,
		ServiceContext serviceContext) {
		return getPersistence().update(actividadesEspeciales, serviceContext);
	}

	/**
	* Returns all the actividades especialeses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching actividades especialeses
	*/
	public static List<ActividadesEspeciales> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

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
	public static List<ActividadesEspeciales> findByUuid(String uuid,
		int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

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
	public static List<ActividadesEspeciales> findByUuid(String uuid,
		int start, int end,
		OrderByComparator<ActividadesEspeciales> orderByComparator) {
		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

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
	public static List<ActividadesEspeciales> findByUuid(String uuid,
		int start, int end,
		OrderByComparator<ActividadesEspeciales> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findByUuid(uuid, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first actividades especiales in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching actividades especiales
	* @throws NoSuchActividadesEspecialesException if a matching actividades especiales could not be found
	*/
	public static ActividadesEspeciales findByUuid_First(String uuid,
		OrderByComparator<ActividadesEspeciales> orderByComparator)
		throws com.eulen.actividades.service.exception.NoSuchActividadesEspecialesException {
		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the first actividades especiales in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching actividades especiales, or <code>null</code> if a matching actividades especiales could not be found
	*/
	public static ActividadesEspeciales fetchByUuid_First(String uuid,
		OrderByComparator<ActividadesEspeciales> orderByComparator) {
		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	* Returns the last actividades especiales in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching actividades especiales
	* @throws NoSuchActividadesEspecialesException if a matching actividades especiales could not be found
	*/
	public static ActividadesEspeciales findByUuid_Last(String uuid,
		OrderByComparator<ActividadesEspeciales> orderByComparator)
		throws com.eulen.actividades.service.exception.NoSuchActividadesEspecialesException {
		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the last actividades especiales in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching actividades especiales, or <code>null</code> if a matching actividades especiales could not be found
	*/
	public static ActividadesEspeciales fetchByUuid_Last(String uuid,
		OrderByComparator<ActividadesEspeciales> orderByComparator) {
		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	* Returns the actividades especialeses before and after the current actividades especiales in the ordered set where uuid = &#63;.
	*
	* @param actividadId the primary key of the current actividades especiales
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next actividades especiales
	* @throws NoSuchActividadesEspecialesException if a actividades especiales with the primary key could not be found
	*/
	public static ActividadesEspeciales[] findByUuid_PrevAndNext(
		long actividadId, String uuid,
		OrderByComparator<ActividadesEspeciales> orderByComparator)
		throws com.eulen.actividades.service.exception.NoSuchActividadesEspecialesException {
		return getPersistence()
				   .findByUuid_PrevAndNext(actividadId, uuid, orderByComparator);
	}

	/**
	* Removes all the actividades especialeses where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	* Returns the number of actividades especialeses where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching actividades especialeses
	*/
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	* Returns the actividades especiales where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchActividadesEspecialesException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching actividades especiales
	* @throws NoSuchActividadesEspecialesException if a matching actividades especiales could not be found
	*/
	public static ActividadesEspeciales findByUUID_G(String uuid, long groupId)
		throws com.eulen.actividades.service.exception.NoSuchActividadesEspecialesException {
		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	* Returns the actividades especiales where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching actividades especiales, or <code>null</code> if a matching actividades especiales could not be found
	*/
	public static ActividadesEspeciales fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	* Returns the actividades especiales where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching actividades especiales, or <code>null</code> if a matching actividades especiales could not be found
	*/
	public static ActividadesEspeciales fetchByUUID_G(String uuid,
		long groupId, boolean retrieveFromCache) {
		return getPersistence().fetchByUUID_G(uuid, groupId, retrieveFromCache);
	}

	/**
	* Removes the actividades especiales where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the actividades especiales that was removed
	*/
	public static ActividadesEspeciales removeByUUID_G(String uuid, long groupId)
		throws com.eulen.actividades.service.exception.NoSuchActividadesEspecialesException {
		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	* Returns the number of actividades especialeses where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching actividades especialeses
	*/
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	* Returns all the actividades especialeses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the matching actividades especialeses
	*/
	public static List<ActividadesEspeciales> findBySite(long groupId) {
		return getPersistence().findBySite(groupId);
	}

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
	public static List<ActividadesEspeciales> findBySite(long groupId,
		int start, int end) {
		return getPersistence().findBySite(groupId, start, end);
	}

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
	public static List<ActividadesEspeciales> findBySite(long groupId,
		int start, int end,
		OrderByComparator<ActividadesEspeciales> orderByComparator) {
		return getPersistence()
				   .findBySite(groupId, start, end, orderByComparator);
	}

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
	public static List<ActividadesEspeciales> findBySite(long groupId,
		int start, int end,
		OrderByComparator<ActividadesEspeciales> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findBySite(groupId, start, end, orderByComparator,
			retrieveFromCache);
	}

	/**
	* Returns the first actividades especiales in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching actividades especiales
	* @throws NoSuchActividadesEspecialesException if a matching actividades especiales could not be found
	*/
	public static ActividadesEspeciales findBySite_First(long groupId,
		OrderByComparator<ActividadesEspeciales> orderByComparator)
		throws com.eulen.actividades.service.exception.NoSuchActividadesEspecialesException {
		return getPersistence().findBySite_First(groupId, orderByComparator);
	}

	/**
	* Returns the first actividades especiales in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching actividades especiales, or <code>null</code> if a matching actividades especiales could not be found
	*/
	public static ActividadesEspeciales fetchBySite_First(long groupId,
		OrderByComparator<ActividadesEspeciales> orderByComparator) {
		return getPersistence().fetchBySite_First(groupId, orderByComparator);
	}

	/**
	* Returns the last actividades especiales in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching actividades especiales
	* @throws NoSuchActividadesEspecialesException if a matching actividades especiales could not be found
	*/
	public static ActividadesEspeciales findBySite_Last(long groupId,
		OrderByComparator<ActividadesEspeciales> orderByComparator)
		throws com.eulen.actividades.service.exception.NoSuchActividadesEspecialesException {
		return getPersistence().findBySite_Last(groupId, orderByComparator);
	}

	/**
	* Returns the last actividades especiales in the ordered set where groupId = &#63;.
	*
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching actividades especiales, or <code>null</code> if a matching actividades especiales could not be found
	*/
	public static ActividadesEspeciales fetchBySite_Last(long groupId,
		OrderByComparator<ActividadesEspeciales> orderByComparator) {
		return getPersistence().fetchBySite_Last(groupId, orderByComparator);
	}

	/**
	* Returns the actividades especialeses before and after the current actividades especiales in the ordered set where groupId = &#63;.
	*
	* @param actividadId the primary key of the current actividades especiales
	* @param groupId the group ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next actividades especiales
	* @throws NoSuchActividadesEspecialesException if a actividades especiales with the primary key could not be found
	*/
	public static ActividadesEspeciales[] findBySite_PrevAndNext(
		long actividadId, long groupId,
		OrderByComparator<ActividadesEspeciales> orderByComparator)
		throws com.eulen.actividades.service.exception.NoSuchActividadesEspecialesException {
		return getPersistence()
				   .findBySite_PrevAndNext(actividadId, groupId,
			orderByComparator);
	}

	/**
	* Removes all the actividades especialeses where groupId = &#63; from the database.
	*
	* @param groupId the group ID
	*/
	public static void removeBySite(long groupId) {
		getPersistence().removeBySite(groupId);
	}

	/**
	* Returns the number of actividades especialeses where groupId = &#63;.
	*
	* @param groupId the group ID
	* @return the number of matching actividades especialeses
	*/
	public static int countBySite(long groupId) {
		return getPersistence().countBySite(groupId);
	}

	/**
	* Caches the actividades especiales in the entity cache if it is enabled.
	*
	* @param actividadesEspeciales the actividades especiales
	*/
	public static void cacheResult(ActividadesEspeciales actividadesEspeciales) {
		getPersistence().cacheResult(actividadesEspeciales);
	}

	/**
	* Caches the actividades especialeses in the entity cache if it is enabled.
	*
	* @param actividadesEspecialeses the actividades especialeses
	*/
	public static void cacheResult(
		List<ActividadesEspeciales> actividadesEspecialeses) {
		getPersistence().cacheResult(actividadesEspecialeses);
	}

	/**
	* Creates a new actividades especiales with the primary key. Does not add the actividades especiales to the database.
	*
	* @param actividadId the primary key for the new actividades especiales
	* @return the new actividades especiales
	*/
	public static ActividadesEspeciales create(long actividadId) {
		return getPersistence().create(actividadId);
	}

	/**
	* Removes the actividades especiales with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param actividadId the primary key of the actividades especiales
	* @return the actividades especiales that was removed
	* @throws NoSuchActividadesEspecialesException if a actividades especiales with the primary key could not be found
	*/
	public static ActividadesEspeciales remove(long actividadId)
		throws com.eulen.actividades.service.exception.NoSuchActividadesEspecialesException {
		return getPersistence().remove(actividadId);
	}

	public static ActividadesEspeciales updateImpl(
		ActividadesEspeciales actividadesEspeciales) {
		return getPersistence().updateImpl(actividadesEspeciales);
	}

	/**
	* Returns the actividades especiales with the primary key or throws a {@link NoSuchActividadesEspecialesException} if it could not be found.
	*
	* @param actividadId the primary key of the actividades especiales
	* @return the actividades especiales
	* @throws NoSuchActividadesEspecialesException if a actividades especiales with the primary key could not be found
	*/
	public static ActividadesEspeciales findByPrimaryKey(long actividadId)
		throws com.eulen.actividades.service.exception.NoSuchActividadesEspecialesException {
		return getPersistence().findByPrimaryKey(actividadId);
	}

	/**
	* Returns the actividades especiales with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param actividadId the primary key of the actividades especiales
	* @return the actividades especiales, or <code>null</code> if a actividades especiales with the primary key could not be found
	*/
	public static ActividadesEspeciales fetchByPrimaryKey(long actividadId) {
		return getPersistence().fetchByPrimaryKey(actividadId);
	}

	public static java.util.Map<java.io.Serializable, ActividadesEspeciales> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the actividades especialeses.
	*
	* @return the actividades especialeses
	*/
	public static List<ActividadesEspeciales> findAll() {
		return getPersistence().findAll();
	}

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
	public static List<ActividadesEspeciales> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

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
	public static List<ActividadesEspeciales> findAll(int start, int end,
		OrderByComparator<ActividadesEspeciales> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

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
	public static List<ActividadesEspeciales> findAll(int start, int end,
		OrderByComparator<ActividadesEspeciales> orderByComparator,
		boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the actividades especialeses from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of actividades especialeses.
	*
	* @return the number of actividades especialeses
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static java.util.Set<String> getBadColumnNames() {
		return getPersistence().getBadColumnNames();
	}

	public static ActividadesEspecialesPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ActividadesEspecialesPersistence, ActividadesEspecialesPersistence> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(ActividadesEspecialesPersistence.class);

		ServiceTracker<ActividadesEspecialesPersistence, ActividadesEspecialesPersistence> serviceTracker =
			new ServiceTracker<ActividadesEspecialesPersistence, ActividadesEspecialesPersistence>(bundle.getBundleContext(),
				ActividadesEspecialesPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}