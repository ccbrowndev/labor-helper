package com.laborhelper.enterprise;

import com.laborhelper.enterprise.dto.LaborAction;
import com.laborhelper.enterprise.service.ILaborActionService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.util.AssertionErrors.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
class LaborHelperApplicationTests {

    @Test
    void contextLoads() {
    }

}
@WebMvcTest
class WebLayerTest {

    @Autowired
    private MockMvc mockMvc;
    private ILaborActionService laborActionService;
    private LaborAction laborAction;


    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk());
    }

    /**
    For Businesslogic
    Given: a user has entered in a valid zip code of 45239
    When: The Search Button is Pressed
    Then: Display all results of that zip code
     */


    @Test
    void whenuserentersvalidzipcode_returnresultsofzipcode()

    {
    ZipCodeisEntered();
    SearchForResult();
    ReturnzipCode();
    }

    private void ZipCodeisEntered() {
        //Can Only do stuff with this when database UI is created
    }

    private void SearchForResult() {
        //Only 1 result
        laborAction = laborActionService.FetchAllWithZipCode("45239");

    }

    private void ReturnzipCode() {
        int i = laborAction.getZipcode();
        assertEquals("Should be 45239",45239,i);
    }


}