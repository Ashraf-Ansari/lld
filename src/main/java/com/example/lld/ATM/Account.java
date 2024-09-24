package com.example.lld.ATM;

public class Account {
    
    String name;
    String accountNumber;
    String ifsc;
    
    Bank bank;
    
    private int balance = 1000;
    
    public Account(String name,String accountNumber,String ifsc,Bank bank){
        this.name = name;
        this.accountNumber=accountNumber;
        this.ifsc = ifsc;
        this.bank=bank;
    }
    
    void withdraw(int amount){
        balance -= amount;
    }
    void deposit(int amount){
        balance += amount;
    }
    
    public int getBalance(){
        return balance;
    }
}
