package org.mule.modules.pagerduty.bean;

public class EscalationPoliciesPostResponse extends StatusResponse {
	private Escalation_policy escalation_policy;

    public Escalation_policy getEscalation_policy ()
    {
        return escalation_policy;
    }

    public void setEscalation_policy (Escalation_policy escalation_policy)
    {
        this.escalation_policy = escalation_policy;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [escalation_policy = "+escalation_policy+"]";
    }

}
