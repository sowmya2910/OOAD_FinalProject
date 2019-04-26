package com.OOAD.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SignUp {

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signUp() {
		return "signup";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signUpComplete(ModelMap model, @RequestParam String email, @RequestParam String password, @RequestParam String confirm_password) {
		//String email1 = email;
		
		model.addAttribute("name",email);
		return "login";
	}
}

