package com.example.lld.mediator.AirTrafficController;

public class AirTrafficController implements AtcMediator{

    @Override
    public void requestTakeOffAccept(Airplane airplane) {
        airplane.receiveNotification("Accepted takeoff");
    }

    @Override
    public void requestLadingAccept(Airplane airplane) {
        airplane.receiveNotification("Accepted landing");
    }

    @Override
    public void notifyAirplane(Airplane airplane) {
        airplane.receiveNotification("wait for notification");
    }


}
