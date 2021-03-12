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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.eulen.actividades.service.service.http.ActividadesEspecialesServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.eulen.actividades.service.service.http.ActividadesEspecialesServiceSoap
 * @generated
 */
@ProviderType
public class ActividadesEspecialesSoap implements Serializable {
	public static ActividadesEspecialesSoap toSoapModel(
		ActividadesEspeciales model) {
		ActividadesEspecialesSoap soapModel = new ActividadesEspecialesSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setActividadId(model.getActividadId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setUserId(model.getUserId());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setText(model.getText());

		return soapModel;
	}

	public static ActividadesEspecialesSoap[] toSoapModels(
		ActividadesEspeciales[] models) {
		ActividadesEspecialesSoap[] soapModels = new ActividadesEspecialesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ActividadesEspecialesSoap[][] toSoapModels(
		ActividadesEspeciales[][] models) {
		ActividadesEspecialesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ActividadesEspecialesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ActividadesEspecialesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ActividadesEspecialesSoap[] toSoapModels(
		List<ActividadesEspeciales> models) {
		List<ActividadesEspecialesSoap> soapModels = new ArrayList<ActividadesEspecialesSoap>(models.size());

		for (ActividadesEspeciales model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ActividadesEspecialesSoap[soapModels.size()]);
	}

	public ActividadesEspecialesSoap() {
	}

	public long getPrimaryKey() {
		return _actividadId;
	}

	public void setPrimaryKey(long pk) {
		setActividadId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getActividadId() {
		return _actividadId;
	}

	public void setActividadId(long actividadId) {
		_actividadId = actividadId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public String getText() {
		return _text;
	}

	public void setText(String text) {
		_text = text;
	}

	private String _uuid;
	private long _actividadId;
	private long _groupId;
	private long _userId;
	private Date _createDate;
	private String _text;
}