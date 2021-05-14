package com.app.service;

import java.util.List;

import com.app.model.User;

public interface UserService {

	public User createUser(User user);
	public User updateUser(int id, User user);
	public User searchUserById(int id);
	public List<User> getAllUsers();
	public void deleteUser(int id);
}
