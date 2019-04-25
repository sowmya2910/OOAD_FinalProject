package com.OOAD.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PayBill {

	@RequestMapping(value = "/payBill", method = RequestMethod.GET)
	public String showWelcomePage(ModelMap model) {
		return "payBill";
	}
	
	@RequestMapping(value = "/payBill", method = RequestMethod.POST)
	public String showBillComformation(ModelMap model) {
		return "PaymentConfirmation";
	}
}
