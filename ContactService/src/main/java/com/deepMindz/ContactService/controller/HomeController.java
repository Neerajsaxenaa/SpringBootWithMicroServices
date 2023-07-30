package com.deepMindz.ContactService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deepMindz.ContactService.enity.Contact;
import com.deepMindz.ContactService.service.ContactService;

@RestController
@RequestMapping("/contact")
public class HomeController {
	
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/user/{userid}")
	public List<Contact> getConatcts(@PathVariable Long userid){
		return contactService.getContactsOfUser(userid);
		
	}
}
