package com.syntax.class08_Loops;

import java.util.Scanner;

public class HW05class08 {

    public static void main(String[] args) {

        // HW3: coffee

        Scanner input = new Scanner(System.in);
        double coffeePrice = 2.99;
        double price;
        double remain;
        do {
            System.out.println("Please make a payment for your Coffee:");
            price = input.nextDouble();
            if (price > coffeePrice) {
                remain = price - coffeePrice;
                System.out.println("Please give $" + remain + " less money!");
            } else if (price < coffeePrice) {
                remain = coffeePrice - price;
                System.out.println("Please give $" + remain + " more money!");
            }
        } while (coffeePrice != price);
        System.out.println("Please enjoy your coffee!");

        double coffee = 4.65;
        double pay;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.print("Please pay your order: ");
            pay = sc.nextDouble();

            if (pay > coffee) {
                System.out.print("Please give less. ");

            } else if (pay < coffee) {
                System.out.println("Please give more. ");


            } else
                System.out.println("Enjoy your coffee.");


        } while (coffee != pay);

    }
}
