
/**
* @author Abhinav Gupta/Divya Athoopallil
*/


/*
* Service for Menu database
*/

package com.OOAD.order;


import java.util.ArrayList;
import java.util.List;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.OOAD.login.MongoFactory;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;



@Service("MenuDBService")
@Transactional
public class MenuDBService {

	static String db_name = "restaurants", db_collection = "MenuService";
	private static Logger log = Logger.getLogger(MenuDBService.class);
	
	
	public List<MenuItemDb> getAll() {
		List<MenuItemDb> menu_list = new ArrayList<MenuItemDb>();
		DBCollection coll = MongoFactory.getCollection(db_name, db_collection);
		DBCursor cursor = coll.find();
		System.out.println(coll.find());
		
		while(cursor.hasNext()) {			
			DBObject dbObject = cursor.next();
			MenuItemDb menu = new MenuItemDb();
			menu.setItemName(dbObject.get("name").toString());
			menu.setDescription(dbObject.get("description").toString());
			menu.setCalories(dbObject.get("calories").toString());
			menu.setPrice(Integer.parseInt(dbObject.get("price").toString()));
			menu_list.add(menu);
		}
		log.debug("Total records fetched from the mongo database are= " + menu_list.size());
		return menu_list;
	}

	public Boolean add(MenuItemDb menu) {
		boolean output = false;

		try {			
			DBCollection coll = MongoFactory.getCollection(db_name, db_collection);

			
			BasicDBObject doc = new BasicDBObject();
			doc.put("name", menu.getItemName()); 
			doc.put("description", menu.getDescription());			
			doc.put("calories", menu.getCalories());
			doc.put("price", menu.getPrice());
			coll.insert(doc);
			output = true;
		} catch (Exception e) {
			output = false;
			log.error("An error occurred while saving a new user to the mongo database", e);			
		}
		return output;
	}

	
	public Boolean edit(MenuItemDb itemval) {
		boolean output = false;
		try {
			DBCollection coll = MongoFactory.getCollection(db_name, db_collection);

			DBObject existing = new BasicDBObject();
			existing.put("name", itemval);
			
			BasicDBObject edited = new BasicDBObject();		
			edited.put("name", itemval.getItemName()); 
			edited.put("description", itemval.getDescription());			
			edited.put("calories", itemval.getCalories());
			edited.put("price", itemval.getPrice());
			

			coll.update(existing, edited);
			output = true;
		} catch (Exception e) {
			output = false;
			log.error("An error has occurred while updating an existing user to the mongo database", e);			
		}
		return output;
	}

	
	public Boolean delete(String itemval) {
		boolean output = false;
		try {
			
			DBCollection coll = MongoFactory.getCollection(db_name, db_collection);

			DBObject where_query = new BasicDBObject();
			where_query.put("name", itemval);

			coll.remove(where_query);
			output = true;			
		} catch (Exception e) {
			output = false;
			log.error("An error occurred while deleting an existing user from the mongo database", e);			
		}	
		return output;
	}

	public MenuItemDb findItemName(String itemname) {
		MenuItemDb m = new MenuItemDb();
		DBCollection coll = MongoFactory.getCollection(db_name, db_collection);

		
		DBObject where_query = new BasicDBObject();
		where_query.put("name", itemname);

		DBObject dbo = coll.findOne(where_query);		
		m.setItemName(dbo.get("name").toString());
		m.setDescription(dbo.get("description").toString());
		m.setCalories(dbo.get("calories").toString());
		m.setPrice(Integer.parseInt(dbo.get("price").toString()));
		return m;
	}
}
