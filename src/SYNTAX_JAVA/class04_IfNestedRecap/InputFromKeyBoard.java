package com.syntax.class04_IfNestedRecap;

import java.util.Scanner;

public class InputFromKeyBoard {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // A message will be displayed to the user on the console to enter his name
        System.out.println("Please enter  your name");
        // activates the java program to take the input from the keyboard and store it inside the name variable
        String name = input.next();
        // prints whatever name user enters on the keyboard on the console
        System.out.println("Hello " + name);


    }

}
