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
	
//	@Autowired
	 UserService userService= new UserService();
	 
//	 @Autowired
//	 private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	 
	 
//	 RestTemplate restTemplate = new RestTemplate();
	
	
	@GetMapping("/test/test")
	public String checkTest() {
		return "this is test api..!!";
	}
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") Long userId) {
		User user = userService.getUser(userId);
//		System.out.println("user :"+user);
		
//		 restTemplate.getForObject("http://contactService/contact/user/"+user.getUserId(), List.class);
//		List contact = restTemplate.getForObject("http://contactService/contact/user/"+user.getUserId(), List.class);
//		java.util.List<Contact> contact = (java.util.List<Contact>) restTemplate.getForObject("http://contactService/contact/user/"+user.getUserId(), List.class);
		
//		List contact = restTemplate.getForObject("http://contactService/contact/user/"+user.getUserId(), List.class);
		
		String contact  =restTemplate.getForObject("http://contactService/contact/user/"+user.getUserId(), String.class);
//		String contact = restTemplate.getForObject("http://localhost:9002/contact/user/"+userId, Contact.class);
//		System.out.println("contact :"+contact);
//		http://localhost:9002/contact/user/2912
		user.setContacts(contact);
		return user;
//		return contact;
		
		
	}

}
