package com.vijay.ContactService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.ContactService.entity.Contact;
import com.vijay.ContactService.service.ContactService;

@RestController
@RequestMapping("/contacts")
public class ContactController {
	
	@Autowired
	private ContactService contactService; 
	
	@GetMapping("/users/{userId}")
	public List<Contact> getContacts(@PathVariable Long userId){
		return contactService.getContactsofUser(userId);
	}

}
