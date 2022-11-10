package com.springmvc.restaurant.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Service
@Table(name = "bookings")
public class BookingAppointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String phoneNumber;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;
    private String time;
    @OneToOne(cascade = CascadeType.ALL)
    private Order order;

    public BookingAppointment() {
    }

    public BookingAppointment(Integer id, String name, String email, String phoneNumber, Date date, String time, Order order) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.time = time;
        this.order = order;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingAppointment that = (BookingAppointment) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(email, that.email) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(date, that.date) && Objects.equals(time, that.time) && Objects.equals(order, that.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, phoneNumber, date, time, order);
    }

    @Override
    public String toString() {
        return "BookingAppointment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", date=" + date +
                ", time='" + time + '\'' +
                ", order=" + order +
                '}';
    }
}
