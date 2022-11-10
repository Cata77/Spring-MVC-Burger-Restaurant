package com.springmvc.restaurant.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookingService {
    private List<String> burgerList;
    private List<String> drinkList;
    private List<String> snackList;

    public List<String> getBurgerList() {
        burgerList = new ArrayList<>();
        burgerList.add("Cheeseburger");
        burgerList.add("Vegetarian Burger");
        burgerList.add("Classy Burger");
        burgerList.add("Fried Chicken Burger");
        burgerList.add("Big Beef Burger");
        return burgerList;
    }

    public List<String> getSnackList() {
        snackList = new ArrayList<>();
        snackList.add("Tortilla");
        snackList.add("Quesadilla");
        snackList.add("Salsa de Mallorca");
        snackList.add("Bread besan Toast");
        snackList.add("Nachos");
        return snackList;
    }

    public List<String> getDrinkList() {
        drinkList = new ArrayList<>();
        drinkList.add("Single Cup Brew");
        drinkList.add("Caffe Americano");
        drinkList.add("Caramel Macchiato");
        drinkList.add("Cosmopolitan");
        drinkList.add("Moscow Mule");
        return drinkList;
    }
}
