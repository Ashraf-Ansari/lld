package com.example.lld.MovieBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class User {
    Long id;
    String name;
    String email;
    List<Booking> bookings;
    
    public User(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.bookings = new ArrayList<>();
    }
    public void addBooking(Booking booking){
        bookings.add(booking);
    }
    
    public List<Booking> getBookings() {
        return bookings;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
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
}
