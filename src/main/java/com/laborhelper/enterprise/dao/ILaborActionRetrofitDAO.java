package com.laborhelper.enterprise.dao;


import com.laborhelper.enterprise.dto.LaborAction;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface ILaborActionRetrofitDAO {

    @GET("/draft-06/schema#")
    Call<List<LaborAction>> getLaborAction(@Query("Combined_Name") String combinedName);
}
