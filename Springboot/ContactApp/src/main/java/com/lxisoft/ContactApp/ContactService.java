package com.lxisoft.ContactApp;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

@Autowired
ContactRespository repo;
	public Contact createContact(Contact contact) {
		return repo.save(contact);
	}
	public List<Contact> fetchContacts(){
	 return repo.findAll();
	}
	public Contact updateContact(String name,Contact contact) {
		String nam = name;
        // getting contact
        Contact contact= repo;
        contact.setName(contact.get("name"));
		return repo.save(contact);
	}
	public void deleteContact(String name) {
		repo.deleteById(name);
	}
}