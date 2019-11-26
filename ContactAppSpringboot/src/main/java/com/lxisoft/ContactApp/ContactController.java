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
    @PutMapping("/contact/{id}")
    public Contact update(@PathVariable String id, @RequestBody Contact contact){
        return contactService.updateContact(id,contact);
    }
   
    @DeleteMapping("/contact/{id}")
    public void delete(@PathVariable String id){
        contactService.deleteContact(id);
    }


}