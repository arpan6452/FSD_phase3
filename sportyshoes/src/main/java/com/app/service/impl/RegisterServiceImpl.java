package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.model.User;
import com.app.repository.UserRepository;
import com.app.service.RegisterService;

@Service
@Transactional
public class RegisterServiceImpl implements RegisterService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User registerUser(User user) {
		userRepository.save(user);
		return user;
	}

	@Override
	public User updatePassword(int id, String password) {
		User updatedUser = userRepository.findById(id).get();		
		updatedUser.setPassword(password);		
		return userRepository.save(updatedUser);
	}

}
