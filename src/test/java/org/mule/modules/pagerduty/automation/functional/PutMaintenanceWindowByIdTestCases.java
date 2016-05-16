/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.PagerDutyConnector;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.MaintenanceWindowPutRequest;
import org.mule.modules.pagerduty.bean.MaintenanceWindowPutResponse;

public class PutMaintenanceWindowByIdTestCases extends PagerDutyAbstractTestCases{
	
	public PutMaintenanceWindowByIdTestCases()
	{
		super(PagerDutyConnector.class);
	}
    @Test
    @Category({FunctionalTestSuite.class})
    public void testPutMaintenanceWindowById() throws Exception 
    {
    	String id = getId();
    	MaintenanceWindowPutRequest request = new MaintenanceWindowPutRequest();
    	MaintenanceWindowPutResponse maintenanceWindowPutResponse = getConnector().putMaintenanceWindowById(id, request);
    	assertNotNull(maintenanceWindowPutResponse);
	    assertEquals("200", maintenanceWindowPutResponse.getStatusCode() );
    }

}
