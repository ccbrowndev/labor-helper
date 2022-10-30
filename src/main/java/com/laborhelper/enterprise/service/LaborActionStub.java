package com.laborhelper.enterprise.service;

import com.laborhelper.enterprise.dto.LaborAction;

public class LaborActionStub implements ILaborActionService{

    @Override
    public LaborAction FetchAllWithZipCode(String s){
        LaborAction laborAction = new LaborAction();

        return laborAction;
    }
}
