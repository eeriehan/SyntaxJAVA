package com.syntax.class08_Loops;

public class whileNote {

    public static void main(String[] args) {

        // print all numbers from 1 to 10

        int num = 1;

        while (num <= 10) {
            System.out.print(num + " ");
            num++;
        }

        System.out.println(" ----------------  ");

        // print all numbers from 10 to 25
        int a = 10;

        while (a <= 25) {
            System.out.print(a + " ");
            a++;
        }

        System.out.println(" ----------------  ");

        // print all numbers from 10 to 1

        int b = 10;

        while (b >= 1) {

            System.out.print(b + " ");
            b--;
        }

        System.out.println(" ----------------  ");
        // print all numbers from 50 to 20

        // print all even numbers from 1 to 20
        int c = 2;

        while (c <= 20) {
            System.out.print(c + " ");
            c += 2;
        }

        System.out.println("Another way");

        int i = 1;

        while (i <= 20) {

            if (i % 2 == 0) {
                System.out.print(i + " ");
            }

            i++;
        }

    }
}