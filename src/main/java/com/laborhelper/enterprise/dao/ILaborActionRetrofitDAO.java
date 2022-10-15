package com.laborhelper.enterprise.dao;


import com.laborhelper.enterprise.dto.Action;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface ILaborActionRetrofitDAO {

    @GET("/draft-06/schema#")
    Call<List<Action>> getLaborAction(@Query("Combined_Name") String combinedName);
}
