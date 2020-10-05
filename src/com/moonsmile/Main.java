package com.moonsmile;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//          speed converter tes*************
//        long miles = SpeedConverter.toMilesPerHour(10.5);
//        System.out.println("Miles = " + miles);
//
//        SpeedConverter.printConversion(10.5);

//        String displayHour =
//                SecondsAndMinuteChallenge.getDurationString(65,45);
//        System.out.println(displayHour);
//
//        String displaySeconds = SecondsAndMinuteChallenge.getDurationString(
//                86400
//        );
//        System.out.println(displaySeconds);
//        System.out.println(SecondsAndMinuteChallenge.getDurationString(-41));

            //  switch case test***********
//        System.out.println("Enter value: ");
//        Scanner input = new Scanner(System.in);
//        String switchValue = input.nextLine();
//
//        switch (switchValue.toLowerCase()){
//            case "a":
//                System.out.println("value = " + switchValue);
//                break;
//            case "b":
//                System.out.println("Value = " + switchValue);
//                break;
//            case "c":
//                System.out.println("Value = c");
//                break;
//            case "d":
//                System.out.println(switchValue);
//                break;
//            case "e":
//                System.out.println("Value = e");
//                break;
//            default:
//                System.out.println("Either A, B, C, D, or E");
//                break;
//        }

        // while and evenNumber test************
//        WhileLoopTutorial tutorial = new WhileLoopTutorial();
////        tutorial.getwhileLoop();
//
//        System.out.println();
//        int number = 4;
//        int finishNumber = 20;
//        int sum = 0;
//        int count = 0;
//        int evenNumberFound = 0;
//
//        while (number <= finishNumber){
//            number++;
//            if (!tutorial.isEvenNumber(number)){
//                continue;
//            }
//            sum += number;
//            count ++;
//            evenNumberFound ++;
//            System.out.println("Even number " + number);
//            if (count == 5){
//                break;
//            }
//        }
//        System.out.println("Total Even number " + sum);
//        System.out.println("Total Even number found " + evenNumberFound);
            // while and evenNumber test end ******************

//            DigitSumChallenge digits = new DigitSumChallenge();
//        System.out.println("The sum of the digits in number 125 is " + digits.sumDigits(125));
//        System.out.println("The sum of the digits in number -125 is " + digits.sumDigits(-125));
//        System.out.println("The sum of the digits in number 4 is " + digits.sumDigits(4));
//        System.out.println("The sum of the digits in number 32123 is " + digits.sumDigits(32123));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter name: ");
            String name = scanner.nextLine();

            int age = 2020 - yearOfBirth;
            if (age > 0 && age <= 100){
                System.out.println("Your name is " + name +", and your " + age + " years old.");
            }else {
                System.out.println("Invalid year of birth");
            }
        }else {
            System.out.println("Unable to parse year of birth");
        }
        scanner.close();
    }
}
