package com.vijay.UserService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.vijay.UserService.entity.Contact;
import com.vijay.UserService.entity.User;
import com.vijay.UserService.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable Long userId) {
		User user = userService.getUser(userId);
		//http://localhost:9002/contacts/users/101
		
		List<Contact> contacts = restTemplate.getForObject("http://CONTACT-SERVICE/contacts/users/"+user.getUserId(), List.class);
		user.setContacts(contacts);
		return user;
	}
	
}
