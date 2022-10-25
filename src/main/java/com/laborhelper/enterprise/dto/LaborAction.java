package com.laborhelper.enterprise.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.Map;

@Entity
public @Data class LaborAction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NonNull @SerializedName("id") Integer id;

    @NonNull @SerializedName("groupName")private String groupName;
    @NonNull @SerializedName("companyName")private String companyName;
    @NonNull @SerializedName("location")private String location;
    @NonNull @SerializedName("startDate")private Date startDate;
    @SerializedName("groupContact")private String groupContact;
    @SerializedName("contactInformation")private String contactInformation;
    @SerializedName("authorized")private Boolean authorized;
    @SerializedName("numberOfWorkers")private Integer numberOfWorkers;
    @SerializedName("suppliesNeeded")private Map<String, String> suppliesNeeded;


    public LaborAction() {

    }
}
