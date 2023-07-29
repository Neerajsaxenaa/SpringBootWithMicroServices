package com.deepMindz.UserService.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
	
	private Long userId;
	private String name;
	private String phone;
	
	List<Contact> contacts = new ArrayList<>();

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Long userId, String name, String phone, List<Contact> contacts) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
		this.contacts = contacts;
	}
	
	public User(Long userId, String name, String phone) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
		
	}


	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	

//	@Override
//	public String toString() {
//		return "User [userId=" + userId + ", name=" + name + ", phone=" + phone + ", contacts=" + contacts + "]";
//	}

	

	public void setContacts(String contact) {
		// TODO Auto-generated method stub
		this.contacts = contacts;
	}
	
	
	
	

}
