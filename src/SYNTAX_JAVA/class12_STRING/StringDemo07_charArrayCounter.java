package SYNTAX_JAVA.class12_STRING;

import java.util.Arrays;

public class StringDemo07_charArrayCounter {
    public static void main(String[] args) {
        String str = "I love java programming";
        char[] charArray = str.toCharArray();
        // toCharArray will convert a String to an array of chars

        System.out.println(charArray[5]);
        System.out.println(Arrays.toString(charArray));

        int counter = 0;
        for (char c : charArray) {
            if (c == 'a') {
                counter++;
            }
        }
        System.out.println("letter a has appeared " + counter + " times");
    }
}
