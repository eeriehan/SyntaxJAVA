package com.syntax.class09_NestedLoops;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//tASK 1. Print numbers from 1 to 50 except those that are divisible by 3
//		int i;
//		for ( i=1; i<=50; i++) {
//			if (i%3 == 0) {
//				continue;
//		}
//			System.out.print(i+" ");
//
//		}	

//Write a program to ask a user to enter item they want to buy and the price of that 
//item. Every time user enters money, accumulate the amount and tell the user 
//how much is left to pay off. If user give more money program should return a change.
//Whenever user done with payments program should say "Thank you for shopping!"
        /*
         * System.out.print("how much is your total amount?: "); double item =
         * scan.nextInt(); System.out.print("enter payment amount: "); double price =
         * scan.nextInt();
         *
         * if (item == price) { System.out.println("Thank you for shopping!"); } if
         * (item < price) {
         * System.out.println("Thank you for shopping with us, take change of " + (
         * total - payment)); }
         *
         *
         * while ((item - price) < item) {
         * System.out.println("insuficient amount. Please submit $" + (item - price));
         * int payment2 = scan.nextInt();
         *
         * } }
         */
        System.out.println("What are you buying?");
        String item = scan.nextLine();

        System.out.println("How much is item you are purchasing");
        double price = scan.nextDouble();

        double money;
        double total = 0;

        do {
            System.out.println("How much money do you have?");
            money = scan.nextDouble();

            total += money; // accumulate all money
            double need;
            double change;

            if (total < price) {
                need = price - total;
                System.out.println("you need to pay more $" + need);

            } else if (total > price) {
                change = total - price;
                System.out.println("Here is your chage " + change);
            }
        } while (total != price);
        System.out.println("Thank you for shopping!");
    }

}