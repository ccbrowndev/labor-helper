package com.laborhelper.enterprise.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Data;
import lombok.NonNull;
import org.jetbrains.annotations.NotNull;

import javax.persistence.*;
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

    @ElementCollection
    @SerializedName("suppliesNeeded")private Map<String, String> suppliesNeeded;

    public LaborAction(@NotNull String groupName, @NotNull String companyName,
                       @NotNull String location, @NotNull Date startDate) {
        this.groupName = groupName;
        this.companyName = companyName;
        this.location = location;
        this.startDate = startDate;
    }

    public LaborAction() {

    }
}
