package com.syntax.class04_IfNestedRecap;

import java.util.Scanner;

public class HW01_Diploma {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("I Have diploma. True or False?");

        boolean hasDiploma = scanner.nextBoolean();

        if (hasDiploma == true) {
            System.out.println("huh, interesting. what is your GPA then ?");
            double gpa = scanner.nextDouble();

            if (gpa >= 3.5) {
                System.out.println("You are eligible for scholarship");
            } else {
                System.out.println("You should have study way harder.");
            }
        }
        if (hasDiploma == false) {
            System.out.println("Go get yourself a diploma now");
        }
    }
}
