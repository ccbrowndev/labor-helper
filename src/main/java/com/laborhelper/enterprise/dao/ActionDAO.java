package com.laborhelper.enterprise.dao;

import com.laborhelper.enterprise.dto.Action;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

public class ActionDAO implements IActionDAO{
    @Override
    public List<Action> fetchAction(String combinedName) throws IOException {
        Retrofit retrofitInstance = RetrofitClientInstance.getRetrofitInstance();
        ILaborActionRetrofitDAO laborActionRetrofitDAO = retrofitInstance.create(ILaborActionRetrofitDAO.class);
        laborActionRetrofitDAO.getLaborAction(combinedName);
        Call<List<Action>> allAction = laborActionRetrofitDAO.getLaborAction(combinedName);
        Response<List<Action>> execute = allAction.execute();
        List<Action> actions = execute.body();
        return actions;
    }
}
