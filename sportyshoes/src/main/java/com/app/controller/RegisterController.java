package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.User;
import com.app.payload.UserVO;
import com.app.service.RegisterService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
//@RequestMapping(value="/api")
@Api(value="Register Controller", description="This is a Register Controller API, you can create and update password of any user.")
public class RegisterController {
	
	@Autowired
	RegisterService registerService;
	
	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	
	@ApiOperation("You can create a new customer, whether a user or an admin depending upon the role you set.")
	@PostMapping("/register")
	public User registerUser(@RequestBody User user) {
		String encodedPassword = bCryptPasswordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		return registerService.registerUser(user);
	}
	
	@ApiOperation("You can update the password of any user, if you have looged is as an ADMIN")
	@PatchMapping("/updatePassword/{id}")
	public User registerUser(@PathVariable int id, @RequestBody User user) {
		String encodedPassword = bCryptPasswordEncoder.encode(user.getPassword());
		return registerService.updatePassword(id, encodedPassword);
	}
}
/*
 * @ApiParam(value="All the details of a new user.", required = true)
 * 
 * @ApiParam(value="The password that will be set as new password.", required =
 * true)
 */
