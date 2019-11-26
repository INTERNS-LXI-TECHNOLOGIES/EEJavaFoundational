package com.lxisoft.ContactApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class ContactController {
@Autowired
ContactService contactService;
	/*ContactService contactService;
	public ContactController(ContactService contactService)
	{
		this.contactService=contactService;
	}*/
	

    
    @PostMapping("/contact")
    public Contact create(@RequestBody Contact contact){
        
        return contactService.createContact(contact);
    }
    @GetMapping("/contact")
    public List<Contact> read(){
        return contactService.fetchContacts();
    }
    @PutMapping("/contact/{name}")
    public Contact update(@PathVariable String name, @RequestBody Contact contact){
    	contact.setName(name);
        return contactService.updateContact(name,contact);
    }
    @DeleteMapping("/contact/{name}")
    public void delete(@PathVariable String name){
        contactService.deleteContact(name);
    }


}