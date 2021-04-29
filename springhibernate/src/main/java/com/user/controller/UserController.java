package com.user.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.user.dao.UserDAO;
import com.user.model.User;

public class UserController {
	private ApplicationContext context = null;
	private UserDAO dao = null;

	private void initApplicationContext() {
		context = new ClassPathXmlApplicationContext("spring-hibernate-beans.xml");
	}

	public UserController() {
		if (context == null) {
			initApplicationContext();
			dao = (UserDAO) context.getBean("userDAO");
		}
	}

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-hibernate-beans.xml");
		User user = new User(); // user.setUserID(1);
		user.setUsername("Dhoni");
		user.setPhoneNo("1234567890");
		user.setEmailId("dhoni@gmail.com");
		user.setAddress("Bihar");

		UserDAO dao = (UserDAO) context.getBean("userDAO");

		System.out.println(dao.createUser(user));
		// System.out.println(dao.getAllUsers());

		// System.out.println(dao.getUserByEmail("viratk@gmail.com"));
	}

	public List<User> serachUserByEmail(String emailId) {
		List<User> user = dao.getUserByEmail(emailId);
		return user;
	}

	public User createUser(User user) {
		return dao.createUser(user);

	}

	public User updateUser(User user) {
		return dao.updateUser(user);
	}

}
