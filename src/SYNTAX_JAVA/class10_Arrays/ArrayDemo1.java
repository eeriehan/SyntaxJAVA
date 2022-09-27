package com.syntax.class10_Arrays;

public class ArrayDemo1 {

    public static void main(String[] args) {

        int[] arr = new int[4]; // Must declare how many value in the Array
        // store elements inside an array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        // accessing elements from the array
        System.out.println(arr[2]);

        System.out.println(arr[1] + arr[2]);

        // Create an array and store your classmates
        String[] sName = new String[5];
        sName[0] = "Shiri";
        sName[1] = "Vera";
        sName[2] = "Roman";
        sName[3] = "Han";
        sName[4] = "cortana";

        System.out.println("Hello " + sName[1]);

    }

}
