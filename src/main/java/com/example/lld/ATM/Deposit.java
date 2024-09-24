package com.example.lld.ATM;

public class Deposit implements Transactions{
    
    private int amount;
    public Deposit(int amount){
        this.amount = amount;
    }
    
    public int getAmount() {
        return amount;
    }
    
    @Override
    public void execute(Account account) {
        account.deposit(amount);
    }
}
