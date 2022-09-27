package com.syntax.class03_IfElse;

public class PosNegEveOdd {

    public static void main(String[] args) {
        // Positive or Negative

        int num01 = 33;

        System.out.println("the number is" + " " + num01);

        if (num01 > 0) {
            System.out.println("Positive +");
        } else if (num01 < 0) {
            System.out.println("Negetive -");
        } else if (num01 == 0) {
            System.out.println("Zero 0");
        }

        // Even or Odd

        int mysNum01 = 123;

        if (mysNum01 % 2 == 0) {
            System.out.println("Even number");
        } else if (mysNum01 % 2 >= 1) {
            System.out.println("Odd number");
        }

    }

}
