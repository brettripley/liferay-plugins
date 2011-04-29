/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.hr.service.persistence;

import com.liferay.hr.model.HRAssetVendorId;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the h r asset vendor ID service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HRAssetVendorIdPersistenceImpl
 * @see HRAssetVendorIdUtil
 * @generated
 */
public interface HRAssetVendorIdPersistence extends BasePersistence<HRAssetVendorId> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HRAssetVendorIdUtil} to access the h r asset vendor ID persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the h r asset vendor ID in the entity cache if it is enabled.
	*
	* @param hrAssetVendorId the h r asset vendor ID to cache
	*/
	public void cacheResult(
		com.liferay.hr.model.HRAssetVendorId hrAssetVendorId);

	/**
	* Caches the h r asset vendor IDs in the entity cache if it is enabled.
	*
	* @param hrAssetVendorIds the h r asset vendor IDs to cache
	*/
	public void cacheResult(
		java.util.List<com.liferay.hr.model.HRAssetVendorId> hrAssetVendorIds);

	/**
	* Creates a new h r asset vendor ID with the primary key. Does not add the h r asset vendor ID to the database.
	*
	* @param hrAssetVendorId the primary key for the new h r asset vendor ID
	* @return the new h r asset vendor ID
	*/
	public com.liferay.hr.model.HRAssetVendorId create(long hrAssetVendorId);

	/**
	* Removes the h r asset vendor ID with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param hrAssetVendorId the primary key of the h r asset vendor ID to remove
	* @return the h r asset vendor ID that was removed
	* @throws com.liferay.hr.NoSuchAssetVendorIdException if a h r asset vendor ID with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.hr.model.HRAssetVendorId remove(long hrAssetVendorId)
		throws com.liferay.hr.NoSuchAssetVendorIdException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.hr.model.HRAssetVendorId updateImpl(
		com.liferay.hr.model.HRAssetVendorId hrAssetVendorId, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the h r asset vendor ID with the primary key or throws a {@link com.liferay.hr.NoSuchAssetVendorIdException} if it could not be found.
	*
	* @param hrAssetVendorId the primary key of the h r asset vendor ID to find
	* @return the h r asset vendor ID
	* @throws com.liferay.hr.NoSuchAssetVendorIdException if a h r asset vendor ID with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.hr.model.HRAssetVendorId findByPrimaryKey(
		long hrAssetVendorId)
		throws com.liferay.hr.NoSuchAssetVendorIdException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds the h r asset vendor ID with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param hrAssetVendorId the primary key of the h r asset vendor ID to find
	* @return the h r asset vendor ID, or <code>null</code> if a h r asset vendor ID with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.hr.model.HRAssetVendorId fetchByPrimaryKey(
		long hrAssetVendorId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds all the h r asset vendor IDs.
	*
	* @return the h r asset vendor IDs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.hr.model.HRAssetVendorId> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds a range of all the h r asset vendor IDs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of h r asset vendor IDs to return
	* @param end the upper bound of the range of h r asset vendor IDs to return (not inclusive)
	* @return the range of h r asset vendor IDs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.hr.model.HRAssetVendorId> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Finds an ordered range of all the h r asset vendor IDs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of h r asset vendor IDs to return
	* @param end the upper bound of the range of h r asset vendor IDs to return (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of h r asset vendor IDs
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.hr.model.HRAssetVendorId> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the h r asset vendor IDs from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Counts all the h r asset vendor IDs.
	*
	* @return the number of h r asset vendor IDs
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	public HRAssetVendorId remove(HRAssetVendorId hrAssetVendorId)
		throws SystemException;
}