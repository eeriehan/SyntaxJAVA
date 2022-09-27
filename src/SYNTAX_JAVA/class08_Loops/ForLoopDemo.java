package com.syntax.class08_Loops;

public class ForLoopDemo {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Hello");

        }
        System.out.println("-----------------------------");

        // Print numbers from 1 to 20

        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " ");
        }
        System.out.println("-----------------------------");

        // Print numbers from 30 to 10

        for (double i = 30; i >= 10; i--) {
            System.out.print(i + " ");
        }

        // What is the output - increment by 2

        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i + " ");
        }

        // What is the out put 2 - increment by 5

        for (int i = 10; i <= 25; i += 5) {
            System.out.println(i + " ");
        }

        // What is the output 3
        int sum = 0;

        for (int i = 1; i <= 6; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

}
// When to use which loop

// For loop :
//		when you know how many times to repeat, in advance **
// While loop (or Do while loop) :
//		when you DO NOT KNOW how many times to repeat the block of codes **
//