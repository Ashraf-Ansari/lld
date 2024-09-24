package com.example.lld.Elevator;

import java.util.List;

public class Dispatcher {

    List<Elevator> elevators;
    
    public Dispatcher(List<Elevator> elevators) {
        this.elevators = elevators;
    }
    
    public void dispatchRequest(Integer floorNumber){
        Elevator bestElevator = null;
        for(Elevator elevator:elevators){
            if(elevator.getMinFloor()>=floorNumber && floorNumber<=elevator.getMaxFloor()){
                if(bestElevator==null || Math.abs(elevator.getCurrentFloor()-floorNumber)<Math.abs(bestElevator.getCurrentFloor()-floorNumber)){
                    bestElevator=elevator;
                }
            }
        }
        if(bestElevator!=null){
            bestElevator.addRequest(floorNumber);
        }
        else{
            System.out.println("No suitable Elevator Found");
        }
    }
}
