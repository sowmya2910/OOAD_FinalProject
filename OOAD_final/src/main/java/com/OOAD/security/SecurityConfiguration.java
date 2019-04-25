package com.OOAD.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.util.AntPathMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("abhinav").password("dummy").roles("USER", "ADMIN");
		auth.inMemoryAuthentication().withUser("sravanth").password("dummy").roles("USER");
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/", "/*reviews*/**").access("hasRole('USER')").
			antMatchers("/menu").permitAll().antMatchers("/employee").access("hasRole('ADMIN')").and()
				.formLogin().loginPage("/login").permitAll().and().exceptionHandling().accessDeniedPage("/Access_Denied");;
		
		http.csrf().disable();
	}
}
