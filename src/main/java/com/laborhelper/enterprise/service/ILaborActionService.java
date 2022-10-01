package com.laborhelper.enterprise.service;

import com.laborhelper.enterprise.dto.LaborAction;

public interface ILaborActionService {
    LaborAction FetchAllWithZipCode(String s);
}
