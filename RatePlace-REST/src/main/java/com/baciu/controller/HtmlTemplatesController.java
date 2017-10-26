package com.baciu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlTemplatesController {
	
	@GetMapping("account")
	public String getAccount() {
		return "account";
	}
	
	@GetMapping("addPlace")
	public String addPlace() {
		return "addPlace";
	}
	
	@GetMapping("changeAvatar")
	public String changeAvatar() {
		return "changeAvatar";
	}
	
	@GetMapping("edit")
	public String edit() {
		return "edit";
	}
	
	@GetMapping("index")
	public String index() {
		return "index";
	}
	
	@GetMapping("login")
	public String login() {
		return "login";
	}
	
	@GetMapping("place/{id}")
	public String place() {
		return "place";
	}
	
	@GetMapping("profile")
	public String profile() {
		return "profile";
	}
	
}
