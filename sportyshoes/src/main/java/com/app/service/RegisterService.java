package com.app.service;

import com.app.model.User;

public interface RegisterService {

	public User registerUser(User user);
	public User updatePassword(int id, String password);
}
