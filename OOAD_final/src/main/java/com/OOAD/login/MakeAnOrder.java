/**
* @author Abhinav Gupta/Divya Athoopallil
*/


/*
* Class enabling order making and bill generation
*/

package com.OOAD.login;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.OOAD.order.CalculateBill;

@Controller
public class MakeAnOrder {	
	
	static Random random1 = new Random();	
	static int rand1 = random1.nextInt(6);
	
	int quantity1 = 0;
	int quantity2 = 0;
	int quantity3 = 0;
	int quantity4 = 0;
	int quantity5 = 0;
	int quantity6 = 0;
	int quantity7 = 0;
	int quantity8 = 0;
	int quantity9 = 0;
	int quantity10 = 0;
	int quantity11 = 0;
	int quantity12 = 0;
	
	private CalculateBill bill = new CalculateBill();
	
	// GET menu
	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public String getMenu() {
		return "menu";
	}
	
	// GET make order page
		@RequestMapping(value = "/makeOrder", method = RequestMethod.GET)
		public String makeOrder() {
			return "makeOrder";
		}
		
		@RequestMapping(value = "/makeOrder", method = RequestMethod.POST)
	    public String restauraOrderConfirm(ModelMap model, @RequestParam int Quantity1, @RequestParam int Quantity2, @RequestParam int Quantity3, @RequestParam int Quantity4,
	    		@RequestParam int Quantity5, @RequestParam int Quantity6, @RequestParam int Quantity7, @RequestParam int Quantity8, @RequestParam int Quantity9, @RequestParam int Quantity10,
	    		@RequestParam int Quantity11, @RequestParam int Quantity12) {
			
			quantity1 = Quantity1;
			quantity2 = Quantity2;
			quantity3 = Quantity3;
			quantity4 = Quantity4;
			quantity5 = Quantity5;
			quantity6 = Quantity6;
			quantity7 = Quantity7;
			quantity8 = Quantity8;
			quantity9 = Quantity9;
			quantity10 = Quantity10;
			quantity11 = Quantity11;
			quantity12 = Quantity12;
			
			model.addAttribute("Quantity1",quantity1);
			model.addAttribute("Quantity2",quantity2);
			model.addAttribute("Quantity3",quantity3);
			model.addAttribute("Quantity4",quantity4);
			model.addAttribute("Quantity5",quantity5);
			model.addAttribute("Quantity6",quantity6);
			model.addAttribute("Quantity7",quantity7);
			model.addAttribute("Quantity8",quantity8);
			model.addAttribute("Quantity9",quantity9);
			model.addAttribute("Quantity10",quantity10);
			model.addAttribute("Quantity11",quantity11);
			model.addAttribute("Quantity12",quantity12);
			
			TableManagement table1 = new TableManagement();
			
			System.out.println(rand1);
			if (rand1 == 0) {			
				int returnVal0 = table1.getFlag1();
				
				if (returnVal0 == 1) {
					System.out.println("Table 1 already Booked, login again");
					model.addAttribute("table","Table 1 already Booked, submit again");
					return "makeOrder";
				}
				
				else {
					System.out.println("Table 1 is Free and booking for you");
					int returnVal1 = table1.setFlag1(1);
					model.addAttribute("table", "Table 1 is Free and booking for you");
				}
			}
				
			else if (rand1 == 1) {
				int returnVal2 = table1.getFlag2();
				
				if (returnVal2 == 1) {
					System.out.println("Table 2 is already Booked, login again");
					model.addAttribute("table","Table 2 already Booked, submit again");
					return "makeOrder";
				}
				
				else {
					System.out.println("Table 2 is Free and booking for you");
					int returnVal3 = table1.setFlag2(1);
					model.addAttribute("table", "Table 2 is Free and booking for you");
				}
			}
			
			System.out.println(rand1);
			if (rand1 == 2) {			
				int returnVal4 = table1.getFlag3();
				
				if (returnVal4 == 1) {
					System.out.println("Table 3 already Booked, login again");
					model.addAttribute("table","Table 3 already Booked, submit again");
					return "makeOrder";
				}
				
				else {
					System.out.println("Table 3 is Free and booking for you");
					int returnVal5 = table1.setFlag3(1);
					model.addAttribute("table", "Table 3 is Free and booking for you");
				}
			}
				
			else if (rand1 == 3) {
				int returnVal6 = table1.getFlag4();
				
				if (returnVal6 == 1) {
					System.out.println("Table 4 is already Booked, login again");
					model.addAttribute("table","Table 4 already Booked, submit again");
					return "makeOrder";
				}
				
				else {
					System.out.println("Table 4 is Free and booking for you");
					int returnVal7 = table1.setFlag4(1);
					model.addAttribute("table", "Table 4 is Free and booking for you");
				}
			}
			
			System.out.println(rand1);
			if (rand1 == 4) {			
				int returnVal8 = table1.getFlag5();
				
				if (returnVal8 == 1) {
					System.out.println("Table 5 already Booked, login again");
					model.addAttribute("table","Table 5 already Booked, submit again");
					return "makeOrder";
				}
				
				else {
					System.out.println("Table 5 is Free and booking for you");
					int returnVal9 = table1.setFlag5(1);
					model.addAttribute("table", "Table 5 is Free and booking for you");
				}
			}
				
			else if (rand1 == 5) {
				int returnVal10 = table1.getFlag6();
				
				if (returnVal10 == 1) {
					System.out.println("Table 6 is already Booked, login again");
					model.addAttribute("table","Table 6 already Booked, submit again");
					return "makeOrder";
				}
				
				else {
					System.out.println("Table 6 is Free and booking for you");
					int returnVal11 = table1.setFlag6(1);
					model.addAttribute("table", "Table 6 is Free and booking for you");
				}
			}
			 
			
	        return "restaurantOrderConfirm";
	    }
		
		// Calculate the bill.
		
		// GET billing details page.
				@RequestMapping(value = "/getBill", method = RequestMethod.GET)
				public String getBill(ModelMap model) {
					int total = bill.calculateBill(quantity1, quantity2, quantity3, quantity4, quantity5, quantity6, quantity7,
							quantity8, quantity9, quantity10, quantity11, quantity12);
//					System.out.println(quantity1);
//					System.out.println(total);
					model.put("total", total);
					return "getBill";
				}

				
		
}
