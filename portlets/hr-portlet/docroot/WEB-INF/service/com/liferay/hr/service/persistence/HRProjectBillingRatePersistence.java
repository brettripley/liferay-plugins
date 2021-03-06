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

import com.liferay.hr.model.HRProjectBillingRate;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the h r project billing rate service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Wesley Gong
 * @see HRProjectBillingRatePersistenceImpl
 * @see HRProjectBillingRateUtil
 * @generated
 */
public interface HRProjectBillingRatePersistence extends BasePersistence<HRProjectBillingRate> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HRProjectBillingRateUtil} to access the h r project billing rate persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the h r project billing rate in the entity cache if it is enabled.
	*
	* @param hrProjectBillingRate the h r project billing rate
	*/
	public void cacheResult(
		com.liferay.hr.model.HRProjectBillingRate hrProjectBillingRate);

	/**
	* Caches the h r project billing rates in the entity cache if it is enabled.
	*
	* @param hrProjectBillingRates the h r project billing rates
	*/
	public void cacheResult(
		java.util.List<com.liferay.hr.model.HRProjectBillingRate> hrProjectBillingRates);

	/**
	* Creates a new h r project billing rate with the primary key. Does not add the h r project billing rate to the database.
	*
	* @param hrProjectBillingRateId the primary key for the new h r project billing rate
	* @return the new h r project billing rate
	*/
	public com.liferay.hr.model.HRProjectBillingRate create(
		long hrProjectBillingRateId);

	/**
	* Removes the h r project billing rate with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param hrProjectBillingRateId the primary key of the h r project billing rate
	* @return the h r project billing rate that was removed
	* @throws com.liferay.hr.NoSuchProjectBillingRateException if a h r project billing rate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.hr.model.HRProjectBillingRate remove(
		long hrProjectBillingRateId)
		throws com.liferay.hr.NoSuchProjectBillingRateException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.liferay.hr.model.HRProjectBillingRate updateImpl(
		com.liferay.hr.model.HRProjectBillingRate hrProjectBillingRate,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the h r project billing rate with the primary key or throws a {@link com.liferay.hr.NoSuchProjectBillingRateException} if it could not be found.
	*
	* @param hrProjectBillingRateId the primary key of the h r project billing rate
	* @return the h r project billing rate
	* @throws com.liferay.hr.NoSuchProjectBillingRateException if a h r project billing rate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.hr.model.HRProjectBillingRate findByPrimaryKey(
		long hrProjectBillingRateId)
		throws com.liferay.hr.NoSuchProjectBillingRateException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the h r project billing rate with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param hrProjectBillingRateId the primary key of the h r project billing rate
	* @return the h r project billing rate, or <code>null</code> if a h r project billing rate with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.hr.model.HRProjectBillingRate fetchByPrimaryKey(
		long hrProjectBillingRateId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the h r project billing rates.
	*
	* @return the h r project billing rates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.hr.model.HRProjectBillingRate> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the h r project billing rates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of h r project billing rates
	* @param end the upper bound of the range of h r project billing rates (not inclusive)
	* @return the range of h r project billing rates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.hr.model.HRProjectBillingRate> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the h r project billing rates.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of h r project billing rates
	* @param end the upper bound of the range of h r project billing rates (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of h r project billing rates
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.hr.model.HRProjectBillingRate> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the h r project billing rates from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of h r project billing rates.
	*
	* @return the number of h r project billing rates
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	public HRProjectBillingRate remove(
		HRProjectBillingRate hrProjectBillingRate) throws SystemException;
}