package com.laborhelper.enterprise;

import com.laborhelper.enterprise.dao.ILaborActionDAO;
import com.laborhelper.enterprise.dto.LaborAction;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.verify;

@SpringBootTest
class LaborHelperApplicationTests {

    LaborAction laborAction = new LaborAction(1,"Water",
            "ACME",
            "Cincinnati",
            new Date());

    @MockBean
    private ILaborActionDAO laborActionDAO;

    @Test
    void contextLoads() {
    }

    @Test
    void validateSaveLaborAction_LaborActionCanBeSavedAndReturned() {
        Mockito.when(laborActionDAO.save(laborAction)).thenReturn(laborAction);
        LaborAction returnedLaborAction = laborActionDAO.save(laborAction);
        assertEquals(laborAction, returnedLaborAction);
        verify(laborActionDAO, atLeastOnce()).save(laborAction);
    }

}
