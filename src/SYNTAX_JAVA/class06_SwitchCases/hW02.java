package com.syntax.class06_SwitchCases;

import java.util.Scanner;

public class hW02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your grade:");
        String grade = scan.nextLine();
        String expla;

        switch (grade) {
            case "a":
                expla = "excellent";
                break;
            case "b":
                expla = "good";
                break;
            case "c":
                expla = "average";
                break;
            case "d":
                expla = "bad";
                break;
            default:
                expla = "Not Acceptable";
                break;
        }
        System.out.println("Your grade is " + grade + " and its " + expla);
    }

}
/*
 * Allow user to enter grade (A, B, or C etc...) and then provide explanation:
 * A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable. At
 * the end your program should print which grade was entered by a user with
 * explanation.
 */
