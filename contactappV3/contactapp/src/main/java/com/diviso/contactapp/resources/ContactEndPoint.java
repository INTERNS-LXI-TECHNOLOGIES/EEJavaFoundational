package com.diviso.contactapp.resources;

import com.diviso.contactapp.security.ContactManager;
import com.diviso.contactapp.entity.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ContactEndPoint {

    @Autowired
    private ContactManager contactManager;

    @GetMapping("/add-contact")
    public String showAddContactForm(Model model) {
        model.addAttribute("contact", new Contact());
        return "add-contact";
    }

    @PostMapping("/add-contact")
    public String addContact(Contact contact) {
        contactManager.saveContact(contact);
        return "redirect:/view-contacts";
    }

    @GetMapping("/view-contacts")
    public String viewContacts(Model model) {
        List<Contact> contacts = contactManager.getAllContacts();
        model.addAttribute("contacts", contacts);
        return "view-contacts";
    }

    @GetMapping("/update-contact")
    public String showUpdateContactForm(@RequestParam("id") Long id, Model model) {
        Contact contact = contactManager.getAllContacts().stream()
                .filter(c -> c.getId().equals(id))
                .findFirst()
                .orElse(null);
        model.addAttribute("contact", contact);
        return "update-contact";
    }

    @PostMapping("/update-contact")
    public String updateContact(Contact contact) {
        contactManager.updateContact(contact);
        return "redirect:/view-contacts";
    }

    @GetMapping("/delete-contact")
    @PreAuthorize("hasRole('ADMIN')")
    public String deleteContact(@RequestParam("id") Long id) {
        contactManager.deleteContact(id);
        return "redirect:/view-contacts";
    }
}
