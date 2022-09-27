package com.syntax.class09_NestedLoops;

public class NestedLoppEx {

    public static void main(String[] args) {

        for (int a = 0; a <= 9; a++) {

            for (int b = 0; b <= 9; b++) {

                for (int c = 0; c <= 9; c++) {

                    System.out.println(a + " " + b + " " + c);
                }
            }

        }

        // multiplication table

        for (int i = 1; i <= 9; i++) {

            for (int j = 1; j <= 9; j++) {

                System.out.println(i + "x" + j + " = " + i * j);

            }
        }

        for (int r = 1; r <= 23; r++) {
            for (int t = 1; t <= 60; t++) {
                System.out.println(String.format("%02d", r) + " : " + String.format("%02d", t));
            }
        }

        System.out.println("--------------");

        // ex from other student . not working
        /*
         * int h; int g; for (h=0; h<=23; h++) { for (g=0; g<=59; g++) { if (h<10 &&
         * g<10) { System.out.println("0"+h+":"+"0"+g); } else if (h>10 && g<10) {
         * System.out.println(h+":"+g); } else if (h>10 && g<10) {
         * System.out.println(h+":"+"0"+g); } else if (h>10 && g<10) {
         * System.out.println("0"+h+":"+g); }
         *
         * } }
         */


    }
}
