package com.springmvc.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestaurantController {

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
    public String getBookingPage() {
        return "booking";
    }

    @GetMapping("/contact")
    public String getContactPage() {
        return "contact";
    }

}
