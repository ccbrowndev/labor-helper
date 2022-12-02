package com.laborhelper.enterprise.dao;

import com.laborhelper.enterprise.dto.LaborAction;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Repository
//@Profile("test")
public class LaborActionDAOStub implements ILaborActionDAO {

    Date la3124Date = new Date(1665406800000L);
    LaborAction uawLaborAction3124 = new LaborAction(
            "United Auto Workers Local 863",
            "Ford",
            "39°16'23.2\"N, 84°25'27.1\"W",
            la3124Date, 45069);
    Map<Integer, LaborAction> allLaborActions = Map.of(3124, uawLaborAction3124);

    @Override
    public List<LaborAction> fetchActionsByLocation(String locationInfo) {
        // TODO: 10/15/2022
        return null;
    }

    @Override
    public List<LaborAction> fetchAllLaborActions() {
        return new ArrayList<>(allLaborActions.values());
    }

    @Override
    public LaborAction save(LaborAction laborAction) {
        allLaborActions.put(laborAction.getId(), laborAction);
        return laborAction;
    }

    @Override
    public void delete(int id) {
        allLaborActions.remove(id);
    }

    @Override
    public LaborAction fetchById(int id) {
        return allLaborActions.get(id);
    }

    @Override
    public List<LaborAction> fetchLaborActionByzipCode(int zipCode) {
        return null;
    }
}
