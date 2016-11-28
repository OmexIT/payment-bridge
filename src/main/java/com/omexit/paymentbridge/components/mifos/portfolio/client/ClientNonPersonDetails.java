
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
    "constitution",
    "mainBusinessLine"
})
public class ClientNonPersonDetails {

    @JsonProperty("constitution")
    private Constitution constitution;
    @JsonProperty("mainBusinessLine")
    private MainBusinessLine mainBusinessLine;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The constitution
     */
    @JsonProperty("constitution")
    public Constitution getConstitution() {
        return constitution;
    }

    /**
     * 
     * @param constitution
     *     The constitution
     */
    @JsonProperty("constitution")
    public void setConstitution(Constitution constitution) {
        this.constitution = constitution;
    }

    /**
     * 
     * @return
     *     The mainBusinessLine
     */
    @JsonProperty("mainBusinessLine")
    public MainBusinessLine getMainBusinessLine() {
        return mainBusinessLine;
    }

    /**
     * 
     * @param mainBusinessLine
     *     The mainBusinessLine
     */
    @JsonProperty("mainBusinessLine")
    public void setMainBusinessLine(MainBusinessLine mainBusinessLine) {
        this.mainBusinessLine = mainBusinessLine;
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
        return new HashCodeBuilder().append(constitution).append(mainBusinessLine).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClientNonPersonDetails) == false) {
            return false;
        }
        ClientNonPersonDetails rhs = ((ClientNonPersonDetails) other);
        return new EqualsBuilder().append(constitution, rhs.constitution).append(mainBusinessLine, rhs.mainBusinessLine).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
