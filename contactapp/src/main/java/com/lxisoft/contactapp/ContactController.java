package com.lxisoft.contactapp;
import java.util.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ContactController {
	@RequestMapping("/")
	public List<Contact> getContacts()
	{
		List<Contact> contactList=new ArrayList<Contact>();
		Contact contact=new Contact();
		contact.setId(1);
		contact.setName("Aman");
		contact.setPhoneNumber("9539509829");
		contactList.add(contact);
		return contactList;
	}
	

}
