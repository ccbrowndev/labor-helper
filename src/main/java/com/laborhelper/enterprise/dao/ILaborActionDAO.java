package com.laborhelper.enterprise.dao;

import com.laborhelper.enterprise.dto.LaborAction;

import java.util.List;

public interface ILaborActionDAO {

    List<LaborAction> fetchAllLaborActions();
    LaborAction save(LaborAction laborAction);
    void delete(int id);
    LaborAction fetchById(int id);

}
