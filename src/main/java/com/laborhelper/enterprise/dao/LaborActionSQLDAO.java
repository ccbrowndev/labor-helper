package com.laborhelper.enterprise.dao;

import com.laborhelper.enterprise.dto.LaborAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;
@Repository
@Profile("dev")
public class LaborActionSQLDAO implements ILaborActionDAO {

    @Autowired
    LaborActionRepository laborActionRepository;


    @Override
    public List<LaborAction> fetchActionsByLocation(String locationInfo) throws IOException {
        return null;
    }

    @Override
    public List<LaborAction> fetchAllLaborActions() {
        return null;
    }

    @Override
    public LaborAction save(LaborAction laborAction) {
        LaborAction createdLaborAction = laborActionRepository.save(laborAction);
        return createdLaborAction;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public LaborAction fetchById(int id) {
        return null;
    }

    @Override
    public List<LaborAction> fetchLaborActionByzipCode(int zipCode) {
        return LaborActionRepository.findByzipCode(zipCode);
    }
}
