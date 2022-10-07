package com.laborhelper.enterprise.dao;

import com.laborhelper.enterprise.dto.LaborAction;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class LaborActionDAOStub implements ILaborActionDAO {

    Map<Integer,LaborAction> allLaborActions = new HashMap<>();

    @Override
    public List<LaborAction> fetchAllLaborActions() {
        return new ArrayList(allLaborActions.values());
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
}
