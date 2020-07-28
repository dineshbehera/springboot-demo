package com.example.springbootdemo.controllers;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	private static final String template = "Hello, %s!";

	@RequestMapping("/")
	public String home() {
		return "Spring boot is working!"+ " Current date and time is"+new Date();
	}

}
