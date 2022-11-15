package com.springmvc.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ChefController {

    @GetMapping("/chefs")
    public String getChefsPage() {
        return "chefs";
    }
}
