package com.syntax.class09_NestedLoops;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
// 1.from the range of 1 to 50 plrease find the sum of all even and alll odd number
// 2.create a secret number and let user guess the secret number
// 	once user guessed your secret number->program says you won

        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
        }
        System.out.println("sum of odd numbers = " + sumOdd);
        System.out.println("sum of even numbers = " + sumEven);
    }

    Scanner input = new Scanner(System.in);
    int secretNumber = 8;
    int guessNumber;
//do{
//		System.out.println("Please guess the secret number from 1 to 10");
//		guessNumber = input.nextInt();
//	}while(secretNumber!=guessNumber);
//System.out.println("Congratulations! You won!");
}

