package com.example.lld.mediator.AirTrafficController;

public class Main {
    public static void main(String[] args) {
        AtcMediator atcMediator = new AirTrafficController();
        Airplane commercialPlane1 = new CommercialPlane(atcMediator,"123");
        Airplane commercialPlane2 = new CommercialPlane(atcMediator,"456");
        atcMediator.notifyAirplane(commercialPlane2);
        commercialPlane1.requestLanding(atcMediator);
    }
}
