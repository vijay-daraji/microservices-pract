package com.vijay.UserService.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vijay.UserService.entity.User;
import com.vijay.UserService.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	//fake userlist
	
	List<User> list = List.of(
			new User(101L,"vijay","1234567890"),
			new User(102L,"dhaval","1234567890"),
			new User(103L,"pankaj","1234567890"),
			new User(104L,"dhiraj","1234567890")
	);

	@Override
	public User getUser(Long id) {
		return this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
