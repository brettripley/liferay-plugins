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

package com.liferay.portal.workflow.jbpm.comparator;

import com.liferay.portal.kernel.workflow.comparator.BaseWorkflowLogCreateDateComparator;

/**
 * @author Shuyang Zhou
 */
public class WorkflowLogCreateDateComparator
	extends BaseWorkflowLogCreateDateComparator {

	public static String ORDER_BY_ASC = "createDate ASC, workflowLogId ASC";

	public static String ORDER_BY_DESC = "createDate DESC, workflowLogId DESC";

	public static String[] ORDER_BY_FIELDS = {"createDate", "workflowLogId"};

	public WorkflowLogCreateDateComparator() {
		super();
	}

	public WorkflowLogCreateDateComparator(boolean ascending) {
		super(ascending);
	}

	@Override
	public String getOrderBy() {
		if (isAscending()) {
			return ORDER_BY_ASC;
		}
		else {
			return ORDER_BY_DESC;
		}
	}

	@Override
	public String[] getOrderByFields() {
		return ORDER_BY_FIELDS;
	}

}