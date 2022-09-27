package com.syntax.class04_IfNestedRecap;

import java.util.Scanner;

public class HW07_Bonus {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many years in Syntax? : ");
        int years = scanner.nextInt();


        if (years <= 4) {
            System.out.println("You are NOT eligible for bonus");
        } else {
            System.out.println("You are eligible for bonus. How much is your salary? : ");
            int sal = scanner.nextInt();

            if (sal >= 50000) {
                System.out.println("Your bonus is $5000");
            } else {
                System.out.println("Your bonus is only $3000");
            }
        }
    }


}


