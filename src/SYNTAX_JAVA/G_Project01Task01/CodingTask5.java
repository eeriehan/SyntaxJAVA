package com.syntax.G_Project01Task01;

public class CodingTask5 {

    public static void main(String[] args) {

        int[][] numbers = {
                {10, 11, 12, 13, 71, 73},
                {32, 78, 21, 13, 13, 17},
                {10, 44, 19, 89, 51, 93},
                {56, 45, 96, 76, 28, 62},};

        int evenSum = 0;
        int oddSum = 0;

        for (int[] ar : numbers) {

            for (int num : ar) {
                if (num % 2 == 0) {
                    evenSum += num;
                } else {
                    oddSum += num;
                }
            }
        }
        System.out.println("Odd sum " + oddSum);
        System.out.println("Even sum " + evenSum);
    }
}
/*
 * 5. Create a 2D array of integers. Develop a program
which will calculate the sum of even and odd numbers
for that array.
 */