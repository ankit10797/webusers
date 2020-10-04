package com.example.webusers.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

	@GetMapping("index")
	public String getWelcome() {
		
		return "user-index";
	}
}
