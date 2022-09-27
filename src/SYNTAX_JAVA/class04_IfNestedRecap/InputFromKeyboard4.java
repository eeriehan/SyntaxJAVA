package com.syntax.class04_IfNestedRecap;

import java.util.Scanner;

public class InputFromKeyboard4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("did you solve any repl assignments. please enter True or False");

        boolean solvedAnyRepls = scanner.nextBoolean();

        if (solvedAnyRepls) {

            System.out.println("how many Repls you solved");
            int noOfReplsSolved = scanner.nextInt();

            if (noOfReplsSolved >= 17) {
                System.out.println("you are doing great");

            } else if (noOfReplsSolved > 10) {
                System.out.println("you are doing ok Please complete them as soon as possible");
            } else {
                System.out.println("You should solve more repls");
            }

        } else {
            System.out.println("They are very important to learn java please solve them");
        }
    }
}


