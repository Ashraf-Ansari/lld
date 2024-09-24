package com.example.lld.MovieBookingSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Show {
    Long id;
    Date startTime;
    Movie movie;
    Screen screen;
    List<Seat> seats;
    
    public Show(Long id, Date startTime, Movie movie, Screen screen) {
        this.id = id;
        this.startTime = startTime;
        this.movie = movie;
        this.screen = screen;
        this.seats = new ArrayList<>();
        initializeSeat();
    }
    
    public void initializeSeat(){
        for(int i=1;i<screen.capacity;i++){
            seats.add(new Seat("S"+i));
        }
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public Date getStartTime() {
        return startTime;
    }
    
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
    
    public Movie getMovie() {
        return movie;
    }
    
    public void setMovie(Movie movie) {
        this.movie = movie;
    }
    
    public Screen getScreen() {
        return screen;
    }
    
    public void setScreen(Screen screen) {
        this.screen = screen;
    }
    
    public List<Seat> getSeats() {
        return seats;
    }
    
    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }
}
