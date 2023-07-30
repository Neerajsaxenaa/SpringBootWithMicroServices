package com.deepMindz.UserService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.deepMindz.UserService.entity.User;
@Service
public class UserService {
	
	
	List<User> list = List.of(
			new User(2912L,"Neeraj","9589945658"),
			new User(1911L,"Akash","6394305955"),
			new User(2919L,"Beena Bhatt","9899196424")
			
			);
			

	public User getUser(Long useId) {
		return this.list.stream().filter(user ->user.getUserId().equals(useId)).findAny().orElse(null);
	}

}
