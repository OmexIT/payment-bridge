
package com.omexit.paymentbridge.components.mifos.portfolio.client;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "active",
    "mandatory"
})
public class Constitution {

    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("mandatory")
    private Boolean mandatory;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     *     The mandatory
     */
    @JsonProperty("mandatory")
    public Boolean getMandatory() {
        return mandatory;
    }

    /**
     * 
     * @param mandatory
     *     The mandatory
     */
    @JsonProperty("mandatory")
    public void setMandatory(Boolean mandatory) {
        this.mandatory = mandatory;
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
        return new HashCodeBuilder().append(active).append(mandatory).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Constitution) == false) {
            return false;
        }
        Constitution rhs = ((Constitution) other);
        return new EqualsBuilder().append(active, rhs.active).append(mandatory, rhs.mandatory).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
