package com.example.lld.ATM;

public class BalanceInquery implements Transactions {
    
    @Override
    public void execute(Account account) {
        System.out.println("Your Balance is : "+account.getBalance());
    }
}
