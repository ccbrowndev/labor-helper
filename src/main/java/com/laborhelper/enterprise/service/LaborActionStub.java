package com.laborhelper.enterprise.service;

import com.laborhelper.enterprise.dto.LaborAction;

public class LaborActionStub implements ILaborActionService{

    @Override
    public LaborAction FetchAllWithZipCode(String s) {
        int i = Integer.parseInt("45239");
        LaborAction laborAction = new LaborAction("1ad","Workers","InsertCompanynamehere", i , "Cincinnati","04-15-2023");
        return laborAction;
    }
}
