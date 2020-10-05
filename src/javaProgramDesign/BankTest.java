package javaProgramDesign;

public class BankTest {
    private static Bank bank = new Bank();
    private static  int acct = bank.newAccount();

    public static void main(String[] args) {
        verifyBalance("initial amount", 0);
        bank.deposit(acct, 10);
        verifyBalance("after deposit", 10);
        verifyLoan("authorize bad loan", 22, false);
        verifyLoan("authorize good loan", 20, true);
    }

    private static void verifyBalance(String msg, int expectedVal){
        int balance = bank.getBalance(acct);
        boolean ok = (balance == expectedVal);
        String result = ok ? "Good!" : "Bad!";
        System.out.println(msg + ": " + result);
    }

    private static void verifyLoan(String msg, int loanAmount, boolean
                                   expectedVal){
        boolean answer = bank.authorizeLoan(acct, loanAmount);
        boolean ok = (answer ==expectedVal);
        String result = ok ? "Good! " : "Bad! ";
        System.out.println(msg + ": " + result);
    }
}
