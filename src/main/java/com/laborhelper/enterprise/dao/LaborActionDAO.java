package com.laborhelper.enterprise.dao;

import com.laborhelper.enterprise.dto.LaborAction;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

public class LaborActionDAO implements ILaborActionDAO{

    @Override
    public List<LaborAction> fetchActionsByLocation(String locationInfo) throws IOException {
        Retrofit retrofitInstance = RetrofitClientInstance.getRetrofitInstance();
        ILaborActionRetrofitDAO laborActionRetrofitDAO = retrofitInstance.create(ILaborActionRetrofitDAO.class);
        laborActionRetrofitDAO.getLaborAction(locationInfo);
        Call<List<LaborAction>> allAction = laborActionRetrofitDAO.getLaborAction(locationInfo);
        Response<List<LaborAction>> execute = allAction.execute();
        List<LaborAction> actions = execute.body();
        return actions;
    }

    @Override
    public List<LaborAction> fetchAllLaborActions() {
        // TODO: 10/15/2022
        return null;
    }

    @Override
    public LaborAction save(LaborAction laborAction) {
        // TODO: 10/15/2022
        return null;
    }

    @Override
    public void delete(int id) {
        // TODO: 10/15/2022
    }

    @Override
    public LaborAction fetchById(int id) {
        // TODO: 10/15/2022
        return null;
    }
}
