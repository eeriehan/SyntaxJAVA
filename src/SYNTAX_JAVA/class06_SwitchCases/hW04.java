package com.syntax.class06_SwitchCases;

import java.util.Scanner;

public class hW04 {

    // iF

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("enter first number: ");
        double num01 = scan.nextDouble();
        System.out.printf("enter second number: ");
        double num02 = scan.nextDouble();
        System.out.printf("enter operator (+,-,*,/)");
        char oper = scan.next().charAt(0);

        double answer1 = num01 + num02;
        double answer2 = num01 - num02;
        double answer3 = num01 * num02;
        double answer4 = num01 / num02;

        if (oper == '+') {
            System.out.println(answer1);
        } else if (oper == '-') {
            System.out.println(answer2);
        } else if (oper == '*') {
            System.out.println(answer3);
        } else if (oper == '/') {
            System.out.println(answer4);
        } else {
            System.out.println("kidding me?");
        }
    }
}

/*
 * Using scanner class create calculator. Allow user to enter 2 numbers and
 * operator(+,-,*,/). Based on operator provide the result to user. Please
 * complete this assignment in 2 ways: using if statement and switch case.
 */