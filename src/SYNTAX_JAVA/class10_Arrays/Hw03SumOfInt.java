package com.syntax.class10_Arrays;

public class Hw03SumOfInt {

    public static void main(String[] args) {
        // type01
        int num1[] = new int[5];

        num1[0] = 23;
        num1[1] = 55;
        num1[2] = 77;
        num1[3] = 88;
        num1[4] = 99;

        System.out.println(num1[0] + num1[1] + num1[2] + num1[3] + num1[4]);

        // type02
        int[] num2 = {23, 55, 77, 88, 99};
        for (int k = 0; k < num1.length; k++) {
        //?????
        }
        System.out.println("---------------");
        int[][] a = {   // How to print all value in 2D Array.
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int sum1 = 0;
        for (int[] arr :a) {
            for (int j : arr) {
                sum1 += j;
            }
          //  System.out.println(sum1);
        }
        System.out.println(sum1);
    }



}



/*
 * 3. Create an array on integers and calculate the sum of all elements in an
 * array
 */
