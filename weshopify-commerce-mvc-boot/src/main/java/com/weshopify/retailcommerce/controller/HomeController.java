package com.weshopify.retailcommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping
	public String viewHomePage() {
		System.out.println("I'm in HomeController!!");
		return "home";	
	}
}
