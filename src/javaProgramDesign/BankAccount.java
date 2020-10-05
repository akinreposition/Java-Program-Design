package javaProgramDesign;

public class BankAccount {
    private int accountNumber;
    private  int balance = 0;
    private boolean isForeign = false;


    public BankAccount(int acct){
        accountNumber = acct;
    }

    public  int getAccountNumber(){
        return accountNumber;
    }

    public int getBalance(){
        return balance;
    }

    public void setBalance(int amount){
        balance = amount;
    }

    public boolean isForeign() {
        return isForeign;
    }

    public  void setForeign(boolean b){
        isForeign = b;
    }
}
