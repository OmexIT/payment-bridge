
package com.omexit.paymentbridge.components.mifos.portfolio.loan;

import com.fasterxml.jackson.annotation.*;

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
    "approvedOnDate",
    "approvedByUsername",
    "approvedByFirstname",
    "approvedByLastname",
    "expectedDisbursementDate",
    "actualDisbursementDate",
    "disbursedByUsername",
    "disbursedByFirstname",
    "disbursedByLastname",
    "expectedMaturityDate"
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
    @JsonProperty("approvedOnDate")
    private List<Long> approvedOnDate = new ArrayList<Long>();
    @JsonProperty("approvedByUsername")
    private String approvedByUsername;
    @JsonProperty("approvedByFirstname")
    private String approvedByFirstname;
    @JsonProperty("approvedByLastname")
    private String approvedByLastname;
    @JsonProperty("expectedDisbursementDate")
    private List<Long> expectedDisbursementDate = new ArrayList<Long>();
    @JsonProperty("actualDisbursementDate")
    private List<Long> actualDisbursementDate = new ArrayList<Long>();
    @JsonProperty("disbursedByUsername")
    private String disbursedByUsername;
    @JsonProperty("disbursedByFirstname")
    private String disbursedByFirstname;
    @JsonProperty("disbursedByLastname")
    private String disbursedByLastname;
    @JsonProperty("expectedMaturityDate")
    private List<Long> expectedMaturityDate = new ArrayList<Long>();
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
     *     The approvedOnDate
     */
    @JsonProperty("approvedOnDate")
    public List<Long> getApprovedOnDate() {
        return approvedOnDate;
    }

    /**
     * 
     * @param approvedOnDate
     *     The approvedOnDate
     */
    @JsonProperty("approvedOnDate")
    public void setApprovedOnDate(List<Long> approvedOnDate) {
        this.approvedOnDate = approvedOnDate;
    }

    /**
     * 
     * @return
     *     The approvedByUsername
     */
    @JsonProperty("approvedByUsername")
    public String getApprovedByUsername() {
        return approvedByUsername;
    }

    /**
     * 
     * @param approvedByUsername
     *     The approvedByUsername
     */
    @JsonProperty("approvedByUsername")
    public void setApprovedByUsername(String approvedByUsername) {
        this.approvedByUsername = approvedByUsername;
    }

    /**
     * 
     * @return
     *     The approvedByFirstname
     */
    @JsonProperty("approvedByFirstname")
    public String getApprovedByFirstname() {
        return approvedByFirstname;
    }

    /**
     * 
     * @param approvedByFirstname
     *     The approvedByFirstname
     */
    @JsonProperty("approvedByFirstname")
    public void setApprovedByFirstname(String approvedByFirstname) {
        this.approvedByFirstname = approvedByFirstname;
    }

    /**
     * 
     * @return
     *     The approvedByLastname
     */
    @JsonProperty("approvedByLastname")
    public String getApprovedByLastname() {
        return approvedByLastname;
    }

    /**
     * 
     * @param approvedByLastname
     *     The approvedByLastname
     */
    @JsonProperty("approvedByLastname")
    public void setApprovedByLastname(String approvedByLastname) {
        this.approvedByLastname = approvedByLastname;
    }

    /**
     * 
     * @return
     *     The expectedDisbursementDate
     */
    @JsonProperty("expectedDisbursementDate")
    public List<Long> getExpectedDisbursementDate() {
        return expectedDisbursementDate;
    }

    /**
     * 
     * @param expectedDisbursementDate
     *     The expectedDisbursementDate
     */
    @JsonProperty("expectedDisbursementDate")
    public void setExpectedDisbursementDate(List<Long> expectedDisbursementDate) {
        this.expectedDisbursementDate = expectedDisbursementDate;
    }

    /**
     * 
     * @return
     *     The actualDisbursementDate
     */
    @JsonProperty("actualDisbursementDate")
    public List<Long> getActualDisbursementDate() {
        return actualDisbursementDate;
    }

    /**
     * 
     * @param actualDisbursementDate
     *     The actualDisbursementDate
     */
    @JsonProperty("actualDisbursementDate")
    public void setActualDisbursementDate(List<Long> actualDisbursementDate) {
        this.actualDisbursementDate = actualDisbursementDate;
    }

    /**
     * 
     * @return
     *     The disbursedByUsername
     */
    @JsonProperty("disbursedByUsername")
    public String getDisbursedByUsername() {
        return disbursedByUsername;
    }

    /**
     * 
     * @param disbursedByUsername
     *     The disbursedByUsername
     */
    @JsonProperty("disbursedByUsername")
    public void setDisbursedByUsername(String disbursedByUsername) {
        this.disbursedByUsername = disbursedByUsername;
    }

    /**
     * 
     * @return
     *     The disbursedByFirstname
     */
    @JsonProperty("disbursedByFirstname")
    public String getDisbursedByFirstname() {
        return disbursedByFirstname;
    }

    /**
     * 
     * @param disbursedByFirstname
     *     The disbursedByFirstname
     */
    @JsonProperty("disbursedByFirstname")
    public void setDisbursedByFirstname(String disbursedByFirstname) {
        this.disbursedByFirstname = disbursedByFirstname;
    }

    /**
     * 
     * @return
     *     The disbursedByLastname
     */
    @JsonProperty("disbursedByLastname")
    public String getDisbursedByLastname() {
        return disbursedByLastname;
    }

    /**
     * 
     * @param disbursedByLastname
     *     The disbursedByLastname
     */
    @JsonProperty("disbursedByLastname")
    public void setDisbursedByLastname(String disbursedByLastname) {
        this.disbursedByLastname = disbursedByLastname;
    }

    /**
     * 
     * @return
     *     The expectedMaturityDate
     */
    @JsonProperty("expectedMaturityDate")
    public List<Long> getExpectedMaturityDate() {
        return expectedMaturityDate;
    }

    /**
     * 
     * @param expectedMaturityDate
     *     The expectedMaturityDate
     */
    @JsonProperty("expectedMaturityDate")
    public void setExpectedMaturityDate(List<Long> expectedMaturityDate) {
        this.expectedMaturityDate = expectedMaturityDate;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
