package com.example.lld.MeetingSchduler;

import java.util.ArrayList;
import java.util.List;

public class Room {
    
    private List<Meeting> meetings = new ArrayList<>();
    
    private String name;
    
    Room(String name) {
        this.name = name;
    }
    
    public List<Meeting> getMeetings() {
        return meetings;
    }
    
    public void setMeetings(List<Meeting> meetings) {
        this.meetings = meetings;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
}
