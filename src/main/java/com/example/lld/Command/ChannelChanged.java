package com.example.lld.Command;

public class ChannelChanged implements CommandInterface{

    TV receiverDeviceInterface;

    ChannelChanged(TV receiverDeviceInterface){
        this.receiverDeviceInterface=receiverDeviceInterface;
    }

    @Override
    public void execute() {
        receiverDeviceInterface.channelChanged();
    }
}
