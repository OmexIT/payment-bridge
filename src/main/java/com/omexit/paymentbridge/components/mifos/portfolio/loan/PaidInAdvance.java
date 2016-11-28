
package com.omexit.paymentbridge.components.mifos.portfolio.loan;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "paidInAdvance"
})
public class PaidInAdvance {

    @JsonProperty("paidInAdvance")
    private Long paidInAdvance;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The paidInAdvance
     */
    @JsonProperty("paidInAdvance")
    public Long getPaidInAdvance() {
        return paidInAdvance;
    }

    /**
     * 
     * @param paidInAdvance
     *     The paidInAdvance
     */
    @JsonProperty("paidInAdvance")
    public void setPaidInAdvance(Long paidInAdvance) {
        this.paidInAdvance = paidInAdvance;
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
