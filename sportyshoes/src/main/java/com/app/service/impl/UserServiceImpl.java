package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.User;
import com.app.repository.UserRepository;
import com.app.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User updateUser(int id, User user) {
		User updatedUser = userRepository.findById(id).get();
		updatedUser.setUsername(user.getUsername());
		updatedUser.setRole(user.getRole());
		updatedUser.setPassword(user.getPassword());
		updatedUser.setEmail(user.getEmail());
		return userRepository.save(updatedUser);
	}

	@Override
	public User searchUserById(int id) {
		return userRepository.findById(id).get();
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public void deleteUser(int id) {
		userRepository.deleteById(id);
	}

}
