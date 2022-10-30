package com.laborhelper.enterprise.service;

import com.laborhelper.enterprise.dto.LaborAction;

import java.util.List;

public interface ILaborActionService {
    LaborAction fetchlaborActionById(int LaborActionid);

  LaborAction save(LaborAction laborAction) throws Exception;

    List<LaborAction> fetchAll();
}
