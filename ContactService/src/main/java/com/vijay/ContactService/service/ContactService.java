package com.vijay.ContactService.service;

import java.util.List;

import com.vijay.ContactService.entity.Contact;

public interface ContactService {
	
	public List<Contact> getContactsofUser(Long userId);

}
