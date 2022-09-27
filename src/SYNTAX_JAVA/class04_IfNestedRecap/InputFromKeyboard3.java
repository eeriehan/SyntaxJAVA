package com.syntax.class04_IfNestedRecap;

import java.util.Scanner;

public class InputFromKeyboard3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter your name");
        //takes a String type input from the key and stores it in name variable

        String name = scanner.nextLine();

        System.out.println("pleas enter your age");

        //takes an int from the keyboard and stores it in age variable
        int age = scanner.nextInt();

        System.out.println("hi " + name + " you are " + age + " years old");
    }

}
