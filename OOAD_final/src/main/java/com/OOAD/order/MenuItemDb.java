package com.OOAD.order;

import java.io.Serializable;

public class MenuItemDb implements Serializable {
	//Price	Name	Description	Calories

	private static final long serialVersionUID = 1L;

	private String itemname, description, calories;
	private int price;
	
	public MenuItemDb() {
		super();
	}

	public MenuItemDb(String itemname, String description,String calories,int price) {
		super();
		this.itemname = itemname;
		this.description = description;
		this.calories=calories;
		this.price=price;
	}

	public String getItemName() {
		return itemname;
	}

	public void setItemName(String itemname) {
		this.itemname = itemname;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCalories() {
		return calories;
	}

	public void setCalories(String calories) {
		this.calories = calories;
	}


	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		//int price1= parseInt(price);
		this.price = price;
	}

	
}
