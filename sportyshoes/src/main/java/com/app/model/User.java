package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "username"
            }),
            @UniqueConstraint(columnNames = {
                "email"
            })
    })
@ApiModel(description="All the details about an customer")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(notes = "ID of the user.It is the primery key and auto generated.",name="user ID",required=true,value="1")
	private int userID;
	@ApiModelProperty(notes = "Name of the user.",required=true, value="Arpan Ghosh")
	private String username;
	@ApiModelProperty(notes = "Role of the user.",required=true, value="ADMIN")
	private String role;
	@ApiModelProperty(notes = "Password of the user account.",required=true, value="Password123")
	private String password;
	@ApiModelProperty(notes = "Email ID of the Shoe.",required=true, value="arpang2@gmail.com")
	private String email;

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

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

	@Override
	public String toString() {
		return "User [userID=" + userID + ", username=" + username + ", role=" + role + ", password=" + password
				+ ", email=" + email + "]";
	}

}
