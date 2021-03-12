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

package com.eulen.actividades.service.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link ActividadesEspeciales}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ActividadesEspeciales
 * @generated
 */
@ProviderType
public class ActividadesEspecialesWrapper implements ActividadesEspeciales,
	ModelWrapper<ActividadesEspeciales> {
	public ActividadesEspecialesWrapper(
		ActividadesEspeciales actividadesEspeciales) {
		_actividadesEspeciales = actividadesEspeciales;
	}

	@Override
	public Class<?> getModelClass() {
		return ActividadesEspeciales.class;
	}

	@Override
	public String getModelClassName() {
		return ActividadesEspeciales.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("actividadId", getActividadId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("text", getText());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long actividadId = (Long)attributes.get("actividadId");

		if (actividadId != null) {
			setActividadId(actividadId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		String text = (String)attributes.get("text");

		if (text != null) {
			setText(text);
		}
	}

	@Override
	public Object clone() {
		return new ActividadesEspecialesWrapper((ActividadesEspeciales)_actividadesEspeciales.clone());
	}

	@Override
	public int compareTo(ActividadesEspeciales actividadesEspeciales) {
		return _actividadesEspeciales.compareTo(actividadesEspeciales);
	}

	/**
	* Returns the actividad ID of this actividades especiales.
	*
	* @return the actividad ID of this actividades especiales
	*/
	@Override
	public long getActividadId() {
		return _actividadesEspeciales.getActividadId();
	}

	/**
	* Returns the create date of this actividades especiales.
	*
	* @return the create date of this actividades especiales
	*/
	@Override
	public Date getCreateDate() {
		return _actividadesEspeciales.getCreateDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _actividadesEspeciales.getExpandoBridge();
	}

	/**
	* Returns the group ID of this actividades especiales.
	*
	* @return the group ID of this actividades especiales
	*/
	@Override
	public long getGroupId() {
		return _actividadesEspeciales.getGroupId();
	}

	/**
	* Returns the primary key of this actividades especiales.
	*
	* @return the primary key of this actividades especiales
	*/
	@Override
	public long getPrimaryKey() {
		return _actividadesEspeciales.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _actividadesEspeciales.getPrimaryKeyObj();
	}

	/**
	* Returns the text of this actividades especiales.
	*
	* @return the text of this actividades especiales
	*/
	@Override
	public String getText() {
		return _actividadesEspeciales.getText();
	}

	/**
	* Returns the user ID of this actividades especiales.
	*
	* @return the user ID of this actividades especiales
	*/
	@Override
	public long getUserId() {
		return _actividadesEspeciales.getUserId();
	}

	/**
	* Returns the user uuid of this actividades especiales.
	*
	* @return the user uuid of this actividades especiales
	*/
	@Override
	public String getUserUuid() {
		return _actividadesEspeciales.getUserUuid();
	}

	/**
	* Returns the uuid of this actividades especiales.
	*
	* @return the uuid of this actividades especiales
	*/
	@Override
	public String getUuid() {
		return _actividadesEspeciales.getUuid();
	}

	@Override
	public int hashCode() {
		return _actividadesEspeciales.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _actividadesEspeciales.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _actividadesEspeciales.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _actividadesEspeciales.isNew();
	}

	@Override
	public void persist() {
		_actividadesEspeciales.persist();
	}

	/**
	* Sets the actividad ID of this actividades especiales.
	*
	* @param actividadId the actividad ID of this actividades especiales
	*/
	@Override
	public void setActividadId(long actividadId) {
		_actividadesEspeciales.setActividadId(actividadId);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_actividadesEspeciales.setCachedModel(cachedModel);
	}

	/**
	* Sets the create date of this actividades especiales.
	*
	* @param createDate the create date of this actividades especiales
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_actividadesEspeciales.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_actividadesEspeciales.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_actividadesEspeciales.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_actividadesEspeciales.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this actividades especiales.
	*
	* @param groupId the group ID of this actividades especiales
	*/
	@Override
	public void setGroupId(long groupId) {
		_actividadesEspeciales.setGroupId(groupId);
	}

	@Override
	public void setNew(boolean n) {
		_actividadesEspeciales.setNew(n);
	}

	/**
	* Sets the primary key of this actividades especiales.
	*
	* @param primaryKey the primary key of this actividades especiales
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_actividadesEspeciales.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_actividadesEspeciales.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the text of this actividades especiales.
	*
	* @param text the text of this actividades especiales
	*/
	@Override
	public void setText(String text) {
		_actividadesEspeciales.setText(text);
	}

	/**
	* Sets the user ID of this actividades especiales.
	*
	* @param userId the user ID of this actividades especiales
	*/
	@Override
	public void setUserId(long userId) {
		_actividadesEspeciales.setUserId(userId);
	}

	/**
	* Sets the user uuid of this actividades especiales.
	*
	* @param userUuid the user uuid of this actividades especiales
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_actividadesEspeciales.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this actividades especiales.
	*
	* @param uuid the uuid of this actividades especiales
	*/
	@Override
	public void setUuid(String uuid) {
		_actividadesEspeciales.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<ActividadesEspeciales> toCacheModel() {
		return _actividadesEspeciales.toCacheModel();
	}

	@Override
	public ActividadesEspeciales toEscapedModel() {
		return new ActividadesEspecialesWrapper(_actividadesEspeciales.toEscapedModel());
	}

	@Override
	public String toString() {
		return _actividadesEspeciales.toString();
	}

	@Override
	public ActividadesEspeciales toUnescapedModel() {
		return new ActividadesEspecialesWrapper(_actividadesEspeciales.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _actividadesEspeciales.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ActividadesEspecialesWrapper)) {
			return false;
		}

		ActividadesEspecialesWrapper actividadesEspecialesWrapper = (ActividadesEspecialesWrapper)obj;

		if (Objects.equals(_actividadesEspeciales,
					actividadesEspecialesWrapper._actividadesEspeciales)) {
			return true;
		}

		return false;
	}

	@Override
	public ActividadesEspeciales getWrappedModel() {
		return _actividadesEspeciales;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _actividadesEspeciales.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _actividadesEspeciales.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_actividadesEspeciales.resetOriginalValues();
	}

	private final ActividadesEspeciales _actividadesEspeciales;
}