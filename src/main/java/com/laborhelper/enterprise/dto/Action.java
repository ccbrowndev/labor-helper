package com.laborhelper.enterprise.dto;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.Map;

public class Action {
    @SerializedName("id")
    private Integer id;
    @SerializedName("groupName")
    private String groupName;
    @SerializedName("companyName")
    private String companyName;
    @SerializedName("location")
    private String location;
    @SerializedName("startDate")
    private Date startDate;
    @SerializedName("groupContact")
    private String groupContact;
    @SerializedName("contactInformation")
    private String contactInformation;
    @SerializedName("authorized")
    private Boolean authorized;
    @SerializedName("numberOfWorkers")
    private Integer numberOfWorkers;
    @SerializedName("suppliesNeeded")
    private Map<String, String> suppliesNeeded;
}
