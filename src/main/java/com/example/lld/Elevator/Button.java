package com.example.lld.Elevator;

public class Button {
    
    Direction direction;
    Integer floorNumber;
    boolean pressed;
    
    public Button(Direction direction, Integer floorNumber) {
        this.direction = direction;
        this.floorNumber = floorNumber;
        this.pressed=false;
    }
    
    public void press(){
        pressed=true;
        System.out.println("Button pressed at floor: " + floorNumber + " for direction: " + direction);
        // Send request to dispatcher
        ElevatorSystem.getInstance().getDispatcher().dispatchRequest(floorNumber);
    }
    public void reset(){
        pressed=false;
    }
}
