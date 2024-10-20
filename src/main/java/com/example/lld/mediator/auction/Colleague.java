package com.example.lld.mediator.auction;

public interface Colleague {
    void placeBid(int bidAmount);
    void receiveNotification(String message);
    String getName();
}
