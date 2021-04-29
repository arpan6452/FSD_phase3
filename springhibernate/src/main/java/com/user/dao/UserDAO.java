package com.user.dao;

import java.util.List;

import com.user.model.User;

public interface UserDAO {
	public User createUser(User user);
	public User updateUser(User user);
	public User getUserById(int userID);
	public List<User> getUserByEmail(String emailId);
	public void deleteUser(int userID);
	public List<User> getAllUsers();
}
