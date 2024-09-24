package com.example.lld.MovieBookingSystem;

import java.util.ArrayList;
import java.util.List;

public class Theater {
    Long id;
    String name;
    String location;
    List<Screen> screens ;
    
    public Theater(Long id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.screens = new ArrayList<>();
    }
    
    public void addScreen(Screen screen){
        screens.add(screen);
    }
    
    public List<Screen> getScreens() {
        return screens;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getLocation() {
        return location;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
}
