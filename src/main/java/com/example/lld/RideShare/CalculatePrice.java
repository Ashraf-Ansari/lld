package com.example.lld.RideShare;

public class CalculatePrice {
    
    private static final int amountChargedPerKM = 20;
    private static final int discount = 10;
    
    
    static int calculatePrice(int source, int destination, int noOfSeats,boolean isPinkRide) {
        int distance = destination- source;
        if(isPinkRide) {
            return distance * noOfSeats *discount;
        }
        return Math.abs(destination - source) *noOfSeats*amountChargedPerKM;
    }
}
