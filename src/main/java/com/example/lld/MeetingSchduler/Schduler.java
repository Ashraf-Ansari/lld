package com.example.lld.MeetingSchduler;

import java.util.ArrayList;
import java.util.List;

public class Schduler {
    
    List<Room> rooms = new ArrayList<>();
    
    public String bookMeeting(int startTime, int endTime){
        int duration = endTime - startTime;
        // check if room is available
        // check if time slot is available
        // book the room
       if(rooms.isEmpty())
              return "No rooms available";
        for(Room room : rooms){
            List<Meeting> meetings = room.getMeetings();
            boolean isAvailable = true;
            for(Meeting meeting : meetings){
                if((startTime >= meeting.startTime && startTime <= meeting.endTime) || (endTime >= meeting.startTime && endTime <= meeting.endTime)){
                    isAvailable = false;
                    break;
                }
            }
            if(isAvailable){
                room.getMeetings().add(new Meeting(room, startTime, endTime));
                return "Room booked "+room.getName();
            }
        
        }
        return "No rooms available";
    }
    
    
    void createRoom(String name){
        rooms.add(new Room(name));
    }
}
