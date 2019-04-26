
/**
* @author Abhinav Gupta/Divya Athoopallil
*/


/*
* This Controller contains handling REST APIs focused on
* dealing with chef profile page
*/

package com.OOAD.order;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ChefPage {
	
	@RequestMapping(value = "/chefPage", method = RequestMethod.GET)
    public String onlineOrder(ModelMap model) {
        return "chefPage";
    }

}
