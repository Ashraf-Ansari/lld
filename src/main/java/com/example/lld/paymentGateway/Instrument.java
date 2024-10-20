package com.example.lld.paymentGateway;

public class Instrument {
    int instrumentId;
    int userId;
    InstrumetType instrumetType;

    public int getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(int instrumentId) {
        this.instrumentId = instrumentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public InstrumetType getInstrumetType() {
        return instrumetType;
    }

    public void setInstrumetType(InstrumetType instrumetType) {
        this.instrumetType = instrumetType;
    }
}
