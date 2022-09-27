package com.syntax.G_Project01Task01;

public class CodingTask7 {

    public static void main(String[] args) {

        int num = 12; // enter # here

        boolean isPrime = true;
        if (num > 1) {

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }


        } else {
            isPrime = false;
        }


        if (isPrime) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is Not Prime");
        }

    }
}
/*
 * 7. Write a java program to check whether a given number is Prime or not?
 */