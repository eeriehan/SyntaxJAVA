package com.syntax.class04_IfNestedRecap;

import java.util.Scanner;

public class HW03_Loan {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How much loan do you need? ");
        double loan = scanner.nextDouble();

        if (loan <= 200000) {
            System.out.println("Approved");
        } else {
            System.out.println("Rejected");

        }
    }

}
