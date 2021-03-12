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
 * Provides a wrapper for {@link ActividadesEspecialesService}.
 *
 * @author Brian Wing Shun Chan
 * @see ActividadesEspecialesService
 * @generated
 */
@ProviderType
public class ActividadesEspecialesServiceWrapper
	implements ActividadesEspecialesService,
		ServiceWrapper<ActividadesEspecialesService> {
	public ActividadesEspecialesServiceWrapper(
		ActividadesEspecialesService actividadesEspecialesService) {
		_actividadesEspecialesService = actividadesEspecialesService;
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _actividadesEspecialesService.getOSGiServiceIdentifier();
	}

	@Override
	public ActividadesEspecialesService getWrappedService() {
		return _actividadesEspecialesService;
	}

	@Override
	public void setWrappedService(
		ActividadesEspecialesService actividadesEspecialesService) {
		_actividadesEspecialesService = actividadesEspecialesService;
	}

	private ActividadesEspecialesService _actividadesEspecialesService;
}