package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
	
	@RequestMapping("/welcome")
	public String sayHelloName(@RequestParam String name, ModelMap map) {
		map.addAttribute("user", name);
		return "dashboard";
	}
}
