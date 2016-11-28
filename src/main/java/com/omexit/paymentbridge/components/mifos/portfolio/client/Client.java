
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
    "id",
    "accountNo",
    "externalId",
    "status",
    "subStatus",
    "active",
    "activationDate",
    "firstname",
    "lastname",
    "displayName",
    "mobileNo",
    "dateOfBirth",
    "gender",
    "clientType",
    "clientClassification",
    "officeId",
    "officeName",
    "timeline",
    "legalForm",
    "groups",
    "clientNonPersonDetails"
})
public class Client {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("accountNo")
    private String accountNo;
    @JsonProperty("externalId")
    private String externalId;
    @JsonProperty("status")
    private Status status;
    @JsonProperty("subStatus")
    private SubStatus subStatus;
    @JsonProperty("active")
    private Boolean active;
    @JsonProperty("activationDate")
    private List<Long> activationDate = new ArrayList<Long>();
    @JsonProperty("firstname")
    private String firstname;
    @JsonProperty("lastname")
    private String lastname;
    @JsonProperty("displayName")
    private String displayName;
    @JsonProperty("mobileNo")
    private String mobileNo;
    @JsonProperty("dateOfBirth")
    private List<Long> dateOfBirth = new ArrayList<Long>();
    @JsonProperty("gender")
    private Gender gender;
    @JsonProperty("clientType")
    private ClientType clientType;
    @JsonProperty("clientClassification")
    private ClientClassification clientClassification;
    @JsonProperty("officeId")
    private Long officeId;
    @JsonProperty("officeName")
    private String officeName;
    @JsonProperty("timeline")
    private Timeline timeline;
    @JsonProperty("legalForm")
    private LegalForm legalForm;
    @JsonProperty("groups")
    private List<Object> groups = new ArrayList<Object>();
    @JsonProperty("clientNonPersonDetails")
    private ClientNonPersonDetails clientNonPersonDetails;
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
     *     The accountNo
     */
    @JsonProperty("accountNo")
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * 
     * @param accountNo
     *     The accountNo
     */
    @JsonProperty("accountNo")
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    /**
     * 
     * @return
     *     The externalId
     */
    @JsonProperty("externalId")
    public String getExternalId() {
        return externalId;
    }

    /**
     * 
     * @param externalId
     *     The externalId
     */
    @JsonProperty("externalId")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

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
     *     The subStatus
     */
    @JsonProperty("subStatus")
    public SubStatus getSubStatus() {
        return subStatus;
    }

    /**
     * 
     * @param subStatus
     *     The subStatus
     */
    @JsonProperty("subStatus")
    public void setSubStatus(SubStatus subStatus) {
        this.subStatus = subStatus;
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
     *     The activationDate
     */
    @JsonProperty("activationDate")
    public List<Long> getActivationDate() {
        return activationDate;
    }

    /**
     * 
     * @param activationDate
     *     The activationDate
     */
    @JsonProperty("activationDate")
    public void setActivationDate(List<Long> activationDate) {
        this.activationDate = activationDate;
    }

    /**
     * 
     * @return
     *     The firstname
     */
    @JsonProperty("firstname")
    public String getFirstname() {
        return firstname;
    }

    /**
     * 
     * @param firstname
     *     The firstname
     */
    @JsonProperty("firstname")
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * 
     * @return
     *     The lastname
     */
    @JsonProperty("lastname")
    public String getLastname() {
        return lastname;
    }

    /**
     * 
     * @param lastname
     *     The lastname
     */
    @JsonProperty("lastname")
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * 
     * @return
     *     The displayName
     */
    @JsonProperty("displayName")
    public String getDisplayName() {
        return displayName;
    }

    /**
     * 
     * @param displayName
     *     The displayName
     */
    @JsonProperty("displayName")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * 
     * @return
     *     The mobileNo
     */
    @JsonProperty("mobileNo")
    public String getMobileNo() {
        return mobileNo;
    }

    /**
     * 
     * @param mobileNo
     *     The mobileNo
     */
    @JsonProperty("mobileNo")
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    /**
     * 
     * @return
     *     The dateOfBirth
     */
    @JsonProperty("dateOfBirth")
    public List<Long> getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * 
     * @param dateOfBirth
     *     The dateOfBirth
     */
    @JsonProperty("dateOfBirth")
    public void setDateOfBirth(List<Long> dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * 
     * @return
     *     The gender
     */
    @JsonProperty("gender")
    public Gender getGender() {
        return gender;
    }

    /**
     * 
     * @param gender
     *     The gender
     */
    @JsonProperty("gender")
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**
     * 
     * @return
     *     The clientType
     */
    @JsonProperty("clientType")
    public ClientType getClientType() {
        return clientType;
    }

    /**
     * 
     * @param clientType
     *     The clientType
     */
    @JsonProperty("clientType")
    public void setClientType(ClientType clientType) {
        this.clientType = clientType;
    }

    /**
     * 
     * @return
     *     The clientClassification
     */
    @JsonProperty("clientClassification")
    public ClientClassification getClientClassification() {
        return clientClassification;
    }

    /**
     * 
     * @param clientClassification
     *     The clientClassification
     */
    @JsonProperty("clientClassification")
    public void setClientClassification(ClientClassification clientClassification) {
        this.clientClassification = clientClassification;
    }

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
     *     The officeName
     */
    @JsonProperty("officeName")
    public String getOfficeName() {
        return officeName;
    }

    /**
     * 
     * @param officeName
     *     The officeName
     */
    @JsonProperty("officeName")
    public void setOfficeName(String officeName) {
        this.officeName = officeName;
    }

    /**
     * 
     * @return
     *     The timeline
     */
    @JsonProperty("timeline")
    public Timeline getTimeline() {
        return timeline;
    }

    /**
     * 
     * @param timeline
     *     The timeline
     */
    @JsonProperty("timeline")
    public void setTimeline(Timeline timeline) {
        this.timeline = timeline;
    }

    /**
     * 
     * @return
     *     The legalForm
     */
    @JsonProperty("legalForm")
    public LegalForm getLegalForm() {
        return legalForm;
    }

    /**
     * 
     * @param legalForm
     *     The legalForm
     */
    @JsonProperty("legalForm")
    public void setLegalForm(LegalForm legalForm) {
        this.legalForm = legalForm;
    }

    /**
     * 
     * @return
     *     The groups
     */
    @JsonProperty("groups")
    public List<Object> getGroups() {
        return groups;
    }

    /**
     * 
     * @param groups
     *     The groups
     */
    @JsonProperty("groups")
    public void setGroups(List<Object> groups) {
        this.groups = groups;
    }

    /**
     * 
     * @return
     *     The clientNonPersonDetails
     */
    @JsonProperty("clientNonPersonDetails")
    public ClientNonPersonDetails getClientNonPersonDetails() {
        return clientNonPersonDetails;
    }

    /**
     * 
     * @param clientNonPersonDetails
     *     The clientNonPersonDetails
     */
    @JsonProperty("clientNonPersonDetails")
    public void setClientNonPersonDetails(ClientNonPersonDetails clientNonPersonDetails) {
        this.clientNonPersonDetails = clientNonPersonDetails;
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
        return new HashCodeBuilder().append(id).append(accountNo).append(externalId).append(status).append(subStatus).append(active).append(activationDate).append(firstname).append(lastname).append(displayName).append(mobileNo).append(dateOfBirth).append(gender).append(clientType).append(clientClassification).append(officeId).append(officeName).append(timeline).append(legalForm).append(groups).append(clientNonPersonDetails).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Client) == false) {
            return false;
        }
        Client rhs = ((Client) other);
        return new EqualsBuilder().append(id, rhs.id).append(accountNo, rhs.accountNo).append(externalId, rhs.externalId).append(status, rhs.status).append(subStatus, rhs.subStatus).append(active, rhs.active).append(activationDate, rhs.activationDate).append(firstname, rhs.firstname).append(lastname, rhs.lastname).append(displayName, rhs.displayName).append(mobileNo, rhs.mobileNo).append(dateOfBirth, rhs.dateOfBirth).append(gender, rhs.gender).append(clientType, rhs.clientType).append(clientClassification, rhs.clientClassification).append(officeId, rhs.officeId).append(officeName, rhs.officeName).append(timeline, rhs.timeline).append(legalForm, rhs.legalForm).append(groups, rhs.groups).append(clientNonPersonDetails, rhs.clientNonPersonDetails).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
