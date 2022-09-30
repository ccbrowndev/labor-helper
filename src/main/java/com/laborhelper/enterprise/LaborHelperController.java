package com.laborhelper.enterprise;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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

}
