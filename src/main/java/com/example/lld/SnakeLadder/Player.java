package com.example.lld.SnakeLadder;

public class Player {
    
    private final String name;
    private int position;
    
    public String getName() {
        return name;
    }
    
    
    
    Player(String name){
        this.name=name;
        this.position=0;
    }
    
    public int currentPosition() {
        return position;
    }
    
    public void setPosition(int position) {
        this.position = position;
    }
}
