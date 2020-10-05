package com.moonsmile;

public class FeetAndInchesToCentimeters {

    public static void main(String[] args) {
        double centimeter = calFeetAndInchesToCentimeters(6,0);
        if (centimeter <0.0){
            System.out.println("Invalid parameter");
        }
        calFeetAndInchesToCentimeters(157);
    }

    public static double calFeetAndInchesToCentimeters(double feet, double inches) {

        if ((feet < 0) || (inches < 0) || (inches > 12)) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + "feet, " + inches + "inches = " +
                centimeters + " cm");
        return centimeters;
    }

    public static double calFeetAndInchesToCentimeters(int inches) {
        if (inches <0){
            return -1;
        }
        double feet = (int) inches /12;
        double remainingInches = (int)inches % 12;
        System.out.println(inches + " inches is equal to " + feet +
                " feet and " + remainingInches);
        return calFeetAndInchesToCentimeters(feet, remainingInches);
    }
}
