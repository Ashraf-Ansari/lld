package com.example.lld.Elevator;

public class Floor {
    Integer floorNumber;
    Button upButton;
    Button downButton;
    
    public Floor(Integer floorNumber) {
        this.floorNumber = floorNumber;
        upButton = new Button(Direction.UP,floorNumber);
        downButton = new Button(Direction.DOWN,floorNumber);
    }
    
    public Integer getFloorNumber() {
        return floorNumber;
    }
    
    public void setFloorNumber(Integer floorNumber) {
        this.floorNumber = floorNumber;
    }
    
    public Button getUpButton() {
        return upButton;
    }
    
    public void setUpButton(Button upButton) {
        this.upButton = upButton;
    }
    
    public Button getDownButton() {
        return downButton;
    }
    
    public void setDownButton(Button downButton) {
        this.downButton = downButton;
    }
}
