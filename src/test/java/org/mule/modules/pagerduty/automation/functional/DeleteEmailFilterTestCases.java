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
import org.mule.modules.pagerduty.bean.StatusResponse;

public class DeleteEmailFilterTestCases extends PagerDutyAbstractTestCases{
	
	public DeleteEmailFilterTestCases()
	{
		super(PagerDutyConnector.class);
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
