package oopChallenge;

public class BankAccount {
    private double accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(double accountNumber) {
        if ((accountNumber >= 11) || (accountNumber < 5)){
            System.out.println("Account number must not be less 5 or " +
                    "greater than 11 ");
        }
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }



    public BankAccount(double accountNumber,String customerName,
                       String email,int phoneNumber) {
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(int amount){
        balance += amount;
        System.out.println("New balance = " + balance);
    }

    public double withdrawFunds(double amount){
        double newBalance =0;
        if (amount >= balance){
            System.out.println("Insufficient fund");
        }else if (balance < 0 ){
            System.out.println("Insufficient balance");
        }else {
            newBalance = balance - amount;
            System.out.println("current balance = " + newBalance);
        }
        return newBalance;
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123456789,"akin",
                "akin@mail.com",25752281);
//        account1.withdrawFunds(11000);
//        account1.depositFunds(10000);
        account1.withdrawFunds(9000);
    }
}
