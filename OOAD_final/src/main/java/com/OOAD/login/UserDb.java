package com.OOAD.login;

import java.io.Serializable;

public class UserDb implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id, username, password, roles;
	
	public UserDb() {
		super();
	}

	public UserDb(String id, String username,String password) {
		super();
		this.id = id;
		this.username = username;
		this.password=password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
}