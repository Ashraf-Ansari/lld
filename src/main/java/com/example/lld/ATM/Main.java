package com.example.lld.ATM;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI","Asansol Branch");
        Account account = new Account("Ashraf", "637643753", "SBIN000006693",bank);
        Card card = new Card("1234-1234-1234", "4321","123", account);
        bank.addBankAccount(account);
        ATM atm = new ATM(bank);
        
        if(atm.authnticate(card)){
            Transactions deposit = new Deposit(4000);
            atm.processTxn(deposit,card);
            
            Transactions balanceInquery = new BalanceInquery();
            atm.processTxn(balanceInquery,card);
            
            Transactions withdraw = new Withdraw(2000);
            atm.processTxn(withdraw,card);
            
            atm.processTxn(balanceInquery,card);
            
        }
        else {
            System.out.println("card is not valid");
        }
    }

}
