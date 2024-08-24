package com.example.lld.RideShare;

import java.util.ArrayList;
import java.util.List;

public class Rider {
    
    private List<Ride> rideList = new ArrayList<>();
    String name;
    int noOfRides;
    
    Rider(String name) {
        this.name = name;
    }
    
    int checkPrice(int source, int destination, int noOfSeats) {
        return CalculatePrice.calculatePrice(source, destination, noOfSeats, noOfRides>10);
    }
    
    public int createRide(int source, int destination, int noOfSeats) {
        int price = checkPrice(source, destination, noOfSeats);
        Ride ride = new Ride( source, destination, noOfSeats, price);
        rideList.add(ride);
        Ride.allRides.add(ride);
        return ride.getRideId();
    }
    
    public void updateRideStatus(int rideId, int source, int destination, int noOfSeats) {
        for(Ride ride : rideList) {
            if(ride.getRideId() == rideId) {
                int price = checkPrice(source, destination, noOfSeats);
                ride.updateRide(source, destination, noOfSeats,price);
            }
        }
    }
    
    public void cancleRide(int rideId) {
        for(Ride ride : rideList) {
            if(ride.getRideId() == rideId) {
                ride.cancelRide();
            }
        }
    }
    
    public int completeRide(int rideId) throws Exception {
        for(Ride ride : rideList) {
            if(ride.getRideId() == rideId) {
                if(ride.getStatus().equalsIgnoreCase(RideStatus.COMPLETED.name()))
                    throw new Exception("ride is already completed");
                ride.completeRide();
                noOfRides += 1;
                return ride.getPrice();
            }
        }
        throw new Exception("ride not found");
    }
    
}
