package com.laborhelper.enterprise.service;

import com.laborhelper.enterprise.dto.LaborAction;

import java.util.List;

public interface ILaborActionService {

    LaborAction fetchByID(int id);

    void delete(int id) throws Exception;

    LaborAction save(LaborAction laborAction) throws Exception;

    List<LaborAction> fetchAll();

    static List<LaborAction> fetchLaborActionByzipCode(int zipCode) {
        return null;
    }

}
