package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.modules.pagerduty.automation.testrunners.FunctionalTestSuite;
import org.mule.modules.pagerduty.bean.StatusResponse;

public class DeleteEmailFilterTestCases extends AbstractTestCase{
	
	public DeleteEmailFilterTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testDeleteEmailFilter() throws Exception 
	{
		String serviceId = getServiceId();
		
		String emailFilterId = getEmailFilterId();
		
		StatusResponse statusResponse = getConnector().deleteEmailFilter(serviceId,emailFilterId);
		
		assertNotNull(statusResponse);
	    assertEquals("200", statusResponse.getStatusCode());
		
		
	}

}
