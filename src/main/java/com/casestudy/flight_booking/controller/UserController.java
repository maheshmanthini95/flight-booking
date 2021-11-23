package com.casestudy.flight_booking.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0")
public class UserController {
	
	@PostMapping("/admin/login")
	public Map<String, Object> adminLogin() {
		return null;
	}
}
