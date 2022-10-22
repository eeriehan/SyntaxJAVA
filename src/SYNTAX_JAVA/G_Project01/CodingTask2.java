package com.syntax.G_Project01Task01;

import java.util.Arrays;
import java.util.Scanner;

public class CodingTask2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter how many countries you want to store? ");
        int size = scan.nextInt();

        String[] countries = new String[size];
        String[] capitals = new String[size];
        scan.nextLine();    // this is to Consume "enter key" stored in Line 11, scan.nextInt

        for (int i = 0; i < size; i++) {
            System.out.println("Please enter the country name");
            countries[i] = scan.nextLine();

            System.out.println("Please enter the capital for " + countries[i]);
            capitals[i] = scan.nextLine();
        }
        System.out.println(Arrays.toString(countries)); // to print all elements in Array
        System.out.println(Arrays.toString(capitals));

        for (int i = 0; i < size; i++) {
            System.out.println("The Country " + countries[i] + " Has the capital " + capitals[i]);
        }
    }
}
/*
 * . 2. Using Scanner create an array of countries. When an array is created,
 * retrieve all values from it and while retrieving those values print capital
 * for each country. (use 2 different loops).
 */