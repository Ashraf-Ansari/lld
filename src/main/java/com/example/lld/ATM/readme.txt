1. bank can be interface then we can create an abstract class for common properties of class
and then All bank will create their implementation



ATM flow

Account(accountNumber,bank,balance) class

ATM will consist of a bank - create bank , create account in it , create ATM card then only user will perform transactions

ATM will perform authentication(card,password) and processTxn(Transaction) all kind of transaction

Create Transactions interface with execute(Account account) - implemented by withdraw,deposit,balance Inquery

flow
we have ATM , user has card and pin

user ATM will ask for authenticate and then user choice (Deposit,Withdraw,Balace Inquery can start any transaction ,
will call processTxn with Transaction Object.
