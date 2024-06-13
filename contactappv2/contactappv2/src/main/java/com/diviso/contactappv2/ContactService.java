package com.diviso.contactappv2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public Optional<Contact> getContactByName(String name) {
        return contactRepository.findByName(name);
    }

    @Transactional
    public Contact createContact(Contact contact) {
        return contactRepository.save(contact);
    }

    @Transactional
    public Contact updateContact(String name, Contact updatedContact) {
        Optional<Contact> existingContact = contactRepository.findByName(name);
        if (existingContact.isPresent()) {
            Contact contact = existingContact.get();
            contact.setEmail(updatedContact.getEmail());
            contact.setPhone(updatedContact.getPhone());
            return contactRepository.save(contact);
        }
        return null;
    }

    @Transactional
    public void deleteContact(String name) {
        contactRepository.deleteByName(name);
    }
}
