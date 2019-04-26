
/**
* @author Abhinav Gupta/Divya Athoopallil
*/


/*
* This Controller contains handling Spring security configuration
*/

package com.OOAD.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


import com.OOAD.login.UserDBService;
import com.OOAD.login.UserDb;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	private List<UserDb> getData() {
		List<UserDb> user_list = new ArrayList<UserDb>();
		UserDBService userDbService=new UserDBService();
		user_list= userDbService.getAll();		
		return user_list;
		
	}	

	
	@Autowired
	public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
		List<UserDb> u = getData();
		for (UserDb element : u) {			
			String role=element.getRoles().toString();
			String base="ADMIN";
			if (role.equals(base)) {
			auth.inMemoryAuthentication().withUser(element.getUsername()).password(element.getPassword()).roles("USER","ADMIN");
			}
			else {
				auth.inMemoryAuthentication().withUser(element.getUsername()).password(element.getPassword()).roles("USER");			
			}
			
		}
		
	}
	

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/", "/*reviews*/**").access("hasRole('USER')").
			antMatchers("/menu").permitAll().antMatchers("/employee").access("hasRole('ADMIN')").and()
				.formLogin().loginPage("/login").permitAll().and().exceptionHandling().accessDeniedPage("/Access_Denied");;
		
		http.csrf().disable();
	}

}
