package com.security.jwt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JwtController {
	@GetMapping("/")
	public String name() {
		return "welcome";
		
	}
	
	@GetMapping("/user")
	public String user() {
		return "user";
		
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "admin";
		
	}


}
