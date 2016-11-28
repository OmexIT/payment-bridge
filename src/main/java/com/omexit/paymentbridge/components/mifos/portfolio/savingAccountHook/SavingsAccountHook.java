
package com.omexit.paymentbridge.components.mifos.portfolio.savingAccountHook;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
        "tenantId",
        "action",
        "entity",
        "officeId",
        "clientId",
        "savingsId",
        "resourceId",
        "changes"
})
public class SavingsAccountHook {
    @JsonProperty("tenantId")
    private String tenantId;
    @JsonProperty("action")
    private String action;
    @JsonProperty("entity")
    private String entity;
    @JsonProperty("officeId")
    private Long officeId;
    @JsonProperty("clientId")
    private Long clientId;
    @JsonProperty("savingsId")
    private Long savingsId;
    @JsonProperty("resourceId")
    private Long resourceId;
    @JsonProperty("changes")
    private Changes changes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     *     The tenantId
     */
    @JsonProperty("tenantId")
    public String getTenantId() {
        return tenantId;
    }

    /**
     *
     * @param tenantId
     *     The tenantId
     */
    @JsonProperty("tenantId")
    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    /**
     *
     * @return
     *     The action
     */
    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    /**
     *
     * @param action
     *     The action
     */
    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    /**
     *
     * @return
     *     The entity
     */
    @JsonProperty("entity")
    public String getEntity() {
        return entity;
    }

    /**
     *
     * @param entity
     *     The entity
     */
    @JsonProperty("entity")
    public void setEntity(String entity) {
        this.entity = entity;
    }

    /**
     * @return The officeId
     */
    @JsonProperty("officeId")
    public Long getOfficeId() {
        return officeId;
    }

    /**
     * @param officeId The officeId
     */
    @JsonProperty("officeId")
    public void setOfficeId(Long officeId) {
        this.officeId = officeId;
    }

    /**
     * @return The clientId
     */
    @JsonProperty("clientId")
    public Long getClientId() {
        return clientId;
    }

    /**
     * @param clientId The clientId
     */
    @JsonProperty("clientId")
    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    /**
     * @return The savingsId
     */
    @JsonProperty("savingsId")
    public Long getSavingsId() {
        return savingsId;
    }

    /**
     * @param savingsId The savingsId
     */
    @JsonProperty("savingsId")
    public void setSavingsId(Long savingsId) {
        this.savingsId = savingsId;
    }

    /**
     * @return The resourceId
     */
    @JsonProperty("resourceId")
    public Long getResourceId() {
        return resourceId;
    }

    /**
     * @param resourceId The resourceId
     */
    @JsonProperty("resourceId")
    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * @return The changes
     */
    @JsonProperty("changes")
    public Changes getChanges() {
        return changes;
    }

    /**
     * @param changes The changes
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
