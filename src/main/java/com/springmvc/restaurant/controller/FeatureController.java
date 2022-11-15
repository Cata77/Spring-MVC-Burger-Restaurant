package com.springmvc.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FeatureController {

    @GetMapping("/feature")
    public String getFeaturePage() {
        return "feature";
    }
}
