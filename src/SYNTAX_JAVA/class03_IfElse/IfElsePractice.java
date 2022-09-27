package com.syntax.class03_IfElse;

public class IfElsePractice {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int number = 19;

        if (number != 18) {
            System.out.println("this number is not 18");
        }

        int day = 14;

        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thuresday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Satday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Please enter valid day number 1~7");
        }
    }


}

