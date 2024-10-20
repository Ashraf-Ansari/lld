package com.example.lld.mediator.AirTrafficController;

public interface Airplane {
    void requestTakeoff(AtcMediator mediator);
    void requestLanding(AtcMediator mediator);
    void receiveNotification(String message);
}
