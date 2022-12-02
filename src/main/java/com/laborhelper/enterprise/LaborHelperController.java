package com.laborhelper.enterprise;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LaborHelperController {

    /**
     * Handle the root (/) endpoint
     * @return the home page of the application
     */
    @GetMapping ("/")
    public String index() {
        return "start";
    }

    /**
     * Handle the registration (/registration) endpoint
     * @return a login and registration area
     */
    @GetMapping ("/registration")
    public String registration() { return "registration";}
}
