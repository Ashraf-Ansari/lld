package com.example.lld.mediator.AirTrafficController;

public class CommercialPlane implements Airplane{

    String flightNumber;
    AtcMediator atcMediator;

    CommercialPlane(AtcMediator mediator,String flightNumber){
        this.atcMediator=mediator;
        this.flightNumber=flightNumber;
    }

    @Override
    public void requestTakeoff(AtcMediator mediator) {
        mediator.requestTakeOffAccept(this);
    }

    @Override
    public void requestLanding(AtcMediator mediator) {
        mediator.requestLadingAccept(this);
    }

    @Override
    public void receiveNotification(String message) {
        System.out.println(flightNumber+" :-> "+message);
    }
}
