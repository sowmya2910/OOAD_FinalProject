package com.OOAD.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SignUp {

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signUp() {
		return "signup";
	}
}

