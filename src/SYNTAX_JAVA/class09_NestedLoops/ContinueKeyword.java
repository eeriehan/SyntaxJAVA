package com.syntax.class09_NestedLoops;

public class ContinueKeyword {

    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {

            if (i == 3) {
                continue;
            }
            System.out.println("hello");
            System.out.println("how are you");
            System.out.println("i");
        }


// i want to print numbers from 1 to 20 execpt number 6, 7, 8

        for (int i = 1; i <= 20; i++) {

            if (i == 6 || i == 7) {
                continue;
            }
            System.out.println(i + " ");
        }
    }
}

//