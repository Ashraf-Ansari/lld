package com.example.lld.SnakeLadder;

public class Ladder {
    private int start;
    private int end;
    
    Ladder(int start,int end){
        
        if(start>=end){
            System.out.println("Invalid Ladders");
            throw new RuntimeException("Invalid Ladders");
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
