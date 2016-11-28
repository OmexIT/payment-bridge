
package com.omexit.paymentbridge.components.mifos.portfolio.client;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "submittedOnDate",
    "submittedByUsername",
    "submittedByFirstname",
    "submittedByLastname",
    "activatedOnDate",
    "activatedByUsername",
    "activatedByFirstname",
    "activatedByLastname"
})
public class Timeline {

    @JsonProperty("submittedOnDate")
    private List<Long> submittedOnDate = new ArrayList<Long>();
    @JsonProperty("submittedByUsername")
    private String submittedByUsername;
    @JsonProperty("submittedByFirstname")
    private String submittedByFirstname;
    @JsonProperty("submittedByLastname")
    private String submittedByLastname;
    @JsonProperty("activatedOnDate")
    private List<Long> activatedOnDate = new ArrayList<Long>();
    @JsonProperty("activatedByUsername")
    private String activatedByUsername;
    @JsonProperty("activatedByFirstname")
    private String activatedByFirstname;
    @JsonProperty("activatedByLastname")
    private String activatedByLastname;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The submittedOnDate
     */
    @JsonProperty("submittedOnDate")
    public List<Long> getSubmittedOnDate() {
        return submittedOnDate;
    }

    /**
     * 
     * @param submittedOnDate
     *     The submittedOnDate
     */
    @JsonProperty("submittedOnDate")
    public void setSubmittedOnDate(List<Long> submittedOnDate) {
        this.submittedOnDate = submittedOnDate;
    }

    /**
     * 
     * @return
     *     The submittedByUsername
     */
    @JsonProperty("submittedByUsername")
    public String getSubmittedByUsername() {
        return submittedByUsername;
    }

    /**
     * 
     * @param submittedByUsername
     *     The submittedByUsername
     */
    @JsonProperty("submittedByUsername")
    public void setSubmittedByUsername(String submittedByUsername) {
        this.submittedByUsername = submittedByUsername;
    }

    /**
     * 
     * @return
     *     The submittedByFirstname
     */
    @JsonProperty("submittedByFirstname")
    public String getSubmittedByFirstname() {
        return submittedByFirstname;
    }

    /**
     * 
     * @param submittedByFirstname
     *     The submittedByFirstname
     */
    @JsonProperty("submittedByFirstname")
    public void setSubmittedByFirstname(String submittedByFirstname) {
        this.submittedByFirstname = submittedByFirstname;
    }

    /**
     * 
     * @return
     *     The submittedByLastname
     */
    @JsonProperty("submittedByLastname")
    public String getSubmittedByLastname() {
        return submittedByLastname;
    }

    /**
     * 
     * @param submittedByLastname
     *     The submittedByLastname
     */
    @JsonProperty("submittedByLastname")
    public void setSubmittedByLastname(String submittedByLastname) {
        this.submittedByLastname = submittedByLastname;
    }

    /**
     * 
     * @return
     *     The activatedOnDate
     */
    @JsonProperty("activatedOnDate")
    public List<Long> getActivatedOnDate() {
        return activatedOnDate;
    }

    /**
     * 
     * @param activatedOnDate
     *     The activatedOnDate
     */
    @JsonProperty("activatedOnDate")
    public void setActivatedOnDate(List<Long> activatedOnDate) {
        this.activatedOnDate = activatedOnDate;
    }

    /**
     * 
     * @return
     *     The activatedByUsername
     */
    @JsonProperty("activatedByUsername")
    public String getActivatedByUsername() {
        return activatedByUsername;
    }

    /**
     * 
     * @param activatedByUsername
     *     The activatedByUsername
     */
    @JsonProperty("activatedByUsername")
    public void setActivatedByUsername(String activatedByUsername) {
        this.activatedByUsername = activatedByUsername;
    }

    /**
     * 
     * @return
     *     The activatedByFirstname
     */
    @JsonProperty("activatedByFirstname")
    public String getActivatedByFirstname() {
        return activatedByFirstname;
    }

    /**
     * 
     * @param activatedByFirstname
     *     The activatedByFirstname
     */
    @JsonProperty("activatedByFirstname")
    public void setActivatedByFirstname(String activatedByFirstname) {
        this.activatedByFirstname = activatedByFirstname;
    }

    /**
     * 
     * @return
     *     The activatedByLastname
     */
    @JsonProperty("activatedByLastname")
    public String getActivatedByLastname() {
        return activatedByLastname;
    }

    /**
     * 
     * @param activatedByLastname
     *     The activatedByLastname
     */
    @JsonProperty("activatedByLastname")
    public void setActivatedByLastname(String activatedByLastname) {
        this.activatedByLastname = activatedByLastname;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(submittedOnDate).append(submittedByUsername).append(submittedByFirstname).append(submittedByLastname).append(activatedOnDate).append(activatedByUsername).append(activatedByFirstname).append(activatedByLastname).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Timeline) == false) {
            return false;
        }
        Timeline rhs = ((Timeline) other);
        return new EqualsBuilder().append(submittedOnDate, rhs.submittedOnDate).append(submittedByUsername, rhs.submittedByUsername).append(submittedByFirstname, rhs.submittedByFirstname).append(submittedByLastname, rhs.submittedByLastname).append(activatedOnDate, rhs.activatedOnDate).append(activatedByUsername, rhs.activatedByUsername).append(activatedByFirstname, rhs.activatedByFirstname).append(activatedByLastname, rhs.activatedByLastname).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
