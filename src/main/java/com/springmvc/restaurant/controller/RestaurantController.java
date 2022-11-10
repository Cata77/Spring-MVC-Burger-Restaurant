package com.springmvc.restaurant.controller;

import com.springmvc.restaurant.model.BookingAppointment;
import com.springmvc.restaurant.repository.BookingRepository;
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

    public RestaurantController(BookingService service, BookingRepository bookingRepository) {
        this.service = service;
        this.bookingRepository = bookingRepository;
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
    public String getContactPage() {
        return "contact";
    }

}
