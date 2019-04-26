
/**
* @author Abhinav Gupta/Divya Athoopallil
*/


/*
* This Controller contains handling REST APIs focused on
* dealing with critic reviews and acknowledgement.
*/

package com.OOAD.reviews;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CriticsReview {
	
	@RequestMapping(value = "/employee", method = RequestMethod.POST)
    public String criticsThank(ModelMap model) {
        return "criticsThank";
    }

}
