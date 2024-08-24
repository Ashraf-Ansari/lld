package com.example.lld.MeetingSchduler;

public class Meeting {
    Room room;
    int startTime;
    int endTime;
    
    public Meeting(Room room, int startTime, int endTime) {
        this.room = room;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
