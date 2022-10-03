package com.laborhelper.enterprise.dto;

import lombok.Data;
import lombok.NonNull;
import java.util.Date;
import java.util.Map;

public @Data class LaborAction {
    @NonNull private String id;
    @NonNull private String groupName;
    @NonNull private String companyName;
    @NonNull private String location;
    @NonNull private Date startDate;
    private String groupContact;
    private String contactInformation;
    private Boolean authorized;
    private Integer numberOfWorkers;
    private Map<String, String> suppliesNeeded;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getGroupContact() {
        return groupContact;
    }

    public void setGroupContact(String groupContact) {
        this.groupContact = groupContact;
    }

    public String getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation;
    }

    public Boolean getAuthorized() {
        return authorized;
    }

    public void setAuthorized(Boolean authorized) {
        this.authorized = authorized;
    }

    public Integer getNumberOfWorkers() {
        return numberOfWorkers;
    }

    public void setNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    public Map<String, String> getSuppliesNeeded() {
        return suppliesNeeded;
    }

    public void setSuppliesNeeded(Map<String, String> suppliesNeeded) {
        this.suppliesNeeded = suppliesNeeded;
    }
}
