package com.syntax.class10_Arrays;

public class Hw02Animals {

    public static void main(String[] args) {
        // type01
        String animal[] = new String[5];

        animal[0] = "dog";
        animal[1] = "cat";
        animal[2] = "horse";
        animal[3] = "chicken";
        animal[4] = "cow";

        System.out.println(animal[4]);

        // type02
        String[] beast = {"lion", "tiger", "wolf", "snake", "eagle"};
        System.out.println(beast[4]);

    }

}
/*
 * Create an array of animals and store 5 elements into it. Using 2 different
 * loops print all elements from the array.
 */
