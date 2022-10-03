package com.laborhelper.enterprise.dto;

import lombok.Data;
import lombok.NonNull;
import java.util.Date;
import java.util.Map;

/**
*@NonNull lombok generates a null-check statement
*/

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
}
