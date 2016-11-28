
package com.omexit.paymentbridge.components.mifos.portfolio.disburseLoan;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "status",
    "locale",
    "dateFormat",
    "actualDisbursementDate"
})
public class Changes {

    @JsonProperty("status")
    private Status status;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("dateFormat")
    private String dateFormat;
    @JsonProperty("actualDisbursementDate")
    private String actualDisbursementDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The status
     */
    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The locale
     */
    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    /**
     * 
     * @param locale
     *     The locale
     */
    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    /**
     * 
     * @return
     *     The dateFormat
     */
    @JsonProperty("dateFormat")
    public String getDateFormat() {
        return dateFormat;
    }

    /**
     * 
     * @param dateFormat
     *     The dateFormat
     */
    @JsonProperty("dateFormat")
    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    /**
     * 
     * @return
     *     The actualDisbursementDate
     */
    @JsonProperty("actualDisbursementDate")
    public String getActualDisbursementDate() {
        return actualDisbursementDate;
    }

    /**
     * 
     * @param actualDisbursementDate
     *     The actualDisbursementDate
     */
    @JsonProperty("actualDisbursementDate")
    public void setActualDisbursementDate(String actualDisbursementDate) {
        this.actualDisbursementDate = actualDisbursementDate;
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
