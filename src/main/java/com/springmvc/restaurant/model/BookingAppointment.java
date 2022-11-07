package com.springmvc.restaurant.model;

import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

@Entity
@Service
@Table(name = "Bookings")
public class BookingAppointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String phoneNumber;
    private LocalDate date;
    private LocalTime time;
    private int guestsNumber;

    public BookingAppointment() {
    }

    public BookingAppointment(Integer id, String name, String email, String phoneNumber, LocalDate date, LocalTime time, int guestsNumber) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.time = time;
        this.guestsNumber = guestsNumber;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public int getGuestsNumber() {
        return guestsNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookingAppointment that = (BookingAppointment) o;
        return guestsNumber == that.guestsNumber && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(email, that.email) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(date, that.date) && Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, phoneNumber, date, time, guestsNumber);
    }

    @Override
    public String toString() {
        return "BookingAppointment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", guestsNumber=" + guestsNumber +
                '}';
    }
}
