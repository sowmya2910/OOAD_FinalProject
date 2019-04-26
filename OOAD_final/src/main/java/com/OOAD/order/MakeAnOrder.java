package com.OOAD.order;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import javax.annotation.Resource;


@Controller
public class MakeAnOrder {	
	
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
	
	//String menu = "XXXXXXXXXXXXXXXXXXXXXXXXX";
	
	
	private CalculateBill bill = new CalculateBill();
//	
//	@Resource(name="MenuDBService")
//	private MenuDBService menuDbService;
//	//List<MenuItemDb> menu_list=menuDbService.getAll();
//	
//   @Autowired
	private List<MenuItemDb> getData() {//List<MenuItemDb> getData() {
		List<MenuItemDb> menu_list = new ArrayList<MenuItemDb>();
		MenuDBService menuDbService=new MenuDBService();
		menu_list= menuDbService.getAll();		
		return menu_list;
      }	
	//private 
	
	// GET menu
	@RequestMapping(value = "/menu", method = RequestMethod.GET)
	public String getMenu(Model model) {
		//List<MenuItemDb> menu_list=menuDbService.getAll();
		//model.addAttribute("MenuList",menuDbService.getAll());
		List<MenuItemDb> menu_list=getData();
		int i=1;
		for (MenuItemDb element : menu_list) {
//				//System.out.println(element.getItemName());
//				System.out.println(element.getItemName());
//				System.out.println(element.getDescription());
//	     		System.out.println(element.getPrice());
//				System.out.println(element.getCalories());
//				System.out.println("_____________________________________");
//				
				model.addAttribute("Menu"+Integer.toString(i), element.getItemName());
				model.addAttribute("Desc"+Integer.toString(i), element.getDescription());
				model.addAttribute("Price"+Integer.toString(i), element.getPrice());
				model.addAttribute("Calories"+Integer.toString(i), element.getCalories());
				i+=1;
			}	
		
		//model.addAttribute("Menu1", menuItem1);
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
