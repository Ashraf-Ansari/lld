package com.example.lld.MovieBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class Screen {
    Long id;
    int capacity;
    List<Show> shows;
    Theater theater;
    
    public Screen(Long id, int capacity,Theater theater) {
        this.id = id;
        this.capacity = capacity;
        this.theater=theater;
        this.shows=new ArrayList<>();
    }
    public void addShow(Show show){
        shows.add(show);
        show.getMovie().addShow(show);
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    public List<Show> getShows() {
        return shows;
    }
}
