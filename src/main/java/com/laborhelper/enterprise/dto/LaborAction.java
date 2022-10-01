package com.laborhelper.enterprise.dto;

import lombok.Data;
import lombok.NonNull;
import java.util.Date;
import java.util.Map;

/*
Maybe separate this class in multiple other classes?
@nonNull is helpful but makes testing a little harder
*/
public @Data class LaborAction {
    //Id Might want to be int if you aren't using letters in
    @NonNull private String id;
    @NonNull private String groupName;
    @NonNull private String companyName;
    //Added for Test
    @NonNull private Integer Zipcode;
    @NonNull private String location;
    //Having trouble with date format so changing Date to string
    @NonNull private String startDate;
    private String groupContact;
    private String contactInformation;
    private Boolean authorized;
    private Integer numberOfWorkers;
    private Map<String, String> suppliesNeeded;


}
