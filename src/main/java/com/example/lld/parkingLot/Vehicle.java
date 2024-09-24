package com.example.lld.parkingLot;

public class Vehicle {
    VehicleType type;
    String vehicleNumber;
    Vehicle(VehicleType type,String vehicleNumber){
        this.type=type;
        this.vehicleNumber=vehicleNumber;
    }
    
    public VehicleType getType() {
        return type;
    }
    
    public void setType(VehicleType type) {
        this.type = type;
    }
    
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
}
