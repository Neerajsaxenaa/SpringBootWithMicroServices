package com.deepMindz.UserService.controller;

import java.awt.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.deepMindz.UserService.entity.Contact;
import com.deepMindz.UserService.entity.User;
import com.deepMindz.UserService.service.UserService;

@RestController
@RequestMapping("/user")
public class HomeController {
        @Autowired
	private UserService userService;
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/test/test")
	public String checkTest() {
		return "this is test api..!!";
	}
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId) {
		User user = this.userService.getUser(userId);
		List contact  =restTemplate.getForObject("http://contactService/contact/user/"+user.getUserId(), List.class);
		user.setContacts(contact);
		return user;
	
	}

}
