package com.example.lld.parkingLot;

public class ParkingTicket {
    String vehicleNumber;
    ParkingSpot parkingSpot;
    
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    ParkingTicket(String vehicleNumber){
        this.vehicleNumber=vehicleNumber;
    }
  
    public void addParkingSpot(ParkingSpot parkingSpot){
        this.parkingSpot=parkingSpot;
    }
}
