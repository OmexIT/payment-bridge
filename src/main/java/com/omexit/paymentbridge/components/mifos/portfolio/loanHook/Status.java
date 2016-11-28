
package com.omexit.paymentbridge.components.mifos.portfolio.loanHook;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "id",
    "code",
    "value",
    "pendingApproval",
    "waitingForDisbursal",
    "active",
    "closedObligationsMet",
    "closedWrittenOff",
    "closedRescheduled",
    "closed",
    "overpaid"
})
public class Status {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("code")
    private String code;
    @JsonProperty("value")
    private String value;
    @JsonProperty("pendingApproval")
    private Boolean pendingApproval;
    @JsonProperty("waitingForDisbursal")
    private Boolean waitingForDisbursal;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("closedObligationsMet")
    private Boolean closedObligationsMet;
    @JsonProperty("closedWrittenOff")
    private Boolean closedWrittenOff;
    @JsonProperty("closedRescheduled")
    private Boolean closedRescheduled;
    @JsonProperty("closed")
    private Boolean closed;
    @JsonProperty("overpaid")
    private Boolean overpaid;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The code
     */
    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    /**
     * 
     * @param code
     *     The code
     */
    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 
     * @return
     *     The value
     */
    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    /**
     * 
     * @param value
     *     The value
     */
    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 
     * @return
     *     The pendingApproval
     */
    @JsonProperty("pendingApproval")
    public Boolean getPendingApproval() {
        return pendingApproval;
    }

    /**
     * 
     * @param pendingApproval
     *     The pendingApproval
     */
    @JsonProperty("pendingApproval")
    public void setPendingApproval(Boolean pendingApproval) {
        this.pendingApproval = pendingApproval;
    }

    /**
     * 
     * @return
     *     The waitingForDisbursal
     */
    @JsonProperty("waitingForDisbursal")
    public Boolean getWaitingForDisbursal() {
        return waitingForDisbursal;
    }

    /**
     * 
     * @param waitingForDisbursal
     *     The waitingForDisbursal
     */
    @JsonProperty("waitingForDisbursal")
    public void setWaitingForDisbursal(Boolean waitingForDisbursal) {
        this.waitingForDisbursal = waitingForDisbursal;
    }

    /**
     * 
     * @return
     *     The active
     */
    @JsonProperty("active")
    public Boolean getActive() {
        return active;
    }

    /**
     * 
     * @param active
     *     The active
     */
    @JsonProperty("active")
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * 
     * @return
     *     The closedObligationsMet
     */
    @JsonProperty("closedObligationsMet")
    public Boolean getClosedObligationsMet() {
        return closedObligationsMet;
    }

    /**
     * 
     * @param closedObligationsMet
     *     The closedObligationsMet
     */
    @JsonProperty("closedObligationsMet")
    public void setClosedObligationsMet(Boolean closedObligationsMet) {
        this.closedObligationsMet = closedObligationsMet;
    }

    /**
     * 
     * @return
     *     The closedWrittenOff
     */
    @JsonProperty("closedWrittenOff")
    public Boolean getClosedWrittenOff() {
        return closedWrittenOff;
    }

    /**
     * 
     * @param closedWrittenOff
     *     The closedWrittenOff
     */
    @JsonProperty("closedWrittenOff")
    public void setClosedWrittenOff(Boolean closedWrittenOff) {
        this.closedWrittenOff = closedWrittenOff;
    }

    /**
     * 
     * @return
     *     The closedRescheduled
     */
    @JsonProperty("closedRescheduled")
    public Boolean getClosedRescheduled() {
        return closedRescheduled;
    }

    /**
     * 
     * @param closedRescheduled
     *     The closedRescheduled
     */
    @JsonProperty("closedRescheduled")
    public void setClosedRescheduled(Boolean closedRescheduled) {
        this.closedRescheduled = closedRescheduled;
    }

    /**
     * 
     * @return
     *     The closed
     */
    @JsonProperty("closed")
    public Boolean getClosed() {
        return closed;
    }

    /**
     * 
     * @param closed
     *     The closed
     */
    @JsonProperty("closed")
    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    /**
     * 
     * @return
     *     The overpaid
     */
    @JsonProperty("overpaid")
    public Boolean getOverpaid() {
        return overpaid;
    }

    /**
     * 
     * @param overpaid
     *     The overpaid
     */
    @JsonProperty("overpaid")
    public void setOverpaid(Boolean overpaid) {
        this.overpaid = overpaid;
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
