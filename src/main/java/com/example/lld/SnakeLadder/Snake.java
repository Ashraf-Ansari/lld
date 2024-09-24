package com.example.lld.SnakeLadder;

public class Snake {
    private int start;
    private int end;
    
    Snake(int start,int end){
        if(start<=end){
            System.out.println("Invalid Snake");
            throw new RuntimeException("Invalid Snake");
        }
        this.start=start;
        this.end=end;
    }
    
    public int getStart() {
        return start;
    }
    
    public void setStart(int start) {
        this.start = start;
    }
    
    public int getEnd() {
        return end;
    }
    
    public void setEnd(int end) {
        this.end = end;
    }
}
