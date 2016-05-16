/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ScheduleOverridesGetResponse extends StatusResponse {
	 	
		private String total;

	    private Overrides[] overrides;

	    public String getTotal ()
	    {
	        return total;
	    }

	    public void setTotal (String total)
	    {
	        this.total = total;
	    }

	    public Overrides[] getOverrides ()
	    {
	        return overrides;
	    }

	    public void setOverrides (Overrides[] overrides)
	    {
	        this.overrides = overrides;
	    }

	    @Override
	    public String toString()
	    {
	        return "ClassPojo [total = "+total+", overrides = "+overrides+"]";
	    }

}
