package com.user.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userID;
	private String username;
	private String phoneNo;
	@Column(unique=true)
	private String emailId;
	private String address;
	
	public User() {

	}

	public User(int userID, String username, String phoneNo, String emailId, String address) {
		super();
		this.userID = userID;
		this.username = username;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.address = address;
	}

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

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", username=" + username + ", phoneNo=" + phoneNo + ", emailId=" + emailId
				+ ", address=" + address + "]";
	}

	
}
