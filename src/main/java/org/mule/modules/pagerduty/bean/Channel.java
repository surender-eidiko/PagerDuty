/**
 * Copyright � 1992-2016 Cisco, Inc.
 */
package org.mule.modules.pagerduty.bean;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

// TODO: Auto-generated Javadoc
/**
 * The Class Channel.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Channel {
	
	/** The summary. */
	private String summary;
	
	/**
	 * Gets the summary.
	 *
	 * @return the summary
	 */
	public String getSummary() {
		return summary;
	}


	/**
	 * Sets the summary.
	 *
	 * @param summary the new summary
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}


	/** The type. */
	private String type;

    /**
     * Gets the type.
     *
     * @return the type
     */
    public String getType ()
    {
        return type;
    }

    
    /**
     * Sets the type.
     *
     * @param type the new type
     */
    public void setType (String type)
    {
        this.type = type;
    }

    
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString()
    {
        return "ClassPojo [type = "+type+"]";
    }

}
