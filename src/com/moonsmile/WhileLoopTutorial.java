package com.moonsmile;

public class WhileLoopTutorial {
//    public static void getwhileLoop() {
//        int count = 1;
//        while (count != 6){
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        System.out.println();
//        count = 90;
//        while (true){
//            if (count == 6){
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        do {
//            System.out.println("Count value is " + count);
//            count++;
//
//            if (count > 100){
//                break;
//            }
//        }while (count != 6);
//    }


    // Create a method called isEvenNumber that takes a parameter of type int
    // its purpose is to determine if the argument passed to the method is
    // an even number or int
    // return true if an even number, otherwise return false;

    public static boolean isEvenNumber(int number){
        if ((number == 1) || (number <= 0)){
            System.out.println("Number must be greater than 1");
            return false;
        }
        else if ((number % 2) != 0){
            return false;
        }
        return true;
    }

}

