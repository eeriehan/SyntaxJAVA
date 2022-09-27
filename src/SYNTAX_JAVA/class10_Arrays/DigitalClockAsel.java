package com.syntax.class10_Arrays;

public class DigitalClockAsel {

    public static void main(String[] args) {

        System.out.println("type1");
        System.out.println();

        String time;
        for (int h = 0; h <= 23; h++) {
            for (int m = 0; m <= 59; m++) {
                if (h < 10 && m < 10) {
                    time = "0" + h + ":" + "0" + m;
                } else if (h < 10 && m > 10) {
                    time = "0" + h + ":" + m;
                } else if (h > 10 && m < 10) {
                    time = h + ":" + "0" + m;
                } else {
                    time = h + ":" + m;
                }
                System.out.println(time);
            }
        }
        System.out.println();
        System.out.println("type2");
        System.out.println();

        for (int h1 = 0; h1 <= 2; h1++) {

            for (int h2 = 0; h2 <= 9; h2++) {

                if (h1 == 2 && h2 == 4) {
                    break;
                }

                for (int m1 = 0; m1 <= 5; m1++) {

                    for (int m2 = 0; m2 <= 9; m2++) {

                        System.out.println(h1 + "" + h2 + ":" + m1 + "" + m2);
                    }
                }
            }
        }
        System.out.println();
        System.out.println("type3 - maybe BEST");
        System.out.println();

        for (int hour = 0; hour < 24; hour++) { // controls hours

            for (int min1 = 0; min1 <= 5; min1++) { // controls first digit of min

                for (int min2 = 0; min2 <= 9; min2++) { // controls 2nd digits of min

                    if (hour < 10) {
                        System.out.println("0" + hour + ":" + min1 + min2);
                    } else {
                        System.out.println(hour + ":" + min1 + min2);
                    }
                }
            }
        }
        System.out.println();
        System.out.println("type4 - My take");
        System.out.println();

        for (int r = 1; r <= 23; r++) {
            for (int t = 1; t <= 59; t++) {
                System.out.println(String.format("%02d", r) + " : " + String.format("%02d", t));
            }
        }

        System.out.println("--------------");

    }
}
