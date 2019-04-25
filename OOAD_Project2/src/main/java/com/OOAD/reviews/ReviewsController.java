package com.OOAD.reviews;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.OOAD.model.Reviews;
import com.OOAD.reviews.service.ReviewsService;

@Controller
public class ReviewsController {

	@Autowired
	private ReviewsService service;

	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(
				dateFormat, false));
	}

	@RequestMapping(value = "/list-reviews", method = RequestMethod.GET)
	public String showReviewsList(ModelMap model) {
		String user = getLoggedInUserName();
		model.addAttribute("reviews", service.retrieveReviews(user));
		return "list-reviews";
	}

	@RequestMapping(value = "/add-reviews", method = RequestMethod.GET)
	public String showAddReviewsPage(ModelMap model) {
		model.addAttribute("reviews", new Reviews());
		return "reviews";
	}

	@RequestMapping(value = "/add-reviews", method = RequestMethod.POST)
	public String addReviews(ModelMap model, @Valid Reviews reviews, BindingResult result) {

		if (result.hasErrors())
			return "reviews";

		service.addReviews(getLoggedInUserName(), reviews.getDesc(),
				reviews.getTargetDate(), false);
		model.clear();// to prevent request parameter "name" to be passed
		return "redirect:/list-reviews";
	}

	private String getLoggedInUserName() {
		Object principal = SecurityContextHolder.getContext()
				.getAuthentication().getPrincipal();

		if (principal instanceof UserDetails)
			return ((UserDetails) principal).getUsername();

		return principal.toString();
	}

	@RequestMapping(value = "/update-reviews", method = RequestMethod.GET)
	public String showUpdateReviewsPage(ModelMap model, @RequestParam int id) {
		model.addAttribute("reviews", service.retrieveReviews(id));
		return "reviews";
	}

	@RequestMapping(value = "/update-reviews", method = RequestMethod.POST)
	public String updateReviews(ModelMap model, @Valid Reviews reviews,
			BindingResult result) {
		if (result.hasErrors())
			return "reviews";

		reviews.setUser(getLoggedInUserName());
		service.updateReviews(reviews);

		model.clear();// to prevent request parameter "name" to be passed
		return "redirect:/list-reviews";
	}

	@RequestMapping(value = "/delete-reviews", method = RequestMethod.GET)
	public String deleteReviews(@RequestParam int id) {
		service.deleteReviews(id);

		return "redirect:/list-reviews";
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(ModelMap model, String error, String logout) {
        if (error != null)
            model.addAttribute("errorMsg", "Your username and password are invalid.");

        if (logout != null)
            model.addAttribute("msg", "You have been logged out successfully.");

        return "login";
    }

}