package com.example.lld.MovieBookingSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Booking {
    String id;
    Date bookingDate;
    User user;
    Show show;
    List<Seat> bookedSeats;
    
    public Booking(String id, Date bookingDate, User user, Show show) {
        this.id = id;
        this.bookingDate = bookingDate;
        this.user = user;
        this.show = show;
    }
    
    public List<Seat> getBookedSeats() {
        return bookedSeats;
    }
    
    public void setBookedSeats(List<Seat> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public Date getBookingDate() {
        return bookingDate;
    }
    
    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }
    
    public User getUser() {
        return user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    
    public Show getShow() {
        return show;
    }
    
    public void setShow(Show show) {
        this.show = show;
    }
}
