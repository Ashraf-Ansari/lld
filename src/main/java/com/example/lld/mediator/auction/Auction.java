package com.example.lld.mediator.auction;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator{

    List<Colleague> colleagues;

    Auction(){
        colleagues = new ArrayList<>();
    }

    @Override
    public void placeBid(int bidAmount) {
        for(Colleague colleague:colleagues){
            colleague.receiveNotification(colleague.getName()+" :-> Curreent about of bid is "+bidAmount);
        }
    }

    @Override
    public void receiveNotificationForBid(int bidAmount) {
        System.out.println("received notification now i will notify bidders "+bidAmount);
        placeBid(bidAmount);
    }

    @Override
    public void addMediator(Colleague colleague) {
        colleagues.add(colleague);
    }
}
