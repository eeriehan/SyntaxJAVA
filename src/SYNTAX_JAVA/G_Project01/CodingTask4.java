package com.syntax.G_Project01Task01;

public class CodingTask4 {

    public static void main(String[] args) {

        int[][] numbers = {
                {10, 11, 12, 13, 71, 73},
                {32, 78, 21, 13, 13, 17},
                {10, 44, 19, 89, 51, 93},
                {56, 45, 96, 76, 28, 62},
        };

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.println(numbers[i][j]);
                }
            }
        }

        //	int sum = 0;

        for (int[] ar : numbers) {

            for (int num : ar) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}
/*
 * . Create a 2D array or integer type where you will store odd and even
 * numbers. Develop a program which will identify/print the even numbers only.
 */