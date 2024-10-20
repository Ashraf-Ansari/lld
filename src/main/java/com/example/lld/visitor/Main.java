package com.example.lld.visitor;

public class Main {
    public static void main(String[] args) {
        RoomElement nonAcRoom = new NonAcRoom();
        RoomElement singleRoom = new SingleRoom();
        VisitorInterface roomCleaner = new RoomCleaner();
        VisitorInterface roomMaintainance = new RoomMaintanance();
        nonAcRoom.accept(roomCleaner);
        singleRoom.accept(roomCleaner);
        singleRoom.accept(roomMaintainance);
    }
}
