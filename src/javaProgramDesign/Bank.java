package javaProgramDesign;

import java.util.HashMap;
import java.util.Set;

public class Bank {
    private HashMap<Integer,BankAccount> accounts
            = new HashMap<>();
    private  double rate = 0.01;
    private  int nextAcct = 0;

    public int newAccount(boolean isForeign){
        int accountNumber = nextAcct++;
        BankAccount ba = new BankAccount(accountNumber);
        ba.setForeign(isForeign);
        accounts.put(accountNumber, ba);
        return accountNumber;
    }

    public int getBalance(int accountNumber){
        BankAccount ba = accounts.get(accountNumber);
        return ba.getBalance();
    }

    public void deposit(int accountNumber, int amount){
        BankAccount ba = accounts.get(accountNumber);
        int balance = ba.getBalance();
//        accounts.put(accountNumber, balance +amount);
        ba.setBalance(balance + amount);
    }

    public void setForeign(int accountNumber, boolean isForeign){
        BankAccount ba = accounts.get(accountNumber);
        ba.setForeign(isForeign);
    }

    public boolean authorizeLoan(int accountNumber, int loanAmount){
        BankAccount ba = accounts.get(accountNumber);
        int balance = ba.getBalance();
        return balance >= loanAmount / 2;
    }

    public String toString(){
//        Set<Integer> accts = accounts.keySet();
        String result = "The bank has " + accounts.size() + "accounts.";
        for (BankAccount ba : accounts.values())
            result += "\n\tBank account " + ba.getAccountNumber() +
                    ": balance= " + ba.getBalance() + ", is " + (ba.isForeign()?
                    "foreign" : "domestic");
        return result;
    }

    public void addInterest(){
//        Set<Integer> accts = accounts.keySet();
        for (BankAccount ba : accounts.values()){
            int balance = ba.getBalance();
            balance += (int) (balance * rate);
//            accounts.put(i, newBalance);
            ba.setBalance(balance);
        }
    }
}
