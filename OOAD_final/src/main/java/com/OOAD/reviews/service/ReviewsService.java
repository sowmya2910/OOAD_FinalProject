
/**
* @author Abhinav Gupta/Divya Athoopallil
*/


/*
* Reviews Service
*/

package com.OOAD.reviews.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.OOAD.model.Reviews;

@Service
public class ReviewsService {
	private static List<Reviews> reviews = new ArrayList<Reviews>();
	private static int reviewsCount = 3;

	static {
		reviews.add(new Reviews(1, "abhinav", "Learn Spring MVC", new Date(),
				false));
		reviews.add(new Reviews(2, "abhinav", "Learn Struts", new Date(), false));
		reviews.add(new Reviews(3, "abhinav", "Learn Hibernate", new Date(),
				false));
	}

	public List<Reviews> retrieveReviews(String user) {
		List<Reviews> filteredReviews = new ArrayList<Reviews>();
		for (Reviews reviews : reviews) {
			if (reviews.getUser().equals(user))
				filteredReviews.add(reviews);
		}
		return filteredReviews;
	}

	public Reviews retrieveReviews(int id) {
		for (Reviews reviews : reviews) {
			if (reviews.getId() == id)
				return reviews;
		}
		return null;
	}

	public void updateReviews(Reviews review) {
		reviews.remove(review);
		reviews.add(review);
	}

	public void addReviews(String name, String desc, Date targetDate,
			boolean isDone) {
		reviews.add(new Reviews(++reviewsCount, name, desc, targetDate, isDone));
	}

	public void deleteReviews(int id) {
		Iterator<Reviews> iterator = reviews.iterator();
		while (iterator.hasNext()) {
			Reviews reviews = iterator.next();
			if (reviews.getId() == id) {
				iterator.remove();
			}
		}
	}
}
