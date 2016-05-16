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
import org.mule.modules.pagerduty.bean.ListEntriesOfScheduleGetResponse;

public class GetListEntriesOfScheduleTestCases extends PagerDutyAbstractTestCases {
	
	public GetListEntriesOfScheduleTestCases()
	{
		super(PagerDutyConnector.class);
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testGetListEntriesOfSchedule() throws Exception 
	{
		String id = getId();
		String since = getSince();
		String until = getUntil();
		String overflow = getOverview();
		String timeZone = getTimeZone();
		String userId = getUserId();
		
		ListEntriesOfScheduleGetResponse listEntriesOfScheduleGetResponse = getConnector().getListEntriesOfSchedule(id,since,until,overflow,timeZone,userId);
		assertNotNull(listEntriesOfScheduleGetResponse);
	    assertEquals("200", listEntriesOfScheduleGetResponse.getStatusCode());
		
	}

}
