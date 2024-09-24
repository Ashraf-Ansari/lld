package com.example.lld.ATM;

public class ATM {
    Bank bank;
    
    public ATM(Bank bank){
        this.bank=bank;
    }
    
    public boolean authnticate(Card card){
        for(Account account : bank.accounts){
            if(account==card.getAccount()){
                return true;
            }
        }
        return false;
    }
    
    void processTxn(Transactions tx,Card card){
        tx.execute(card.getAccount());
    }
}
