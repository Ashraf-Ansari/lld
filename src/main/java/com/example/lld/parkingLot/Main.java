package com.example.lld.parkingLot;

public class Main {
    
    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot(1,1,1,4);
        Vehicle vehicle1 = new Vehicle(VehicleType.ELECTRIC_CAR,"EL101");
        Vehicle bike1 = new Vehicle(VehicleType.ELECTRIC_CAR,"BK101");
        Vehicle bike2 = new Vehicle(VehicleType.ELECTRIC_CAR,"BK102");
        ParkingTicket park = parkingLot.park(vehicle1);
        ParkingTicket bike11 = parkingLot.park(bike1);
        ParkingTicket bike21 = parkingLot.park(bike2);
        System.out.println(park.parkingSpot.parkingSpotType);
        System.out.println(bike11.parkingSpot.parkingSpotType);
        System.out.println(bike21.parkingSpot.parkingSpotType);
    }
}
