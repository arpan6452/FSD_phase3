package com.app.payload;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder(value = { "username", "role", "password", "email" }, alphabetic = true)
public class UserVO implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonProperty(value = "username", access = Access.READ_ONLY)
	private String username;
	
	@JsonProperty(value = "role", access = Access.READ_ONLY)
	private String role;
	
	@JsonProperty(value = "password", access = Access.READ_ONLY)
	private String password;
	
	@JsonProperty(value = "email", access = Access.READ_ONLY)
	private String email;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
