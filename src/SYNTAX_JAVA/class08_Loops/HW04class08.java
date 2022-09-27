package com.syntax.class08_Loops;

public class HW04class08 {

    public static void main(String[] args) {

        // HW3: Print even numbers from 20 to 1 (2ways)


        // for loop
        int i;
        for (i = 20; i >= 2; i -= 2) {
            System.out.printf(i + " ");
        }


        // while loop
        int u = 20;
        while (u >= 2) {
            System.out.print(u + " ");
            u -= 2;
        }
    }

}
