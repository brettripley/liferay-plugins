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

package com.liferay.socialcoding.model;

import com.liferay.portal.model.SaveableModel;

/**
 * The extended model interface for the SVNRevision service. Represents a row in the &quot;SC_SVNRevision&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see SVNRevisionModel
 * @see com.liferay.socialcoding.model.impl.SVNRevisionImpl
 * @see com.liferay.socialcoding.model.impl.SVNRevisionModelImpl
 * @generated
 */
public interface SVNRevision extends SVNRevisionModel, SaveableModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.liferay.socialcoding.model.impl.SVNRevisionImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public com.liferay.socialcoding.model.SVNRepository getSVNRepository();

	public java.lang.String getWebRevisionNumberURL();

	public java.lang.Object[] getJIRAIssueAndComments();
}