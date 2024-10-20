package com.example.lld.paymentGateway;

public class InstrumentDTO {
    int InstrumentId;
    String ifsc;
    String cvv;
    String bankAccountNumber;
    String cardNumber;
    InstrumetType instrumetType;
    int userId;

    public int getInstrumentId() {
        return InstrumentId;
    }

    public void setInstrumentId(int instrumentId) {
        InstrumentId = instrumentId;
    }

    public String getIfsc() {
        return ifsc;
    }

    public void setIfsc(String ifsc) {
        this.ifsc = ifsc;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public InstrumetType getInstrumetType() {
        return instrumetType;
    }

    public void setInstrumetType(InstrumetType instrumetType) {
        this.instrumetType = instrumetType;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
