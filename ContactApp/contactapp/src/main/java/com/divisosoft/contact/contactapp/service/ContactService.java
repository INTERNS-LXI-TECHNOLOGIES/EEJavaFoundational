package com.divisosoft.contact.contactapp.service;

import org.springframework.stereotype.Service;

import com.divisosoft.contact.contactapp.model.Contact;
import com.divisosoft.contact.contactapp.repository.ContactRepository;

import java.util.List;

@Service
public class ContactService {

    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    public Contact getContactById(int id) {
        return contactRepository.findById(id);
    }

    public void createContact(Contact contact) {
        contactRepository.save(contact);
    }

    public void updateContact(Contact contact) {
        contactRepository.update(contact);
    }

    public void deleteContact(int id) {
        contactRepository.deleteById(id);
    }
}
