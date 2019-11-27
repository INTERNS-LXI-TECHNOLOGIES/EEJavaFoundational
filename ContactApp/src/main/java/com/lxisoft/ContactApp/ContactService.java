package com.lxisoft.ContactApp;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

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
	public Contact updateContact(String id,Contact contact) {
        // getting contact
        repo.findById(id);
        contact.setName(contact.getName());
        contact.setContactNumber(contact.getContactNumber());
		return repo.save(contact);
	}
	//public void deleteContact(String name) {
		public void deleteContact(@PathVariable String id){
	        repo.deleteById(id);
	}
}