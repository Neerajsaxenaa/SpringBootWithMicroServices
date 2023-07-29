package com.deepMindz.ContactService.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.deepMindz.ContactService.enity.Contact;

@Service
public class ContactService {
	
	List<Contact> list = List.of(
			new Contact(2L,"abc@gmail.com","abc",2912L),
			new Contact(3L,"abcd@gmail.com","def",2912L),
			new Contact(4L,"abcde@gmail.com","ghi",2912L),
			new Contact(2L,"abcdef@gmail.com","abc",2919L),
			new Contact(5L,"abcdefg@gmail.com","jkl",2919L),
			new Contact(4L,"abcdefgh@gmail.com","ghi",1911L),
			new Contact(2L,"abcdefgh@gmail.com","abc",1911L)
			);
	
	public List<Contact> getContactsOfUser(Long userid){
		return list.stream().filter(contact -> contact.getUserid().equals(userid)).collect(Collectors.toList());
	}

}
