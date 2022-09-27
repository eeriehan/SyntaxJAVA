package com.syntax.class10_Arrays;

public class ArrayDemo2_FixedSize {

    public static void main(String[] args) {

        int[] nums = new int[3];

        nums[1] = 12;
        nums[2] = 13;

        System.out.println(nums[0]);
        //output is 0 because string/null = 0. wasting space?

        String[] colors = new String[3];

        colors[0] = "white";
        colors[1] = "pink";
        colors[2] = "black";
        colors[3] = "yellow";        //Array index 3 out of bounds Exception: 3

        System.out.println(colors[3]);

    }

}
