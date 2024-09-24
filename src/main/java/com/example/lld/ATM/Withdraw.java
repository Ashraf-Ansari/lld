package com.example.lld.ATM;

public class Withdraw implements Transactions{
    
    private int amount;
    
    public Withdraw(int amount){
        this.amount = amount;
    }
    
    public int getAmount() {
        return amount;
    }
    
    @Override
    public void execute(Account account) {
        account.withdraw(amount);
    }
}
