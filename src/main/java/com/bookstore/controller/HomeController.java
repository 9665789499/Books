package com.bookstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/index")
	public String index() {
		return "index";
	}

	@RequestMapping("/myAccount")
	public String myaccount() {
		return "myAccount";
	}
	
	@RequestMapping("/indexhello")
	public String myaccount1() {
		return "index";
	}

}
