package com.diviso.contactapp.bll;

import com.diviso.contactapp.security.ContactManager;
import com.diviso.contactapp.entity.Contact;
import com.diviso.contactapp.repo.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactManagerImpl implements ContactManager {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public void saveContact(Contact contact) {
        contactRepository.save(contact);
    }

    @Override
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    @Override
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public void updateContact(Contact contact) {
        contactRepository.save(contact);
    }

    @Override
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }
}
