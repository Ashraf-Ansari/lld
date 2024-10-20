package com.example.lld.Command;

public class TurnOff implements CommandInterface{

    ReceiverDeviceInterface receiverDeviceInterface;

    TurnOff(ReceiverDeviceInterface receiverDeviceInterface){
        this.receiverDeviceInterface=receiverDeviceInterface;
    }

    @Override
    public void execute() {
        receiverDeviceInterface.turnOff();
    }
}
