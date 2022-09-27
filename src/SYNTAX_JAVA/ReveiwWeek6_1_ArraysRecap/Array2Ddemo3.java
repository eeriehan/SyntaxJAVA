package SYNTAX_JAVA.ReveiwWeek6_1_ArraysRecap;

import java.util.Arrays;
import java.util.Scanner;

public class Array2Ddemo3 {

    public static void main(String[] args) {

        int[][] arr = new int[][]{
                {100, 20, 30},
                {25, 25, 63, 45}
        };
        System.out.println(Arrays.toString(arr[1]));
        System.out.println(arr[1][2]);

        int smallest = arr[0][0]; // declare smallest value.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < smallest) {
                    smallest = arr[i][j];


                }
            }
        }
        System.out.println(smallest);
    }

}
