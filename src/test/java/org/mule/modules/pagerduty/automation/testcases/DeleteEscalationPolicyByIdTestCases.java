package org.mule.modules.pagerduty.automation.testcases;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.mule.modules.pagerduty.automation.AbstractTestCase;
import org.mule.tools.devkit.ctf.junit.RegressionTests;

public class DeleteEscalationPolicyByIdTestCases extends AbstractTestCase{
	
	public DeleteEscalationPolicyByIdTestCases()
	{
		super();
	}
	@Test
    @Category({FunctionalTestSuite.class})
    public void testDeleteEscalationPolicyById() throws Exception {
		
		String id = getEscalationId();
		StatusResponse statusResponse = getConnector().deleteEscalationPolicyById(id);
		assertNotNull(statusResponse);
	     assertEquals("200", statusResponse.getStatusCode() );
	}

}