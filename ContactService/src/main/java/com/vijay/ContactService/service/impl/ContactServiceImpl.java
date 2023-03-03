package com.vijay.ContactService.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.vijay.ContactService.entity.Contact;
import com.vijay.ContactService.service.ContactService;

@Service
public class ContactServiceImpl implements ContactService {
	
	//fake list of contacts
	List<Contact> list = List.of(
			new Contact(1L,"amit@gmail.com","amit",101L),
			new Contact(2L,"anil@gmail.com","anil",101L),
			new Contact(3L,"rohan@gmail.com","rohan",102L),
			new Contact(4L,"samir@gmail.com","samir",103L),
			new Contact(5L,"mohit@gmail.com","mohit",104L)
			);

	@Override
	public List<Contact> getContactsofUser(Long userId) {
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}

}
