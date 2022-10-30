package com.laborhelper.enterprise.service;

import com.laborhelper.enterprise.dao.LaborActionDAO;
import com.laborhelper.enterprise.dto.LaborAction;
import lombok.NonNull;

import java.util.List;
public class LaborActionServiceStub {

    @Override
    public LaborAction fetchActionsByLocation(String LocationInfo) {
       LaborAction laborAction = new LaborAction();
        @NonNull String United;
        laborAction.setLocation(United);
        laborAction.setId(45054);
        return laborAction;
    }
}
