package com.OOAD.order;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class OnlineOrder {
	
	@RequestMapping(value = "/onlineOrder", method = RequestMethod.GET)
    public String onlineOrder(ModelMap model) {
        return "onlineOrder";
    }
	
	@RequestMapping(value = "/onlineOrder", method = RequestMethod.POST)
    public String onlineOrderConfirm(ModelMap model, @RequestParam String name, @RequestParam String address) {
		model.addAttribute("name",name);
		model.addAttribute("address",address);
        return "onlineOrderConfirm";
    }

}
