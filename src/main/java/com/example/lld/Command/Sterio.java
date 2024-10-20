package com.example.lld.Command;

public class Sterio implements ReceiverDeviceInterface{

    @Override
    public void turnOn() {
        System.out.println("Streo is on now");
    }

    @Override
    public void turnOff() {
        System.out.println("Streo is off now");
    }

    public void adjustVolume() {
        System.out.println("volume adjusted");
    }
}
