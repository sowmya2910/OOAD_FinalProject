
/**
* @author Abhinav Gupta/Divya Athoopallil
*/


/*
* This Controller contains handling REST APIs focused on
* dealing with contact us page.
*/

package com.OOAD.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactUs {
	
	@RequestMapping(value = "/contactUs", method = RequestMethod.GET)
    public String onlineOrder(ModelMap model) {
        return "contactUs";
    }

}
