package com.diviso.contactappv2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping
    public List<Contact> getAllContacts() {
        return contactService.getAllContacts();
    }

    @GetMapping("/{name}")
    public Optional<Contact> getContactByName(@PathVariable String name) {
        return contactService.getContactByName(name);
    }

    @PostMapping
    public Contact createContact(@RequestBody Contact contact) {
        return contactService.createContact(contact);
    }

    @PutMapping("/{name}")
    public Contact updateContact(@PathVariable String name, @RequestBody Contact contact) {
        return contactService.updateContact(name, contact);
    }

    @DeleteMapping("/{name}")
    public void deleteContact(@PathVariable String name) {
        contactService.deleteContact(name);
    }
}
