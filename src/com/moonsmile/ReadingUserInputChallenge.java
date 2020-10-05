package com.moonsmile;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    // create a scanner object to collect input.
    // use a counter variable for counting valid numbers.
    // ask user for input from console.
    // save input into variable number.
    // check if input is valid with data type.
    // if input is invalid return false to the console.
    // ask for input 10 times, after the 10th stop.
    // add all the input together and print in console
    // for every prompt message print "Enter number #1: ".
    // use a while loop.
    // close the scanner after you don't need it anymore.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;   // To count number of loop
        int sum = 0;     // To sum all input from the user(console)

        while (count < 10){
            int order = count + 1;      // To order the prompter
            System.out.print("Enter number #"+order + ": " );

            boolean hasNextInt = scanner.hasNextInt();      // To check the input provided from console using scanner.hasNextInt()

            if (hasNextInt){
                int number = scanner.nextInt();     // Save input into variable number

                if (number > 0 && number <= 10){       // checks the input btw 1-10
                    count ++;                   // increment the count after checks are made
                    sum += number;          // sum all digits saved in number into sum
                }else {
                    System.out.println("Invalid number");
                }
            }
            scanner.nextLine();     // allow the program to move to the next line
        }
        System.out.println("Total sum number is " + sum);
        scanner.close();       // close scanner object to save ram space
    }
}
