package com.syntax.G_Project01Task01;

import java.util.Arrays;
import java.util.Scanner;

public class CodingTask1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("how many intergers?: ");

        int many = scan.nextInt();
        int[] arr = new int[many];

        for (int i = 0; i < many; i++) {
            System.out.println("enter numbers to add : ");
            arr[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("sum of all the numvers from the Array is " + sum);
    }
}
/*
 * Using Scanner create an array of integer values. After the array is created,
 * calculate the sum of all stored elements in that array.
 */