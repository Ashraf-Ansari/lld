package com.example.lld.MeetingSchduler;

public class MeetingScdulerMain {
    
    public static void main(String[] args) {
        Schduler schduler = new Schduler();
        schduler.createRoom("room1");
        schduler.createRoom("room2");
        System.out.println(schduler.bookMeeting(2,4));
        System.out.println(schduler.bookMeeting(2,4));
        System.out.println(schduler.bookMeeting(2,4));
    }
    
}
