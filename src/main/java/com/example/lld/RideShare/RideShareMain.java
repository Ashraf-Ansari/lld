package com.example.lld.RideShare;

import java.util.List;

public class RideShareMain {
    
    public static void main(String[] args) throws Exception {
        Driver driver = new Driver("driver1");
        Rider rider = new Rider("rider1");
        Rider rider2 = new Rider("rider1");
        int ride1 = rider.createRide(1, 2, 4);
        int ride2 = rider.createRide(1, 2, 3);
        rider2.createRide(1, 2, 3);
        rider2.createRide(1, 2, 2);
        System.out.println(rider.completeRide(ride1));
        try {
            System.out.println(rider.completeRide(ride1));
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(rider.noOfRides);
        List<Ride> allRides = Ride.allRides;
        allRides.forEach(i-> System.out.println(i.getRideId()));
    }
    
}
