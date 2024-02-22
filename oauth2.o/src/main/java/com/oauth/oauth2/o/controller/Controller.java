package com.oauth.oauth2.o.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/auth")
	public String getRequest() {
		return "welcome";
	}

}
