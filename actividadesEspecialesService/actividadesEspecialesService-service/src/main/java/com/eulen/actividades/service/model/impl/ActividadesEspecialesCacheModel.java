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

package com.eulen.actividades.service.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.eulen.actividades.service.model.ActividadesEspeciales;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing ActividadesEspeciales in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see ActividadesEspeciales
 * @generated
 */
@ProviderType
public class ActividadesEspecialesCacheModel implements CacheModel<ActividadesEspeciales>,
	Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ActividadesEspecialesCacheModel)) {
			return false;
		}

		ActividadesEspecialesCacheModel actividadesEspecialesCacheModel = (ActividadesEspecialesCacheModel)obj;

		if (actividadId == actividadesEspecialesCacheModel.actividadId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, actividadId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", actividadId=");
		sb.append(actividadId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", text=");
		sb.append(text);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public ActividadesEspeciales toEntityModel() {
		ActividadesEspecialesImpl actividadesEspecialesImpl = new ActividadesEspecialesImpl();

		if (uuid == null) {
			actividadesEspecialesImpl.setUuid("");
		}
		else {
			actividadesEspecialesImpl.setUuid(uuid);
		}

		actividadesEspecialesImpl.setActividadId(actividadId);
		actividadesEspecialesImpl.setGroupId(groupId);
		actividadesEspecialesImpl.setUserId(userId);

		if (createDate == Long.MIN_VALUE) {
			actividadesEspecialesImpl.setCreateDate(null);
		}
		else {
			actividadesEspecialesImpl.setCreateDate(new Date(createDate));
		}

		if (text == null) {
			actividadesEspecialesImpl.setText("");
		}
		else {
			actividadesEspecialesImpl.setText(text);
		}

		actividadesEspecialesImpl.resetOriginalValues();

		return actividadesEspecialesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		actividadId = objectInput.readLong();

		groupId = objectInput.readLong();

		userId = objectInput.readLong();
		createDate = objectInput.readLong();
		text = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(actividadId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(userId);
		objectOutput.writeLong(createDate);

		if (text == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(text);
		}
	}

	public String uuid;
	public long actividadId;
	public long groupId;
	public long userId;
	public long createDate;
	public String text;
}