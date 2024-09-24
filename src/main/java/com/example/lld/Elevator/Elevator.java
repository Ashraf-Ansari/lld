package com.example.lld.Elevator;

import java.util.PriorityQueue;

public class Elevator {
    boolean doorOpen;
    PriorityQueue<Integer> priorityQueue;
    Direction direction;
    int maxFloor;
    int minFloor;
    Integer currentFloor;
    
    public Elevator(int minFloor, int maxFloor) {
        this.doorOpen = false;
        this.maxFloor = maxFloor;
        this.minFloor = minFloor;
        this.currentFloor = minFloor;
        this.direction=Direction.NONE;
        this.priorityQueue=new PriorityQueue<>();
    }
    
    public void move(){
        if(priorityQueue.isEmpty()){
            direction = Direction.NONE;
            return;
        }
        Integer requestedFloor = priorityQueue.poll();
        if(requestedFloor>currentFloor){
            direction = Direction.UP;
        }
        else {
            if(requestedFloor<currentFloor){
                direction = Direction.DOWN;
            }
            else {
                direction = Direction.NONE;
            }
        }
        
        while(!currentFloor.equals(requestedFloor)){
            if(direction==Direction.UP){
                currentFloor += 1;
            }else if(direction==Direction.DOWN){
                currentFloor -= 1;
            }
            System.out.println("Elevator moving to floor: " + currentFloor);
        }
        doorOpen();
        
    }
    
    public void doorOpen(){
        doorOpen = true;
        System.out.println("Door is open at floor"+currentFloor);
        doorClose();
    }
    
    public void doorClose(){
        System.out.println("Door is close at floor"+currentFloor);
        doorOpen = false;
    }
    
    public boolean isDoorOpen() {
        return doorOpen;
    }
    
    public void setDoorOpen(boolean doorOpen) {
        this.doorOpen = doorOpen;
    }
    
    public PriorityQueue<Integer> getPriorityQueue() {
        return priorityQueue;
    }
    
    public void setPriorityQueue(PriorityQueue<Integer> priorityQueue) {
        this.priorityQueue = priorityQueue;
    }
    
    public Direction getDirection() {
        return direction;
    }
    
    public void setDirection(Direction direction) {
        this.direction = direction;
    }
    
    public int getMaxFloor() {
        return maxFloor;
    }
    
    public void setMaxFloor(int maxFloor) {
        this.maxFloor = maxFloor;
    }
    
    public int getMinFloor() {
        return minFloor;
    }
    
    public void setMinFloor(int minFloor) {
        this.minFloor = minFloor;
    }
    
    public int getCurrentFloor() {
        return currentFloor;
    }
    
    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }
    
    public void addRequest(Integer floorNumber) {
        priorityQueue.add(floorNumber);
    }
}
