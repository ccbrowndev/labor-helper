package com.laborhelper.enterprise;

import com.laborhelper.enterprise.dao.ILaborActionDAO;
import com.laborhelper.enterprise.dao.LaborActionDAOStub;
import com.laborhelper.enterprise.dto.LaborAction;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
class LaborActionUnitTests {

    private ILaborActionDAO laborActionService = new LaborActionDAOStub();
    private LaborAction laborAction;

    @Test
    void whenISelectLaborAction3124ThenIShouldGetUawAsGroup() {
        givenLaborActionDataAreAvailable();
        WhenISelectLaborAction3124();
        ThenIShouldGetUawLocal863AsGroup();
    }

    private void givenLaborActionDataAreAvailable() {
    }

    private void WhenISelectLaborAction3124() {
        laborAction = laborActionService.fetchById(3124);
    }

    private void ThenIShouldGetUawLocal863AsGroup() {
        var groupName = laborAction.getGroupName();
        assertEquals("Name of the worker group taking action","United Auto Workers Local 863", groupName);
    }

}
