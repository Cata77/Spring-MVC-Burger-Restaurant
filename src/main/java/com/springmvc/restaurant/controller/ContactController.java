package com.springmvc.restaurant.controller;

import com.springmvc.restaurant.model.Contact;
import com.springmvc.restaurant.repository.ContactRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {
    private ContactRepository repository;

    public ContactController(ContactRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/contact")
    public String getContactPage(Model model) {
        model.addAttribute("contacts", new Contact());
        return "contact";
    }

    @PostMapping("/contact")
    public String postContactForm(@ModelAttribute("contacts") Contact contact) {
        repository.save(contact);
        System.out.println(contact);
        return "contact";
    }
}
