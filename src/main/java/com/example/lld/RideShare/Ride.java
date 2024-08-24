package com.example.lld.RideShare;

import java.util.ArrayList;
import java.util.List;

public class Ride {
    
    public static List<Ride> allRides = new ArrayList<>();
    static int rideIdCounter = 1;
    
    private int rideId;
    
    public int getSource() {
        return source;
    }
    
    public int getDestination() {
        return destination;
    }
    
    
    public int getNoOfSeats() {
        return noOfSeats;
    }
    
    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
    
    private int source;
    private int destination;
    private int noOfSeats;
    
    public String getStatus() {
        return status;
    }
    
    private String status;
    private int price;
    
    
    Ride(int source, int destination, int noOfSeats, int price) {
        this.rideId = rideIdCounter++;
        this.source = source;
        this.destination = destination;
        this.noOfSeats = noOfSeats;
        this.status = RideStatus.CREATED.name();
        this.price = price;
    }
    
    public int getRideId() {
        return rideId;
    }
    
    public void updateRide(int source, int destination, int noOfSeats, int price) {
        this.source = source;
        this.destination = destination;
        this.noOfSeats = noOfSeats;
        this.price = price;
    }
    
    public void cancelRide() {
        this.status = RideStatus.CANCELLED.name();
    }
    
    public void completeRide() {
        this.status = RideStatus.COMPLETED.name();
    }
    
    public int getPrice() {
        return price;
    }
}
