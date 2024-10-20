package com.example.lld.Command;

public class TV implements ReceiverDeviceInterface{

    @Override
    public void turnOn() {
        System.out.println("Tv is on now");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv is off now");
    }

    public void channelChanged() {
        System.out.println("channel changed");
    }
}
