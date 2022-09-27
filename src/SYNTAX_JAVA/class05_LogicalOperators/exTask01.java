package com.syntax.class05_LogicalOperators;

import java.util.Scanner;

public class exTask01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your height: ");
        int tall = scan.nextInt();

        if (tall >= 72) {
            System.out.println("Tall");
        } else if (tall <= 60) {
            System.out.println("Short");
        } else if (tall < 60 && tall > 72) {
            System.out.println("Medium");
        }

    }
/**
 * 1. Prompt the user to enter person heights in inches. Person should be classified as one of the following:
 • short (under 60 inch)
 • medium(between 60 -72 inch)
 • tall (over 72 inch)
 2. Write a program that will print whether it is a weekend or weekday. If any day from 1-5 → output “It is a weekday”, anyday from 6-7 → output “It is a weekend”, any other day → output “Invalid day”
 3. Ask user to enter a number and then define if number is small, medium or large
 Small number is value between 1 and 10
 Medium number is value between 11 and 100
 Large number is value between 101 and 1000
 */

}
