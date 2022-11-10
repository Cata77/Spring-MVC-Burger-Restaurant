package com.springmvc.restaurant.controller;

import com.springmvc.restaurant.model.BookingAppointment;
import com.springmvc.restaurant.model.Contact;
import com.springmvc.restaurant.repository.BookingRepository;
import com.springmvc.restaurant.repository.ContactRepository;
import com.springmvc.restaurant.service.BookingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RestaurantController {
    private BookingService service;
    private BookingRepository bookingRepository;
    private ContactRepository contactRepository;

    public RestaurantController(BookingService service, BookingRepository bookingRepository, ContactRepository contactRepository) {
        this.service = service;
        this.bookingRepository = bookingRepository;
        this.contactRepository = contactRepository;
    }

    @GetMapping("/home")
    public String getHomePage() {
        return "index";
    }

    @GetMapping("/feature")
    public String getFeaturePage() {
        return "feature";
    }

    @GetMapping("/chefs")
    public String getChefsPage() {
        return "chefs";
    }

    @GetMapping("/menu")
    public String getMenuPage() {
        return "menu";
    }

    @GetMapping("/booking")
    public String getBookingPage(Model model) {
        model.addAttribute("bookings", new BookingAppointment());
        model.addAttribute("burgers", service.getBurgerList());
        model.addAttribute("snacks", service.getSnackList());
        model.addAttribute("drinks", service.getDrinkList());
        return "booking";
    }
    @PostMapping("/booking")
    public String postBookingForm(@ModelAttribute("bookings") BookingAppointment booking) {
        bookingRepository.save(booking);
        System.out.println(booking);
        return "booking";
    }

    @GetMapping("/contact")
    public String getContactPage(Model model) {
        model.addAttribute("contacts", new Contact());
        return "contact";
    }

    @PostMapping("/contact")
    public String postContactForm(@ModelAttribute("contacts") Contact contact) {
        contactRepository.save(contact);
        System.out.println(contact);
        return "contact";
    }

}
