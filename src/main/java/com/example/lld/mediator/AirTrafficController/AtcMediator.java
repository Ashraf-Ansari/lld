package com.example.lld.mediator.AirTrafficController;

public interface AtcMediator {
    void requestTakeOffAccept(Airplane airplane);
    void requestLadingAccept(Airplane airplane);
    void notifyAirplane(Airplane airplane);
}
