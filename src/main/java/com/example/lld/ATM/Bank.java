package com.example.lld.ATM;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    
    List<Account> accounts = new ArrayList<>();
    
    String name;
    String branch;
    
    Bank(String name,String branch){
        this.name=name;
        this.branch=branch;
    }
    
    void addBankAccount(Account account){
        accounts.add(account);
    }
    
    
}
