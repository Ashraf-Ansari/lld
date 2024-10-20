package com.example.lld.Command;

public class TurnOn implements CommandInterface{

    ReceiverDeviceInterface receiverDeviceInterface;

    TurnOn(ReceiverDeviceInterface obj){
        this.receiverDeviceInterface=obj;
    }

    @Override
    public void execute() {
        receiverDeviceInterface.turnOn();
    }
}
