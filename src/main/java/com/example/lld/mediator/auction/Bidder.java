package com.example.lld.mediator.auction;

public class Bidder implements Colleague{

    String name;
    AuctionMediator mediator;

    Bidder(AuctionMediator auctionMediator,String name){
        mediator=auctionMediator;
        this.name=name;
    }

    @Override
    public void placeBid(int bidAmount) {
        mediator.receiveNotificationForBid(bidAmount);
    }

    @Override
    public void receiveNotification(String message) {
        System.out.println(message);
    }

    @Override
    public String getName() {
        return name;
    }
}
