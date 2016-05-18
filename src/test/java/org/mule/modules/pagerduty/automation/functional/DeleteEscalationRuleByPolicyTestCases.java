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

// TODO: Auto-generated Javadoc
/**
 * The Class DeleteEscalationRuleByPolicyTestCases.
 */
public class DeleteEscalationRuleByPolicyTestCases extends PagerDutyAbstractTestCases{

		/**
		 * Instantiates a new delete escalation rule by policy test cases.
		 */
		public DeleteEscalationRuleByPolicyTestCases()
		{
			super(PagerDutyConnector.class);
		}
	    
    	/**
    	 * Test delete escalation rule by policy.
    	 *
    	 * @throws Exception the exception
    	 */
    	@Test
	    @Category({FunctionalTestSuite.class})
	    public void testDeleteEscalationRuleByPolicy() throws Exception 
	    {
	    	String escalation_policy_id = getEscalationPolicyId();
	    	String id = getEscalationId();
	    	
	    	StatusResponse  statusResponse = getConnector().deleteEscalationRuleByPolicy(escalation_policy_id, id);
	    	assertNotNull(statusResponse);
		     assertEquals("200", statusResponse.getStatusCode() );
	    }
}
