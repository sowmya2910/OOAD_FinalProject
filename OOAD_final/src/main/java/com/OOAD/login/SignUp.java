
/**
* @author Abhinav Gupta/Divya Athoopallil
*/


/*
* This Controller contains handling REST APIs focused on
* dealing with signing up action.
*/

package com.OOAD.login;

import java.util.ArrayList;
import java.util.List;
import java.util.Random; 
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
	
	private List<UserDb> getData() {
		List<UserDb> user_list = new ArrayList<UserDb>();
		UserDBService userDbService=new UserDBService();
		user_list= userDbService.getAll();		
		return user_list;
		
	}	
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String signUpComplete(ModelMap model, @RequestParam String email, @RequestParam String password, @RequestParam String confirm_password) {
		//String email1 = email;
		String comma = ",";
		UserDBService userDbService=new UserDBService();
		if(userDbService.isPresent(email)==null) {
			Random rand = new Random(); 
			int id = rand.nextInt(1000); 
			UserDb user=new UserDb( Integer.toString(id) ,email,password,"USER");
			userDbService.add(user);	
		}
		else {
			
			String warning = "User present, Please try another Username";
			model.addAttribute("warning", warning);			
			email = "";
			comma = "";

			
		}
			
		model.addAttribute("comma",comma);
		model.addAttribute("name",email);
		return "login";
	}
}

