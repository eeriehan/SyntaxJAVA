package com.syntax.G_Project01Task01;

import java.util.Arrays;
import java.util.Scanner;

public class CodingTask3 {

    public static void main(String[] args) {

        int[][] arr = {{1, 2, 4, 5}, {10000, 3232323, 111}, {20, 30},};

        int sum = 0;

        for (int[] ar : arr) {

            for (int num : ar) {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
/*
 * 3. Create a 2D array of integer values. Print the sum of all numbers
 *
 */