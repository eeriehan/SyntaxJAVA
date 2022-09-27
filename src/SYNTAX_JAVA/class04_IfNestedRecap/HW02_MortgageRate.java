package com.syntax.class04_IfNestedRecap;

import java.util.Scanner;

public class HW02_MortgageRate {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Mortgage rate is ");
        double mRate = scanner.nextDouble();

        if (mRate >= 4.5) {
            System.out.println("Not buying house");
        } else {
            System.out.print("Let's buy house. How much is house? ");
            double mPrice = scanner.nextDouble();

            if (mPrice >= 200000) {
                System.out.println("Let's take loan out");
            } else {
                System.out.println("pocket change! all cash now!");
            }
        }
    }
}

