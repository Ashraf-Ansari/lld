package com.example.lld.ATM;

public class Card {
    String cardNumber;
    String password;
    String cvv;
    
    private Account account;
    
    public Card(String cardNumber,String password,String cvv,Account account){
        this.cardNumber=cardNumber;
        this.password=password;
        this.cvv=cvv;
        this.account=account;
    }
    
    public Account getAccount() {
        return account;
    }
}
