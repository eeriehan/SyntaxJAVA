package com.syntax.class04_IfNestedRecap;

public class NestedIfCondition {

    public static void main(String[] args) {

        int time = 8;

        String day = "Monday";

        if (day.equals("Monday")) {

            if (time > 7) {

                System.out.println("Lets go to office");
            }

            if (time < 6) {
                System.out.println("Lets sleep more");

            }
        }
    }

}
