package com.example.lld.mediator.auction;

public class Main {
    public static void main(String[] args) {
        AuctionMediator auction = new Auction();
        Colleague bidder1 = new Bidder(auction,"Ashraf");
        Colleague bidder2 = new Bidder(auction,"Afzal");
        auction.addMediator(bidder1);
        auction.addMediator(bidder2);
        auction.placeBid(23);
//        bidder1.placeBid(24);

    }
}
