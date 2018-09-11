package com.sachin.springboot.starter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/list")
public class MvcController {

	@GetMapping("/customers") 
	public String getCustomers() {
		return "hello";
	}
}
