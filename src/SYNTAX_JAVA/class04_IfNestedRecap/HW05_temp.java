package com.syntax.class04_IfNestedRecap;

import java.util.Scanner;

public class HW05_temp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("What Is your city?: ");
        String city = scanner.nextLine();
        System.out.printf("What is temperature(F) of your city?: ");
        double tempF = scanner.nextDouble();
        double tempC = (tempF - 32) / 1.8;
        System.out.print("The temperature in the " + city + " is " + tempC + "c");


    }

}
