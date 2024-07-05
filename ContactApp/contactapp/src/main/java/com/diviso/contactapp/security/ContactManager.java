package com.diviso.contactapp.security;

import com.diviso.contactapp.entity.Contact;

import java.util.List;

public interface ContactManager {
    void saveContact(Contact contact);

    List<Contact> getAllContacts();

    void updateContact(Contact contact);

    void deleteContact(Long id);
}
