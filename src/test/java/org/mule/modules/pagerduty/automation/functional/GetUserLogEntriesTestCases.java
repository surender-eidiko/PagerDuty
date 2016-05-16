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
import org.mule.modules.pagerduty.bean.UserLogEntriesGetResponse;

public class GetUserLogEntriesTestCases extends PagerDutyAbstractTestCases{
	
	public GetUserLogEntriesTestCases()
	{
		super(PagerDutyConnector.class);
	}
    @Test
    @Category({FunctionalTestSuite.class})
    public void testGetUserLogEntries() throws Exception 
    {
    	String id = getId();
    	String timeZone = getTimeZone();
    	String since = getSince();
    	String until = getUntil();
    	String isOverview = getOverview();
    	String include = getInclude();
    	UserLogEntriesGetResponse  userLogEntriesGetResponse = getConnector().getUserLogEntries(id, timeZone, since, until, isOverview, include);
		assertNotNull(userLogEntriesGetResponse);
	    assertEquals("200", userLogEntriesGetResponse.getStatusCode() );
    }

}
