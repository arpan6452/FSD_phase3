package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.User;
import com.app.service.UserService;

import io.swagger.annotations.Api;

@RestController
//@RequestMapping(value="/api")
@Api(value="User Controller", description="This is a User Controller API, you can get, update and delete user.")
public class UserController {

	@Autowired
	UserService userService;

//	@PostMapping("/user")
//	public User createUser(@RequestBody User user) {
//		return userService.createUser(user);
//	}

	@PutMapping("/user/{id}")
	public User updateUser(@PathVariable int id, @RequestBody User user) {
		return userService.updateUser(id, user);
	}

	@GetMapping("/user/{id}")
	public User searchUserById(@PathVariable int id) {
		return userService.searchUserById(id);
	}

	@GetMapping("/users")
	//@PreAuthorize("hasRole('ADMIN')")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}

	@DeleteMapping("/user/{id}")
	//@PreAuthorize("hasRole('ADMIN')")
	public void deleteUser(@PathVariable int id) {
		userService.deleteUser(id);
	}

}
