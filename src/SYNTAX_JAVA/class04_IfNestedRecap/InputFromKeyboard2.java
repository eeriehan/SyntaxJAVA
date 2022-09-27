package com.syntax.class04_IfNestedRecap;

import java.util.Scanner;

public class InputFromKeyboard2 {

    public static void main(String[] args) {
        System.out.println("how old are you?");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        // we use nextInt() if we want an int type of data from the keyboard
        if (age < 18) {
            System.out.println("You should study");
        } else {
            System.out.println("You should start working");
        }


    }

}
