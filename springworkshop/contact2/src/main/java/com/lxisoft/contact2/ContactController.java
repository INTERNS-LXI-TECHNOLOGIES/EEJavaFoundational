package com.lxisoft.contact2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @GetMapping("/")
    public String home() {
        System.out.println("Home page");
        return "home";
    }

    @GetMapping("/firstPage")
    public String firstPage() {
        System.out.println("First page");
        return "firstPage";
    }

    @GetMapping("/contacts")
    public String getAllContacts(Model model) {
        List<Contact> contacts = contactRepository.findAll();
        model.addAttribute("contacts", contacts);
        return "contacts";
    }

    @GetMapping("/contacts/new")
    public String showCreateForm(Model model) {
        model.addAttribute("contact", new Contact());
        return "createContact";
    }

    @PostMapping("/contacts")
    public String createContact(@ModelAttribute Contact contact) {
        contactRepository.save(contact);
        return "redirect:/contacts";
    }

    @GetMapping("/contacts/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Contact contact = contactRepository.findById(id).orElseThrow();
        model.addAttribute("contact", contact);
        return "updateContact";
    }

    @PostMapping("/contacts/update/{id}")
    public String updateContact(@PathVariable("id") long id, @ModelAttribute Contact contact) {
        contact.setId(id);
        contactRepository.save(contact);
        return "redirect:/contacts";
    }

    @GetMapping("/contacts/delete/{id}")
    public String deleteContact(@PathVariable("id") long id) {
        Contact contact = contactRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid contact Id:" + id));
        contactRepository.delete(contact);
        return "redirect:/contacts";
    }
}
