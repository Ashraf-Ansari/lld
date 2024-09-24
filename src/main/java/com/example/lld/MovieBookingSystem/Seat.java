package com.example.lld.MovieBookingSystem;

public class Seat {
    String id;
    boolean isFree=true;
    
    public Seat(String id) {
        this.id = id;
    }
    
    public boolean isFree() {
        return isFree;
    }
    
    public void setFree(boolean free) {
        isFree = free;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public void bookSeat() {
        this.isFree=false;
    }
}
