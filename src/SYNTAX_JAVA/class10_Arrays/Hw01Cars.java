package com.syntax.class10_Arrays;

public class Hw01Cars {

    public static void main(String[] args) {
        // type01
        String cars[] = new String[5];

        cars[0] = "370z";
        cars[1] = "Supra";
        cars[2] = "Mustang";
        cars[3] = "Civic";
        cars[4] = "Model 3";

        System.out.println(cars[4]);

        // type02
        String[] vehicle = {"GT-R", "Raptor", "Rubicon", "280z", "I6"};
        System.out.println(vehicle[4]);

    }

}
/*
 * 1. Create an array of cars and store 6 elements into it. Using 2 different
 * loops print all values from the array.
 */
