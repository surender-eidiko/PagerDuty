package org.mule.modules.pagerduty.automation.functional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.StatusResponse;

public class DeleteMaintenanceWindowTestCases extends PagerDutyAbstractTestCases{

	public DeleteMaintenanceWindowTestCases()
	{
		super();
	}
    @Test
    @Category({FunctionalTestSuite.class})
    public void testDeleteMaintenanceWindow() throws Exception 
    {
    	String id = getId();
    	StatusResponse statusResponse = getConnector().deleteMaintenanceWindow(id);
    	assertNotNull(statusResponse);
	    assertEquals("200", statusResponse.getStatusCode() );
    }
	
}