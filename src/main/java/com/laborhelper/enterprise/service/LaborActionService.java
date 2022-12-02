package com.laborhelper.enterprise.service;

import com.laborhelper.enterprise.dao.ILaborActionDAO;
import com.laborhelper.enterprise.dto.LaborAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class LaborActionService implements ILaborActionService {

    @Autowired
    private static ILaborActionDAO laborActionDAO;

    public LaborActionService(ILaborActionDAO laborActionDAO){
        this.laborActionDAO = laborActionDAO;
    }


    public static List<LaborAction> fetchLaborActionByzipCode() {
        return fetchLaborActionByzipCode(0);
    }

    public static List<LaborAction> fetchLaborActionByzipCode(int zipCode) {
        return laborActionDAO.fetchLaborActionByzipCode(zipCode);
    }


    @Override
    @Cacheable(value="laborAction", key="#id")
    public LaborAction fetchByID(int id) {
        LaborAction foundLaborAction = laborActionDAO.fetchById(id);
        return foundLaborAction;
    }

    @Override
    @CacheEvict(value="laborAction", key="#id")
    public void delete(int id) throws Exception{
        laborActionDAO.delete(id);
    }


    @Override
    public LaborAction save(LaborAction laborAction) throws Exception {
        return null;
    }

    @Override
    @Cacheable("laborAction")
    public List<LaborAction> fetchAll() {
        return laborActionDAO.fetchAllLaborActions();
    }

}
