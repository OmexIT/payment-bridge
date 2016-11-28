
package com.omexit.paymentbridge.components.mifos.portfolio.disburseLoan;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "officeId",
    "clientId",
    "loanId",
    "resourceId",
    "changes"
})
public class DisburseLoan {

    @JsonProperty("officeId")
    private Long officeId;
    @JsonProperty("clientId")
    private Long clientId;
    @JsonProperty("loanId")
    private Long loanId;
    @JsonProperty("resourceId")
    private Long resourceId;
    @JsonProperty("changes")
    private Changes changes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The officeId
     */
    @JsonProperty("officeId")
    public Long getOfficeId() {
        return officeId;
    }

    /**
     * 
     * @param officeId
     *     The officeId
     */
    @JsonProperty("officeId")
    public void setOfficeId(Long officeId) {
        this.officeId = officeId;
    }

    /**
     * 
     * @return
     *     The clientId
     */
    @JsonProperty("clientId")
    public Long getClientId() {
        return clientId;
    }

    /**
     * 
     * @param clientId
     *     The clientId
     */
    @JsonProperty("clientId")
    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    /**
     * 
     * @return
     *     The loanId
     */
    @JsonProperty("loanId")
    public Long getLoanId() {
        return loanId;
    }

    /**
     * 
     * @param loanId
     *     The loanId
     */
    @JsonProperty("loanId")
    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    /**
     * 
     * @return
     *     The resourceId
     */
    @JsonProperty("resourceId")
    public Long getResourceId() {
        return resourceId;
    }

    /**
     * 
     * @param resourceId
     *     The resourceId
     */
    @JsonProperty("resourceId")
    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * 
     * @return
     *     The changes
     */
    @JsonProperty("changes")
    public Changes getChanges() {
        return changes;
    }

    /**
     * 
     * @param changes
     *     The changes
     */
    @JsonProperty("changes")
    public void setChanges(Changes changes) {
        this.changes = changes;
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
