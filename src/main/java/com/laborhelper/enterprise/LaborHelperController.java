package com.laborhelper.enterprise;

import com.laborhelper.enterprise.dto.LaborAction;
import com.laborhelper.enterprise.service.LaborActionService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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

    @GetMapping ("/laborActions")
    public String laborActions() { return "laborActions";}

    @GetMapping("/laborActionByzipCode/{zipCode}")
    public ModelAndView laborActionByzipCode(@PathVariable("zipCode")int zipCode){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("LaborActionDetails");
        List<LaborAction> laborActions;
        laborActions = LaborActionService.fetchLaborActionByzipCode(zipCode);
        modelAndView.addObject("laborActions", laborActions);
        return modelAndView;
    }
}
