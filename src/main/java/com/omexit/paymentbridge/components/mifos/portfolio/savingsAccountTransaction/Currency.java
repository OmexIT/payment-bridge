
package com.omexit.paymentbridge.components.mifos.portfolio.savingsAccountTransaction;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "code",
    "name",
    "decimalPlaces",
    "inMultiplesOf",
    "displaySymbol",
    "nameCode",
    "displayLabel"
})
public class Currency {

    @JsonProperty("code")
    private String code;
    @JsonProperty("name")
    private String name;
    @JsonProperty("decimalPlaces")
    private Long decimalPlaces;
    @JsonProperty("inMultiplesOf")
    private Long inMultiplesOf;
    @JsonProperty("displaySymbol")
    private String displaySymbol;
    @JsonProperty("nameCode")
    private String nameCode;
    @JsonProperty("displayLabel")
    private String displayLabel;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The decimalPlaces
     */
    @JsonProperty("decimalPlaces")
    public Long getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * 
     * @param decimalPlaces
     *     The decimalPlaces
     */
    @JsonProperty("decimalPlaces")
    public void setDecimalPlaces(Long decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    /**
     * 
     * @return
     *     The inMultiplesOf
     */
    @JsonProperty("inMultiplesOf")
    public Long getInMultiplesOf() {
        return inMultiplesOf;
    }

    /**
     * 
     * @param inMultiplesOf
     *     The inMultiplesOf
     */
    @JsonProperty("inMultiplesOf")
    public void setInMultiplesOf(Long inMultiplesOf) {
        this.inMultiplesOf = inMultiplesOf;
    }

    /**
     * 
     * @return
     *     The displaySymbol
     */
    @JsonProperty("displaySymbol")
    public String getDisplaySymbol() {
        return displaySymbol;
    }

    /**
     * 
     * @param displaySymbol
     *     The displaySymbol
     */
    @JsonProperty("displaySymbol")
    public void setDisplaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    /**
     * 
     * @return
     *     The nameCode
     */
    @JsonProperty("nameCode")
    public String getNameCode() {
        return nameCode;
    }

    /**
     * 
     * @param nameCode
     *     The nameCode
     */
    @JsonProperty("nameCode")
    public void setNameCode(String nameCode) {
        this.nameCode = nameCode;
    }

    /**
     * 
     * @return
     *     The displayLabel
     */
    @JsonProperty("displayLabel")
    public String getDisplayLabel() {
        return displayLabel;
    }

    /**
     * 
     * @param displayLabel
     *     The displayLabel
     */
    @JsonProperty("displayLabel")
    public void setDisplayLabel(String displayLabel) {
        this.displayLabel = displayLabel;
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
