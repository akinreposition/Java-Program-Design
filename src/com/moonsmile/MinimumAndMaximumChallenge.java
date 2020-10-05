package com.moonsmile;

import java.util.Scanner;

public class MinimumAndMaximumChallenge {
    public static void main(String[] args) {
        // create a scanner object
        // prompt user for number in console
        // save the number
        // use an endless while loop for continuous prompt
        // check if the input is valid number
        // check if the previous number is greater than the new input
        // save the smallest number in a variable
        // save the largest number in a variable
        // if not a valid print 'invalid number' and break from loop
        // print the minimum number and maximum number

        Scanner scanner = new Scanner(System.in);


        int minimumNumber = Integer.MAX_VALUE ;			// 2147483647
        int maximumNumber = Integer.MIN_VALUE ;			// -2147483648
//		boolean first = true;

        while(true) {

            System.out.print("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt) {
                int number = scanner.nextInt();

//				if(first) {
//					first = false;
//					minimumNumber = number;
//					maximumNumber = number;
//				}

                if (number< minimumNumber) {
                    minimumNumber = number;
                }
                if(number > maximumNumber) {
                    maximumNumber = number;
                }


            }else {
                System.out.println("Invalid Number");
                break;
            }
            scanner.nextLine();

        }
        System.out.println("Minimum = " + minimumNumber +
                ", Maximum = " + maximumNumber);
        scanner.close();
    }
}
