package com.syntax.class04_IfNestedRecap;

import java.util.Scanner;

public class HW04_DMV {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your age?");
        int cusAge = scanner.nextInt();

        if (cusAge >= 18) {
            System.out.println("you get licence");
        } else {
            System.out.println("not old enough there buddy");
        }
    }

}
