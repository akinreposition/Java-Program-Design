package com.moonsmile;

public class CalculateInterest {

    public static void main(String[] args) {
//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
//        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
//        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
//        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));
//
//        System.out.println();
//        for (double i= 2; i < 9; i++){
//            System.out.println("10,000 at " + i + " interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
//        }
//
//        System.out.println();
//        for (double i= 8; i >=2; i--){
//            System.out.println("10,000 at " + i + " interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
//        }

        int count = 0;
        for (int i = 10; i < 50; i++){
            if (isPrime(i)){
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 10){
                    System.out.println("Existing the loop");
                    break;
                }
            }
        }

        System.out.println(isPrime(13));

    }

    public static double calculateInterest(double amount, double interest){
        return (amount * (interest / 100));
    }

    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }
        for (int i= 2; i < (long) Math.sqrt(n); i++){
            if (n % 1 == 0){
                return false;
            }
        }
        return true;
    }
}
