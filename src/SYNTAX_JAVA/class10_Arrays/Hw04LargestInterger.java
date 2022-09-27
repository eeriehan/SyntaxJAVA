package com.syntax.class10_Arrays;

public class Hw04LargestInterger {

    public static void main(String[] args) {

        int num1[] = new int[3];

//		num1[0] = 0;
//		num1[1] = 1;
//		num1[2] = 2;
//
//		if (num1[0] > num1[1] && num1[0] > num1[2]) {
//			System.out.println(num1[0]);
//		} else if (num1[1] > num1[0] && num1[1] > num1[2]) {
//			System.out.println(num1[1]);
//		} else if (num1[2] > num1[0] && num1[2] > num1[1]) {
//			System.out.println(num1[2]);
//
//		}
        int[] num = {1, 23, 8, -456, 78, 234, 90};

        int largest = num[0];

        for (int number : num) {
            if (number > largest) {
                largest = number;
            }
        }
        System.out.println(largest);

    }


}


/*
 * 4. From an array of integer elements find the largest number.
 */
