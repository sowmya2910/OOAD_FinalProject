
/**
* @author Abhinav Gupta/Divya Athoopallil
*/


/*
* This Controller contains handling REST APIs focused on
* dealing with bill payment and confirmation according to tables
*/

package com.OOAD.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PayBill {
	
	MakeAnOrder welcome1 = new MakeAnOrder();
	int rand = welcome1.rand1;

	@RequestMapping(value = "/payBill", method = RequestMethod.GET)
	public String showWelcomePage(ModelMap model) {
		return "payBill";
	}
	
	@RequestMapping(value = "/payBill", method = RequestMethod.POST)
	public String showBillComformation(ModelMap model) {
		TableManagement table1 = new TableManagement();	
		if (rand == 0) {
			int returnVal0 = table1.getFlag1();
			int returnVal1 = table1.setFlag1(0); 
			System.out.println("Freeing the table 1");
		} else if(rand == 1) {
			int returnVal2 = table1.getFlag2();
			int returnVal3 = table1.setFlag2(0); 
			System.out.println("Freeing the table 2");			
		} else if(rand == 2) {
			int returnVal4 = table1.getFlag3();
			int returnVal5 = table1.setFlag3(0); 
			System.out.println("Freeing the table 3");			
		} else if(rand == 3) {
			int returnVal6 = table1.getFlag4();
			int returnVal7 = table1.setFlag4(0); 
			System.out.println("Freeing the table 4");			
		} else if(rand == 4) {
			int returnVal8 = table1.getFlag5();
			int returnVal9 = table1.setFlag5(0); 
			System.out.println("Freeing the table 5");			
		} else if(rand == 5) {
			int returnVal10 = table1.getFlag6();
			int returnVal11 = table1.setFlag6(0); 
			System.out.println("Freeing the table 6");			
		}
		
		return "PaymentConfirmation";
	}
}
