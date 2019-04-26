/**
 * @author Abhinav Gupta/Divya Athoopallil
 */
package com.OOAD.employee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/*
 * This Controller contains handling REST APIs focused on
 * dealing with employee.
 */

@Controller
public class EmployeeManagement {
	
	@RequestMapping(value = "/employee", method = RequestMethod.GET)
	public String showEmployee(ModelMap model) {
		return "employee";
	}

}
