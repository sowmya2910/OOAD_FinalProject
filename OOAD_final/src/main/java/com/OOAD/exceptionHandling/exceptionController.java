
/**
* @author Abhinav Gupta/Divya Athoopallil
*/


/*
* This Controller contains handling REST APIs focused on
* dealing with Access Denied page.
*/
package com.OOAD.exceptionHandling;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class exceptionController {
	
	@RequestMapping(value = "/Access_Denied", method = RequestMethod.GET)
    public String accessDeniedPage(ModelMap model) {
        return "Access_Denied";
    }

}
