package com.syntax.class04_IfNestedRecap;

import java.util.Scanner;

public class HW06_CreditCard {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Answer following : I have Syntax platinum credit card? Answer True or False : ");

        boolean answer = scanner.nextBoolean();

        if (answer == true) {
            System.out.printf("What is the balance on your card? : ");
            double bal = scanner.nextDouble();

            if (bal >= 1000) {
                System.out.println("PAY OFF IMMEDIATELY");
            } else {
                System.out.println("Please, spend more.");
            }
        } else {
            System.out.println("Would you like to make Platinum money pit?");
        }
    }

}
					
		
	

