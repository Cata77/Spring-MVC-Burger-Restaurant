package com.springmvc.restaurant.model;

import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Service
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String burger;
    private String snack;
    private String drink;

    public Order() {
    }

    public Order(String burger, String snack, String drink) {
        this.burger = burger;
        this.snack = snack;
        this.drink = drink;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBurger() {
        return burger;
    }

    public void setBurger(String burger) {
        this.burger = burger;
    }

    public String getSnack() {
        return snack;
    }

    public void setSnack(String snack) {
        this.snack = snack;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) && Objects.equals(burger, order.burger) && Objects.equals(snack, order.snack) && Objects.equals(drink, order.drink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, burger, snack, drink);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", burger='" + burger + '\'' +
                ", snack='" + snack + '\'' +
                ", drink='" + drink + '\'' +
                '}';
    }
}
