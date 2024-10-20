package com.example.lld.mediator.auction;

public interface AuctionMediator {
    void placeBid(int bidAmount);
    void receiveNotificationForBid(int bidAmount);
    void addMediator(Colleague colleague);
}
