package com.OOAD.login;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

@Service("userService")
@Transactional
public class UserDBService {

	static String db_name = "restaurants", db_collection = "UserDatabase";
	private static Logger log = Logger.getLogger(UserDBService.class);

	public List<UserDb> getAll() {
		List<UserDb> user_list = new ArrayList<UserDb>();
		
		DBCollection coll = MongoFactory.getCollection(db_name, db_collection);
		DBCursor cursor = coll.find();
		
		while(cursor.hasNext()) {			
			DBObject dbObject = cursor.next();
			UserDb user = new UserDb();
			user.setId(dbObject.get("id").toString());
			user.setUsername(dbObject.get("username").toString());
			user.setPassword(dbObject.get("password").toString());
			user.setRoles(dbObject.get("role").toString());
			user_list.add(user);
		}
		log.debug("Total records fetched from the mongo database are= " + user_list.size());
		return user_list;
	}

	// Add a new user to the mongo database.
	public Boolean add(UserDb user) {
		boolean output = false;
		Random ran = new Random();
		try {			
			DBCollection coll = MongoFactory.getCollection(db_name, db_collection);

			BasicDBObject doc = new BasicDBObject();
			doc.put("id", String.valueOf(ran.nextInt(100))); 
			doc.put("username", user.getUsername());			
			doc.put("password", user.getPassword());
			doc.put("role", user.getRoles());
			
			coll.insert(doc);
			output = true;
		} catch (Exception e) {
			output = false;
			log.error("An error occurred while saving a new user to the mongo database", e);			
		}
		return output;
	}

	public Boolean edit(UserDb user) {
		boolean output = false;
		try {
			BasicDBObject existing = (BasicDBObject) getDBObject(user.getId());

			DBCollection coll = MongoFactory.getCollection(db_name, db_collection);
			BasicDBObject edited = new BasicDBObject();
			edited.put("id", user.getId()); 
			edited.put("name", user.getUsername());
			edited.put("password", user.getPassword());
			edited.put("role", user.getRoles());

			coll.update(existing, edited);
			output = true;
		} catch (Exception e) {
			output = false;
			log.error("An error has occurred while updating an existing user to the mongo database", e);			
		}
		return output;
	}

	public Boolean delete(String id) {
		boolean output = false;
		log.debug("Deleting an existing user from the mongo database; Entered user_id is= " + id);
		try {
			BasicDBObject item = (BasicDBObject) getDBObject(id);

			DBCollection coll = MongoFactory.getCollection(db_name, db_collection);
			coll.remove(item);
			output = true;			
		} catch (Exception e) {
			output = false;
			log.error("An error occurred while deleting an existing user from the mongo database", e);			
		}	
		return output;
	}

	private DBObject getDBObject(String id) {
		DBCollection coll = MongoFactory.getCollection(db_name, db_collection);
		DBObject where_query = new BasicDBObject();

		where_query.put("id", id);
		return coll.findOne(where_query);
	}


	public UserDb findUserName(String UserName) {
		UserDb u = new UserDb();
		DBCollection coll = MongoFactory.getCollection(db_name, db_collection);

		DBObject where_query = new BasicDBObject();
		where_query.put("username", UserName);

		DBObject dbo = coll.findOne(where_query);		
		u.setId(dbo.get("id").toString());
		u.setUsername(dbo.get("username").toString());
		u.setPassword(dbo.get("password").toString());
		u.setRoles(dbo.get("role").toString());

		return u;
	}
}