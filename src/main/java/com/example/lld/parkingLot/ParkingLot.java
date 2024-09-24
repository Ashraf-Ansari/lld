package com.example.lld.parkingLot;

public class ParkingLot {
    
    int countBikeSpot;
    int countCarSpot;
    int countElectricCarSpot;
    int countLargeSpot;
    
    ParkingLot(int countBikeSpot,int countCarSpot,int countElectricCarSpot,int countLargeSpot){
        this.countBikeSpot = countBikeSpot;
        this.countCarSpot=countCarSpot;
        this.countElectricCarSpot=countElectricCarSpot;
        this.countLargeSpot=countLargeSpot;
    }
    
    public ParkingTicket park(Vehicle vehicle){
        if(!isFull(vehicle.getType())){
            System.out.println("Parking is not avaiable");
            return null;
        }
        ParkingTicket ticket = new ParkingTicket(vehicle.getVehicleNumber());
        ParkingSpot spot = new ParkingSpot();
        ticket.addParkingSpot(spot);
        incrementSpotCount(vehicle.getType(),spot);
        return ticket;
    }
    
    private void incrementSpotCount(VehicleType type,ParkingSpot spot) {
        if(type.equals(VehicleType.CAR)){
            if(countCarSpot>0) {
                spot.parkingSpotType=ParkingSpotType.CAR;
                spot.spotNumber=countCarSpot;
                countCarSpot -= 1;
            }
            else {
                spot.parkingSpotType=ParkingSpotType.LARGE;
                spot.spotNumber=countLargeSpot;
                countLargeSpot -= 1;
            }
        }
        else if(type.equals(VehicleType.ELECTRIC_CAR)){
            if(countElectricCarSpot>0) {
                spot.parkingSpotType=ParkingSpotType.ELECTRICK_CAR;
                spot.spotNumber=countElectricCarSpot;
                countElectricCarSpot -= 1;
            }
            else if(countCarSpot>0) {
                spot.parkingSpotType=ParkingSpotType.CAR;
                spot.spotNumber=countCarSpot;
                countCarSpot -= 1;
            }
            else {
                spot.parkingSpotType=ParkingSpotType.LARGE;
                spot.spotNumber=countLargeSpot;
                countLargeSpot -= 1;
            }
        }
    }
    
    private boolean isFull(VehicleType type) {
        if(type.equals(VehicleType.TRUCK)){
            if(countLargeSpot>0) {
                return true;
            }
        }else if(type.equals(VehicleType.BIKE)){
            if(countBikeSpot>0)
                return true;
        }
        else if(type.equals(VehicleType.CAR)){
            if(countCarSpot+countLargeSpot>0)
                return true;
        }else if(type.equals(VehicleType.ELECTRIC_CAR)){
            if(countCarSpot+countElectricCarSpot+countLargeSpot>0)
                return true;
        }else {
            System.out.println("vehicle don't support");
        }
        return false;
        
    }
}
