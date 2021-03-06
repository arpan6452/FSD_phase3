package com.app.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	CustomUserDetailsService userDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}
	
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		//.antMatchers("/").permitAll()
		.antMatchers("/users/**","/user/**","/updatePassword/**","/product/**").hasAuthority("ADMIN")
		.antMatchers( "/products/**").hasAuthority("USER")
		.antMatchers("/").permitAll().anyRequest().authenticated()
		//.antMatchers( HttpMethod.POST, "/register/**").permitAll().anyRequest().authenticated()
				/*
				 * .antMatchers("/user/**","/users/**").hasRole("ADMIN")
				 * .antMatchers("/**").hasAnyRole("USER","ADMIN")
				 */
		.and().formLogin().permitAll().and().csrf().disable();
	}

}
