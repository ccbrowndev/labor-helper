package com.laborhelper.enterprise;

import com.laborhelper.enterprise.dto.LaborAction;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LaborHelperController {

    /**
     * Handle the root (/) endpoint and return a start page
     * @return
     */
    @GetMapping ("/")
    public String index() {
        return "start";
    }

   /*
   Creating labor Action Request for Json
    */
    @PostMapping
            ( value = "/createLaborAction", consumes = "application/json", produces = "application/json")
    public LaborAction createLaborAction(@RequestBody LaborAction laborAction){
        int i = 1 + 1 ;
        return laborAction;

    }


}
