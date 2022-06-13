package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class viewController {
	
	@GetMapping("/status")
	public String prueba() {
		return "ok";
	}

	public viewController() {
		// TODO Auto-generated constructor stub
	}

}
