package DesignPattern.mosh;

public class Main {
    public static void main(String[] args) {
//        TaxCalculator calculator = getCalculator();
//        calculator.calculateTax();

//      var account = new Account();
//        account.deposit(10);
//        account.withdraw(5);
//        System.out.println(account.getBalance());

//        MailService mailService = new MailService();
//        mailService.sendEmail();

        drawUIControl(new CheckBox());
    }

//    public static TaxCalculator getCalculator(){
//        return new TaxCalculator2019();
//    }

    public static void drawUIControl(UIControl control){
        control.draw();
    }
}
