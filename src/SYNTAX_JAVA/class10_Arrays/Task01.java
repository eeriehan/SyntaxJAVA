package com.syntax.class10_Arrays;

public class Task01 {

    public static void main(String[] args) {
        System.out.println("TASK1-1");
        char grade[] = new char[5];
        grade[0] = 'A';
        grade[1] = 'B';
        grade[2] = 'C';
        grade[3] = 'D';
        grade[4] = 'F';

        System.out.println(grade[0]);
        System.out.println("TASK1-2");

        char[] gra = {'A', 'B', 'C', 'D', 'F'};
        System.out.println(gra[0]);

        System.out.println("TASK2-1");

        String name[] = new String[4];
        name[0] = "cortana";
        name[1] = "han jo";
        name[2] = "shiri";
        name[3] = "bixby";

        System.out.println(name[1]);

        System.out.println("TASK2-2");

        String[] ppl = {"cortana", "han jo", "shiri", "bixby"};
        System.out.println(ppl[1]);

        System.out.println("TASK3-1");
        String[] word = {"Java", "Saturday", "day", "coding", "is"};
        System.out.printf(word[1] + " " + word[4] + " " + word[0] + " " + word[3] + " " + word[2]);

        // how to get all values?

        char[] letters = {'A', 'B', 'C', 'D'};
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i] + " ");
        }

// ENHANCED FOR LOOP

        // only when we deal with arrays or collections
        // we can use for each loop, enhanced for loop, advanced for loop

        String[] iceCream = {"vanilla", "chocolate", "pistachio", "kulfi", "mango"};

        for (String flavor : iceCream) {

            System.out.println(flavor);
        }

        // get all elements using regular for loop
        int[] numbers = {12, 56, 345, 1, 0, 9};
        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);
        }
        System.out.println();

        //get all values using enhanced for loop
        for (int num : numbers) {
            System.out.println(num + " ");
        }
        System.out.println();

        //get all values using enhanced for loop
        //this loop always loops ONLY 1 way
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

}
