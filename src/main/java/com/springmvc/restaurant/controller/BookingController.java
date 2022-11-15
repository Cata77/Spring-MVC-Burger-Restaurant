package com.springmvc.restaurant.controller;

import com.springmvc.restaurant.model.BookingAppointment;
import com.springmvc.restaurant.repository.BookingRepository;
import com.springmvc.restaurant.service.BookingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class BookingController {
    private BookingService service;
    private BookingRepository repository;

    public BookingController(BookingService service, BookingRepository repository) {
        this.service = service;
        this.repository = repository;
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
    public String postBookingForm(@Valid @ModelAttribute("bookings") BookingAppointment booking, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("burgers", service.getBurgerList());
            model.addAttribute("snacks", service.getSnackList());
            model.addAttribute("drinks", service.getDrinkList());
            return "booking";
        }
        repository.save(booking);
        System.out.println(booking);
        return "booking";
    }
}
