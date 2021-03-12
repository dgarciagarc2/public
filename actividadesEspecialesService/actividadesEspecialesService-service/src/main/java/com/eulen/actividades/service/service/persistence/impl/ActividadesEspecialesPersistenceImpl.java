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

package com.eulen.actividades.service.service.persistence.impl;

import aQute.bnd.annotation.ProviderType;

import com.eulen.actividades.service.exception.NoSuchActividadesEspecialesException;
import com.eulen.actividades.service.model.ActividadesEspeciales;
import com.eulen.actividades.service.model.impl.ActividadesEspecialesImpl;
import com.eulen.actividades.service.model.impl.ActividadesEspecialesModelImpl;
import com.eulen.actividades.service.service.persistence.ActividadesEspecialesPersistence;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The persistence implementation for the actividades especiales service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ActividadesEspecialesPersistence
 * @see com.eulen.actividades.service.service.persistence.ActividadesEspecialesUtil
 * @generated
 */
@ProviderType
public class ActividadesEspecialesPersistenceImpl extends BasePersistenceImpl<ActividadesEspeciales>
	implements ActividadesEspecialesPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link ActividadesEspecialesUtil} to access the actividades especiales persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = ActividadesEspecialesImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(ActividadesEspecialesModelImpl.ENTITY_CACHE_ENABLED,
			ActividadesEspecialesModelImpl.FINDER_CACHE_ENABLED,
			ActividadesEspecialesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(ActividadesEspecialesModelImpl.ENTITY_CACHE_ENABLED,
			ActividadesEspecialesModelImpl.FINDER_CACHE_ENABLED,
			ActividadesEspecialesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(ActividadesEspecialesModelImpl.ENTITY_CACHE_ENABLED,
			ActividadesEspecialesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID = new FinderPath(ActividadesEspecialesModelImpl.ENTITY_CACHE_ENABLED,
			ActividadesEspecialesModelImpl.FINDER_CACHE_ENABLED,
			ActividadesEspecialesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID = new FinderPath(ActividadesEspecialesModelImpl.ENTITY_CACHE_ENABLED,
			ActividadesEspecialesModelImpl.FINDER_CACHE_ENABLED,
			ActividadesEspecialesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] { String.class.getName() },
			ActividadesEspecialesModelImpl.UUID_COLUMN_BITMASK |
			ActividadesEspecialesModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID = new FinderPath(ActividadesEspecialesModelImpl.ENTITY_CACHE_ENABLED,
			ActividadesEspecialesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] { String.class.getName() });

	/**
	 * Returns all the actividades especialeses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching actividades especialeses
	 */
	@Override
	public List<ActividadesEspeciales> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ActividadesEspeciales> findByUuid(String uuid, int start,
		int end) {
		return findByUuid(uuid, start, end, null);
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
	@Override
	public List<ActividadesEspeciales> findByUuid(String uuid, int start,
		int end, OrderByComparator<ActividadesEspeciales> orderByComparator) {
		return findByUuid(uuid, start, end, orderByComparator, true);
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
	@Override
	public List<ActividadesEspeciales> findByUuid(String uuid, int start,
		int end, OrderByComparator<ActividadesEspeciales> orderByComparator,
		boolean retrieveFromCache) {
		uuid = Objects.toString(uuid, "");

		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_UUID;
			finderArgs = new Object[] { uuid, start, end, orderByComparator };
		}

		List<ActividadesEspeciales> list = null;

		if (retrieveFromCache) {
			list = (List<ActividadesEspeciales>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ActividadesEspeciales actividadesEspeciales : list) {
					if (!uuid.equals(actividadesEspeciales.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_ACTIVIDADESESPECIALES_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ActividadesEspecialesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				if (!pagination) {
					list = (List<ActividadesEspeciales>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ActividadesEspeciales>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first actividades especiales in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching actividades especiales
	 * @throws NoSuchActividadesEspecialesException if a matching actividades especiales could not be found
	 */
	@Override
	public ActividadesEspeciales findByUuid_First(String uuid,
		OrderByComparator<ActividadesEspeciales> orderByComparator)
		throws NoSuchActividadesEspecialesException {
		ActividadesEspeciales actividadesEspeciales = fetchByUuid_First(uuid,
				orderByComparator);

		if (actividadesEspeciales != null) {
			return actividadesEspeciales;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchActividadesEspecialesException(msg.toString());
	}

	/**
	 * Returns the first actividades especiales in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching actividades especiales, or <code>null</code> if a matching actividades especiales could not be found
	 */
	@Override
	public ActividadesEspeciales fetchByUuid_First(String uuid,
		OrderByComparator<ActividadesEspeciales> orderByComparator) {
		List<ActividadesEspeciales> list = findByUuid(uuid, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last actividades especiales in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching actividades especiales
	 * @throws NoSuchActividadesEspecialesException if a matching actividades especiales could not be found
	 */
	@Override
	public ActividadesEspeciales findByUuid_Last(String uuid,
		OrderByComparator<ActividadesEspeciales> orderByComparator)
		throws NoSuchActividadesEspecialesException {
		ActividadesEspeciales actividadesEspeciales = fetchByUuid_Last(uuid,
				orderByComparator);

		if (actividadesEspeciales != null) {
			return actividadesEspeciales;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchActividadesEspecialesException(msg.toString());
	}

	/**
	 * Returns the last actividades especiales in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching actividades especiales, or <code>null</code> if a matching actividades especiales could not be found
	 */
	@Override
	public ActividadesEspeciales fetchByUuid_Last(String uuid,
		OrderByComparator<ActividadesEspeciales> orderByComparator) {
		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<ActividadesEspeciales> list = findByUuid(uuid, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ActividadesEspeciales[] findByUuid_PrevAndNext(long actividadId,
		String uuid, OrderByComparator<ActividadesEspeciales> orderByComparator)
		throws NoSuchActividadesEspecialesException {
		uuid = Objects.toString(uuid, "");

		ActividadesEspeciales actividadesEspeciales = findByPrimaryKey(actividadId);

		Session session = null;

		try {
			session = openSession();

			ActividadesEspeciales[] array = new ActividadesEspecialesImpl[3];

			array[0] = getByUuid_PrevAndNext(session, actividadesEspeciales,
					uuid, orderByComparator, true);

			array[1] = actividadesEspeciales;

			array[2] = getByUuid_PrevAndNext(session, actividadesEspeciales,
					uuid, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ActividadesEspeciales getByUuid_PrevAndNext(Session session,
		ActividadesEspeciales actividadesEspeciales, String uuid,
		OrderByComparator<ActividadesEspeciales> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ACTIVIDADESESPECIALES_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ActividadesEspecialesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(actividadesEspeciales);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ActividadesEspeciales> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the actividades especialeses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (ActividadesEspeciales actividadesEspeciales : findByUuid(uuid,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(actividadesEspeciales);
		}
	}

	/**
	 * Returns the number of actividades especialeses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching actividades especialeses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID;

		Object[] finderArgs = new Object[] { uuid };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ACTIVIDADESESPECIALES_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_1 = "actividadesEspeciales.uuid IS NULL";
	private static final String _FINDER_COLUMN_UUID_UUID_2 = "actividadesEspeciales.uuid = ?";
	private static final String _FINDER_COLUMN_UUID_UUID_3 = "(actividadesEspeciales.uuid IS NULL OR actividadesEspeciales.uuid = '')";
	public static final FinderPath FINDER_PATH_FETCH_BY_UUID_G = new FinderPath(ActividadesEspecialesModelImpl.ENTITY_CACHE_ENABLED,
			ActividadesEspecialesModelImpl.FINDER_CACHE_ENABLED,
			ActividadesEspecialesImpl.class, FINDER_CLASS_NAME_ENTITY,
			"fetchByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() },
			ActividadesEspecialesModelImpl.UUID_COLUMN_BITMASK |
			ActividadesEspecialesModelImpl.GROUPID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_UUID_G = new FinderPath(ActividadesEspecialesModelImpl.ENTITY_CACHE_ENABLED,
			ActividadesEspecialesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns the actividades especiales where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchActividadesEspecialesException} if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching actividades especiales
	 * @throws NoSuchActividadesEspecialesException if a matching actividades especiales could not be found
	 */
	@Override
	public ActividadesEspeciales findByUUID_G(String uuid, long groupId)
		throws NoSuchActividadesEspecialesException {
		ActividadesEspeciales actividadesEspeciales = fetchByUUID_G(uuid,
				groupId);

		if (actividadesEspeciales == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchActividadesEspecialesException(msg.toString());
		}

		return actividadesEspeciales;
	}

	/**
	 * Returns the actividades especiales where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching actividades especiales, or <code>null</code> if a matching actividades especiales could not be found
	 */
	@Override
	public ActividadesEspeciales fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the actividades especiales where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param retrieveFromCache whether to retrieve from the finder cache
	 * @return the matching actividades especiales, or <code>null</code> if a matching actividades especiales could not be found
	 */
	@Override
	public ActividadesEspeciales fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache) {
		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = new Object[] { uuid, groupId };

		Object result = null;

		if (retrieveFromCache) {
			result = finderCache.getResult(FINDER_PATH_FETCH_BY_UUID_G,
					finderArgs, this);
		}

		if (result instanceof ActividadesEspeciales) {
			ActividadesEspeciales actividadesEspeciales = (ActividadesEspeciales)result;

			if (!Objects.equals(uuid, actividadesEspeciales.getUuid()) ||
					(groupId != actividadesEspeciales.getGroupId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_ACTIVIDADESESPECIALES_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<ActividadesEspeciales> list = q.list();

				if (list.isEmpty()) {
					finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
						finderArgs, list);
				}
				else {
					ActividadesEspeciales actividadesEspeciales = list.get(0);

					result = actividadesEspeciales;

					cacheResult(actividadesEspeciales);
				}
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (ActividadesEspeciales)result;
		}
	}

	/**
	 * Removes the actividades especiales where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the actividades especiales that was removed
	 */
	@Override
	public ActividadesEspeciales removeByUUID_G(String uuid, long groupId)
		throws NoSuchActividadesEspecialesException {
		ActividadesEspeciales actividadesEspeciales = findByUUID_G(uuid, groupId);

		return remove(actividadesEspeciales);
	}

	/**
	 * Returns the number of actividades especialeses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching actividades especialeses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = FINDER_PATH_COUNT_BY_UUID_G;

		Object[] finderArgs = new Object[] { uuid, groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_ACTIVIDADESESPECIALES_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_1 = "actividadesEspeciales.uuid IS NULL AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_2 = "actividadesEspeciales.uuid = ? AND ";
	private static final String _FINDER_COLUMN_UUID_G_UUID_3 = "(actividadesEspeciales.uuid IS NULL OR actividadesEspeciales.uuid = '') AND ";
	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 = "actividadesEspeciales.groupId = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_SITE = new FinderPath(ActividadesEspecialesModelImpl.ENTITY_CACHE_ENABLED,
			ActividadesEspecialesModelImpl.FINDER_CACHE_ENABLED,
			ActividadesEspecialesImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBySite",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITE = new FinderPath(ActividadesEspecialesModelImpl.ENTITY_CACHE_ENABLED,
			ActividadesEspecialesModelImpl.FINDER_CACHE_ENABLED,
			ActividadesEspecialesImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBySite",
			new String[] { Long.class.getName() },
			ActividadesEspecialesModelImpl.GROUPID_COLUMN_BITMASK |
			ActividadesEspecialesModelImpl.CREATEDATE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_SITE = new FinderPath(ActividadesEspecialesModelImpl.ENTITY_CACHE_ENABLED,
			ActividadesEspecialesModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBySite",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the actividades especialeses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching actividades especialeses
	 */
	@Override
	public List<ActividadesEspeciales> findBySite(long groupId) {
		return findBySite(groupId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ActividadesEspeciales> findBySite(long groupId, int start,
		int end) {
		return findBySite(groupId, start, end, null);
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
	@Override
	public List<ActividadesEspeciales> findBySite(long groupId, int start,
		int end, OrderByComparator<ActividadesEspeciales> orderByComparator) {
		return findBySite(groupId, start, end, orderByComparator, true);
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
	@Override
	public List<ActividadesEspeciales> findBySite(long groupId, int start,
		int end, OrderByComparator<ActividadesEspeciales> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITE;
			finderArgs = new Object[] { groupId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_SITE;
			finderArgs = new Object[] { groupId, start, end, orderByComparator };
		}

		List<ActividadesEspeciales> list = null;

		if (retrieveFromCache) {
			list = (List<ActividadesEspeciales>)finderCache.getResult(finderPath,
					finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (ActividadesEspeciales actividadesEspeciales : list) {
					if ((groupId != actividadesEspeciales.getGroupId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_ACTIVIDADESESPECIALES_WHERE);

			query.append(_FINDER_COLUMN_SITE_GROUPID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(ActividadesEspecialesModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				if (!pagination) {
					list = (List<ActividadesEspeciales>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ActividadesEspeciales>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first actividades especiales in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching actividades especiales
	 * @throws NoSuchActividadesEspecialesException if a matching actividades especiales could not be found
	 */
	@Override
	public ActividadesEspeciales findBySite_First(long groupId,
		OrderByComparator<ActividadesEspeciales> orderByComparator)
		throws NoSuchActividadesEspecialesException {
		ActividadesEspeciales actividadesEspeciales = fetchBySite_First(groupId,
				orderByComparator);

		if (actividadesEspeciales != null) {
			return actividadesEspeciales;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append("}");

		throw new NoSuchActividadesEspecialesException(msg.toString());
	}

	/**
	 * Returns the first actividades especiales in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching actividades especiales, or <code>null</code> if a matching actividades especiales could not be found
	 */
	@Override
	public ActividadesEspeciales fetchBySite_First(long groupId,
		OrderByComparator<ActividadesEspeciales> orderByComparator) {
		List<ActividadesEspeciales> list = findBySite(groupId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last actividades especiales in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching actividades especiales
	 * @throws NoSuchActividadesEspecialesException if a matching actividades especiales could not be found
	 */
	@Override
	public ActividadesEspeciales findBySite_Last(long groupId,
		OrderByComparator<ActividadesEspeciales> orderByComparator)
		throws NoSuchActividadesEspecialesException {
		ActividadesEspeciales actividadesEspeciales = fetchBySite_Last(groupId,
				orderByComparator);

		if (actividadesEspeciales != null) {
			return actividadesEspeciales;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("groupId=");
		msg.append(groupId);

		msg.append("}");

		throw new NoSuchActividadesEspecialesException(msg.toString());
	}

	/**
	 * Returns the last actividades especiales in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching actividades especiales, or <code>null</code> if a matching actividades especiales could not be found
	 */
	@Override
	public ActividadesEspeciales fetchBySite_Last(long groupId,
		OrderByComparator<ActividadesEspeciales> orderByComparator) {
		int count = countBySite(groupId);

		if (count == 0) {
			return null;
		}

		List<ActividadesEspeciales> list = findBySite(groupId, count - 1,
				count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public ActividadesEspeciales[] findBySite_PrevAndNext(long actividadId,
		long groupId, OrderByComparator<ActividadesEspeciales> orderByComparator)
		throws NoSuchActividadesEspecialesException {
		ActividadesEspeciales actividadesEspeciales = findByPrimaryKey(actividadId);

		Session session = null;

		try {
			session = openSession();

			ActividadesEspeciales[] array = new ActividadesEspecialesImpl[3];

			array[0] = getBySite_PrevAndNext(session, actividadesEspeciales,
					groupId, orderByComparator, true);

			array[1] = actividadesEspeciales;

			array[2] = getBySite_PrevAndNext(session, actividadesEspeciales,
					groupId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected ActividadesEspeciales getBySite_PrevAndNext(Session session,
		ActividadesEspeciales actividadesEspeciales, long groupId,
		OrderByComparator<ActividadesEspeciales> orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(4 +
					(orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_ACTIVIDADESESPECIALES_WHERE);

		query.append(_FINDER_COLUMN_SITE_GROUPID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ActividadesEspecialesModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(groupId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(actividadesEspeciales);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<ActividadesEspeciales> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the actividades especialeses where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	@Override
	public void removeBySite(long groupId) {
		for (ActividadesEspeciales actividadesEspeciales : findBySite(groupId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(actividadesEspeciales);
		}
	}

	/**
	 * Returns the number of actividades especialeses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching actividades especialeses
	 */
	@Override
	public int countBySite(long groupId) {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_SITE;

		Object[] finderArgs = new Object[] { groupId };

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_ACTIVIDADESESPECIALES_WHERE);

			query.append(_FINDER_COLUMN_SITE_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_SITE_GROUPID_2 = "actividadesEspeciales.groupId = ?";

	public ActividadesEspecialesPersistenceImpl() {
		setModelClass(ActividadesEspeciales.class);

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
					"_dbColumnNames");

			field.setAccessible(true);

			Map<String, String> dbColumnNames = new HashMap<String, String>();

			dbColumnNames.put("uuid", "uuid_");
			dbColumnNames.put("text", "text_");

			field.set(this, dbColumnNames);
		}
		catch (Exception e) {
			if (_log.isDebugEnabled()) {
				_log.debug(e, e);
			}
		}
	}

	/**
	 * Caches the actividades especiales in the entity cache if it is enabled.
	 *
	 * @param actividadesEspeciales the actividades especiales
	 */
	@Override
	public void cacheResult(ActividadesEspeciales actividadesEspeciales) {
		entityCache.putResult(ActividadesEspecialesModelImpl.ENTITY_CACHE_ENABLED,
			ActividadesEspecialesImpl.class,
			actividadesEspeciales.getPrimaryKey(), actividadesEspeciales);

		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G,
			new Object[] {
				actividadesEspeciales.getUuid(),
				actividadesEspeciales.getGroupId()
			}, actividadesEspeciales);

		actividadesEspeciales.resetOriginalValues();
	}

	/**
	 * Caches the actividades especialeses in the entity cache if it is enabled.
	 *
	 * @param actividadesEspecialeses the actividades especialeses
	 */
	@Override
	public void cacheResult(List<ActividadesEspeciales> actividadesEspecialeses) {
		for (ActividadesEspeciales actividadesEspeciales : actividadesEspecialeses) {
			if (entityCache.getResult(
						ActividadesEspecialesModelImpl.ENTITY_CACHE_ENABLED,
						ActividadesEspecialesImpl.class,
						actividadesEspeciales.getPrimaryKey()) == null) {
				cacheResult(actividadesEspeciales);
			}
			else {
				actividadesEspeciales.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all actividades especialeses.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ActividadesEspecialesImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the actividades especiales.
	 *
	 * <p>
	 * The {@link EntityCache} and {@link FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(ActividadesEspeciales actividadesEspeciales) {
		entityCache.removeResult(ActividadesEspecialesModelImpl.ENTITY_CACHE_ENABLED,
			ActividadesEspecialesImpl.class,
			actividadesEspeciales.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((ActividadesEspecialesModelImpl)actividadesEspeciales,
			true);
	}

	@Override
	public void clearCache(List<ActividadesEspeciales> actividadesEspecialeses) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (ActividadesEspeciales actividadesEspeciales : actividadesEspecialeses) {
			entityCache.removeResult(ActividadesEspecialesModelImpl.ENTITY_CACHE_ENABLED,
				ActividadesEspecialesImpl.class,
				actividadesEspeciales.getPrimaryKey());

			clearUniqueFindersCache((ActividadesEspecialesModelImpl)actividadesEspeciales,
				true);
		}
	}

	protected void cacheUniqueFindersCache(
		ActividadesEspecialesModelImpl actividadesEspecialesModelImpl) {
		Object[] args = new Object[] {
				actividadesEspecialesModelImpl.getUuid(),
				actividadesEspecialesModelImpl.getGroupId()
			};

		finderCache.putResult(FINDER_PATH_COUNT_BY_UUID_G, args,
			Long.valueOf(1), false);
		finderCache.putResult(FINDER_PATH_FETCH_BY_UUID_G, args,
			actividadesEspecialesModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		ActividadesEspecialesModelImpl actividadesEspecialesModelImpl,
		boolean clearCurrent) {
		if (clearCurrent) {
			Object[] args = new Object[] {
					actividadesEspecialesModelImpl.getUuid(),
					actividadesEspecialesModelImpl.getGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}

		if ((actividadesEspecialesModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_UUID_G.getColumnBitmask()) != 0) {
			Object[] args = new Object[] {
					actividadesEspecialesModelImpl.getOriginalUuid(),
					actividadesEspecialesModelImpl.getOriginalGroupId()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID_G, args);
			finderCache.removeResult(FINDER_PATH_FETCH_BY_UUID_G, args);
		}
	}

	/**
	 * Creates a new actividades especiales with the primary key. Does not add the actividades especiales to the database.
	 *
	 * @param actividadId the primary key for the new actividades especiales
	 * @return the new actividades especiales
	 */
	@Override
	public ActividadesEspeciales create(long actividadId) {
		ActividadesEspeciales actividadesEspeciales = new ActividadesEspecialesImpl();

		actividadesEspeciales.setNew(true);
		actividadesEspeciales.setPrimaryKey(actividadId);

		String uuid = PortalUUIDUtil.generate();

		actividadesEspeciales.setUuid(uuid);

		return actividadesEspeciales;
	}

	/**
	 * Removes the actividades especiales with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param actividadId the primary key of the actividades especiales
	 * @return the actividades especiales that was removed
	 * @throws NoSuchActividadesEspecialesException if a actividades especiales with the primary key could not be found
	 */
	@Override
	public ActividadesEspeciales remove(long actividadId)
		throws NoSuchActividadesEspecialesException {
		return remove((Serializable)actividadId);
	}

	/**
	 * Removes the actividades especiales with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the actividades especiales
	 * @return the actividades especiales that was removed
	 * @throws NoSuchActividadesEspecialesException if a actividades especiales with the primary key could not be found
	 */
	@Override
	public ActividadesEspeciales remove(Serializable primaryKey)
		throws NoSuchActividadesEspecialesException {
		Session session = null;

		try {
			session = openSession();

			ActividadesEspeciales actividadesEspeciales = (ActividadesEspeciales)session.get(ActividadesEspecialesImpl.class,
					primaryKey);

			if (actividadesEspeciales == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchActividadesEspecialesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(actividadesEspeciales);
		}
		catch (NoSuchActividadesEspecialesException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected ActividadesEspeciales removeImpl(
		ActividadesEspeciales actividadesEspeciales) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(actividadesEspeciales)) {
				actividadesEspeciales = (ActividadesEspeciales)session.get(ActividadesEspecialesImpl.class,
						actividadesEspeciales.getPrimaryKeyObj());
			}

			if (actividadesEspeciales != null) {
				session.delete(actividadesEspeciales);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (actividadesEspeciales != null) {
			clearCache(actividadesEspeciales);
		}

		return actividadesEspeciales;
	}

	@Override
	public ActividadesEspeciales updateImpl(
		ActividadesEspeciales actividadesEspeciales) {
		boolean isNew = actividadesEspeciales.isNew();

		if (!(actividadesEspeciales instanceof ActividadesEspecialesModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(actividadesEspeciales.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(actividadesEspeciales);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in actividadesEspeciales proxy " +
					invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom ActividadesEspeciales implementation " +
				actividadesEspeciales.getClass());
		}

		ActividadesEspecialesModelImpl actividadesEspecialesModelImpl = (ActividadesEspecialesModelImpl)actividadesEspeciales;

		if (Validator.isNull(actividadesEspeciales.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			actividadesEspeciales.setUuid(uuid);
		}

		Session session = null;

		try {
			session = openSession();

			if (actividadesEspeciales.isNew()) {
				session.save(actividadesEspeciales);

				actividadesEspeciales.setNew(false);
			}
			else {
				actividadesEspeciales = (ActividadesEspeciales)session.merge(actividadesEspeciales);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!ActividadesEspecialesModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else
		 if (isNew) {
			Object[] args = new Object[] {
					actividadesEspecialesModelImpl.getUuid()
				};

			finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
				args);

			args = new Object[] { actividadesEspecialesModelImpl.getGroupId() };

			finderCache.removeResult(FINDER_PATH_COUNT_BY_SITE, args);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITE,
				args);

			finderCache.removeResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY);
			finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL,
				FINDER_ARGS_EMPTY);
		}

		else {
			if ((actividadesEspecialesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						actividadesEspecialesModelImpl.getOriginalUuid()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);

				args = new Object[] { actividadesEspecialesModelImpl.getUuid() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_UUID, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_UUID,
					args);
			}

			if ((actividadesEspecialesModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						actividadesEspecialesModelImpl.getOriginalGroupId()
					};

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SITE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITE,
					args);

				args = new Object[] { actividadesEspecialesModelImpl.getGroupId() };

				finderCache.removeResult(FINDER_PATH_COUNT_BY_SITE, args);
				finderCache.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_SITE,
					args);
			}
		}

		entityCache.putResult(ActividadesEspecialesModelImpl.ENTITY_CACHE_ENABLED,
			ActividadesEspecialesImpl.class,
			actividadesEspeciales.getPrimaryKey(), actividadesEspeciales, false);

		clearUniqueFindersCache(actividadesEspecialesModelImpl, false);
		cacheUniqueFindersCache(actividadesEspecialesModelImpl);

		actividadesEspeciales.resetOriginalValues();

		return actividadesEspeciales;
	}

	/**
	 * Returns the actividades especiales with the primary key or throws a {@link com.liferay.portal.kernel.exception.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the actividades especiales
	 * @return the actividades especiales
	 * @throws NoSuchActividadesEspecialesException if a actividades especiales with the primary key could not be found
	 */
	@Override
	public ActividadesEspeciales findByPrimaryKey(Serializable primaryKey)
		throws NoSuchActividadesEspecialesException {
		ActividadesEspeciales actividadesEspeciales = fetchByPrimaryKey(primaryKey);

		if (actividadesEspeciales == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchActividadesEspecialesException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return actividadesEspeciales;
	}

	/**
	 * Returns the actividades especiales with the primary key or throws a {@link NoSuchActividadesEspecialesException} if it could not be found.
	 *
	 * @param actividadId the primary key of the actividades especiales
	 * @return the actividades especiales
	 * @throws NoSuchActividadesEspecialesException if a actividades especiales with the primary key could not be found
	 */
	@Override
	public ActividadesEspeciales findByPrimaryKey(long actividadId)
		throws NoSuchActividadesEspecialesException {
		return findByPrimaryKey((Serializable)actividadId);
	}

	/**
	 * Returns the actividades especiales with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the actividades especiales
	 * @return the actividades especiales, or <code>null</code> if a actividades especiales with the primary key could not be found
	 */
	@Override
	public ActividadesEspeciales fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(ActividadesEspecialesModelImpl.ENTITY_CACHE_ENABLED,
				ActividadesEspecialesImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		ActividadesEspeciales actividadesEspeciales = (ActividadesEspeciales)serializable;

		if (actividadesEspeciales == null) {
			Session session = null;

			try {
				session = openSession();

				actividadesEspeciales = (ActividadesEspeciales)session.get(ActividadesEspecialesImpl.class,
						primaryKey);

				if (actividadesEspeciales != null) {
					cacheResult(actividadesEspeciales);
				}
				else {
					entityCache.putResult(ActividadesEspecialesModelImpl.ENTITY_CACHE_ENABLED,
						ActividadesEspecialesImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception e) {
				entityCache.removeResult(ActividadesEspecialesModelImpl.ENTITY_CACHE_ENABLED,
					ActividadesEspecialesImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return actividadesEspeciales;
	}

	/**
	 * Returns the actividades especiales with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param actividadId the primary key of the actividades especiales
	 * @return the actividades especiales, or <code>null</code> if a actividades especiales with the primary key could not be found
	 */
	@Override
	public ActividadesEspeciales fetchByPrimaryKey(long actividadId) {
		return fetchByPrimaryKey((Serializable)actividadId);
	}

	@Override
	public Map<Serializable, ActividadesEspeciales> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {
		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, ActividadesEspeciales> map = new HashMap<Serializable, ActividadesEspeciales>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			ActividadesEspeciales actividadesEspeciales = fetchByPrimaryKey(primaryKey);

			if (actividadesEspeciales != null) {
				map.put(primaryKey, actividadesEspeciales);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(ActividadesEspecialesModelImpl.ENTITY_CACHE_ENABLED,
					ActividadesEspecialesImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (ActividadesEspeciales)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler((uncachedPrimaryKeys.size() * 2) +
				1);

		query.append(_SQL_SELECT_ACTIVIDADESESPECIALES_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(",");
		}

		query.setIndex(query.index() - 1);

		query.append(")");

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (ActividadesEspeciales actividadesEspeciales : (List<ActividadesEspeciales>)q.list()) {
				map.put(actividadesEspeciales.getPrimaryKeyObj(),
					actividadesEspeciales);

				cacheResult(actividadesEspeciales);

				uncachedPrimaryKeys.remove(actividadesEspeciales.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(ActividadesEspecialesModelImpl.ENTITY_CACHE_ENABLED,
					ActividadesEspecialesImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the actividades especialeses.
	 *
	 * @return the actividades especialeses
	 */
	@Override
	public List<ActividadesEspeciales> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<ActividadesEspeciales> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<ActividadesEspeciales> findAll(int start, int end,
		OrderByComparator<ActividadesEspeciales> orderByComparator) {
		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<ActividadesEspeciales> findAll(int start, int end,
		OrderByComparator<ActividadesEspeciales> orderByComparator,
		boolean retrieveFromCache) {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<ActividadesEspeciales> list = null;

		if (retrieveFromCache) {
			list = (List<ActividadesEspeciales>)finderCache.getResult(finderPath,
					finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_ACTIVIDADESESPECIALES);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ACTIVIDADESESPECIALES;

				if (pagination) {
					sql = sql.concat(ActividadesEspecialesModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<ActividadesEspeciales>)QueryUtil.list(q,
							getDialect(), start, end, false);

					Collections.sort(list);

					list = Collections.unmodifiableList(list);
				}
				else {
					list = (List<ActividadesEspeciales>)QueryUtil.list(q,
							getDialect(), start, end);
				}

				cacheResult(list);

				finderCache.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the actividades especialeses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (ActividadesEspeciales actividadesEspeciales : findAll()) {
			remove(actividadesEspeciales);
		}
	}

	/**
	 * Returns the number of actividades especialeses.
	 *
	 * @return the number of actividades especialeses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ACTIVIDADESESPECIALES);

				count = (Long)q.uniqueResult();

				finderCache.putResult(FINDER_PATH_COUNT_ALL, FINDER_ARGS_EMPTY,
					count);
			}
			catch (Exception e) {
				finderCache.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ActividadesEspecialesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the actividades especiales persistence.
	 */
	public void afterPropertiesSet() {
	}

	public void destroy() {
		entityCache.removeCache(ActividadesEspecialesImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;
	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;
	private static final String _SQL_SELECT_ACTIVIDADESESPECIALES = "SELECT actividadesEspeciales FROM ActividadesEspeciales actividadesEspeciales";
	private static final String _SQL_SELECT_ACTIVIDADESESPECIALES_WHERE_PKS_IN = "SELECT actividadesEspeciales FROM ActividadesEspeciales actividadesEspeciales WHERE actividadId IN (";
	private static final String _SQL_SELECT_ACTIVIDADESESPECIALES_WHERE = "SELECT actividadesEspeciales FROM ActividadesEspeciales actividadesEspeciales WHERE ";
	private static final String _SQL_COUNT_ACTIVIDADESESPECIALES = "SELECT COUNT(actividadesEspeciales) FROM ActividadesEspeciales actividadesEspeciales";
	private static final String _SQL_COUNT_ACTIVIDADESESPECIALES_WHERE = "SELECT COUNT(actividadesEspeciales) FROM ActividadesEspeciales actividadesEspeciales WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "actividadesEspeciales.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No ActividadesEspeciales exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No ActividadesEspeciales exists with the key {";
	private static final Log _log = LogFactoryUtil.getLog(ActividadesEspecialesPersistenceImpl.class);
	private static final Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"uuid", "text"
			});
}