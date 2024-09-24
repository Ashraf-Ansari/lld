package com.example.lld.MovieBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class Movie {
    Long id;
    String title;
    String genere;
    int duration;
    List<Show> shows;
    
    
    public Movie(Long id, String title, String genere,int duration) {
        this.id = id;
        this.title = title;
        this.genere = genere;
        this.duration=duration;
        this.shows=new ArrayList<>();
    }
    
    public void addShow(Show show){
        shows.add(show);
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getGenere() {
        return genere;
    }
    
    public void setGenere(String genere) {
        this.genere = genere;
    }
}
