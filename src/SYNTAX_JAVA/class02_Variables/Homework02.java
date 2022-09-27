package com.syntax.class02_Variables;

public class Homework02 {

    public static void main(String[] args) {

        //HW01
        float f01 = 4.44F;
        float f02 = 5.55F;

        double d01 = 88.88888;
        double d02 = 99.99999;

        System.out.println("HW01:");
        System.out.println("The Sum of 2 numbers " + f01 + " and " + f02 + " is equal to " + (f01 + f02));
        System.out.println("The Subtraction of 2 numbers " + f01 + " and " + f02 + " is equal to " + (f01 - f02));
        System.out.println("The Multiplication of 2 numbers " + d01 + " and " + d02 + " is equal to " + (d01 * d02));
        System.out.println("The Division of 2 numbers " + d01 + " and " + d02 + " is equal to " + (d01 / d02));

        //HW02
        double num01 = 3.9;

        System.out.println("HW02:");
        System.out.println("The square of the " + num01 + " is " + (num01 * num01));

        //HW03
        int recWidth = 23;
        int recHeight = 32;

        System.out.println("HW03:");
        System.out.println("The perimeter of a rectangle with width of " + recWidth + "  and height of " + recHeight + " is equal to " + ((recWidth * 2) + (recHeight * 2)) + " and the area is " + recWidth * recHeight);

        // test

        boolean aa;
        aa = true;
        aa = false;
        System.out.println(aa);


    }

}
