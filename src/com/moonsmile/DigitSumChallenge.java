package com.moonsmile;

public class DigitSumChallenge {

    public static int sumDigits(int number){
        if (number < 10){
            return -1;
        }
        int sum =0;

        // 125 -> 125 / 10 = 12 * 10 =120 -> 125 - 120 = 5
        while (number > 0){
            // extract the least-significant digits
            int digit = number % 10;
            sum += digit;

            // drop the least-significant digit
            number /= 10;
        }
        return sum;
       }
}
