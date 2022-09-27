package com.syntax.class10_Arrays;

public class Task2Darray {

    public static void main(String[] args) {
        String[][] who = new String[4][4];

        who[0][0] = "Mr.";
        who[0][1] = "Mrs.";
        who[0][2] = "Ms.";
        who[0][3] = "Miss.";

        who[1][0] = "Smith.";
        who[1][1] = "Jordan.";
        who[1][2] = "Jackson.";
        who[1][3] = "Obama.";

        System.out.println(who[0][1] + who[1][0]);
        System.out.println(who[0][0] + who[1][3]);
        System.out.println(who[0][2] + who[1][2]);
        System.out.println(who[0][3] + who[1][1]);

        System.out.println("---------------------------");

        String[][] grade = {
                {"Smith", "Jordan", "Jackson", "jackson"},
                {"A", "B", "F", "D"}
        };

        System.out.println(grade[0][0] + " " + grade[0][1]);

    }
}


/*
 * Create a 2D array(shorter way) in which first array will consist of 4 names
 * and second array will contain grades. Then your program should print name of
 * the students that has A and B grade
 */
