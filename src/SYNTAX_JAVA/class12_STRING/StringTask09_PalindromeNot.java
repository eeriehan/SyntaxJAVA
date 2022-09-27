package SYNTAX_JAVA.class12_STRING;

import java.util.Scanner;

public class StringTask09_PalindromeNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Do you even know what palindrome is?");
        System.out.println("Let's see if you are any smart...give a word here:");

        String str = scan.nextLine();
        String reverseStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.equals(reverseStr)) {
            System.out.println("Given word " + str + " is palindrome.");
        } else {
            System.out.println("Given word " + str + " is Not palindrome.");
        }

    }
}
/*How would you check if String is palindrome or not?
    a word, phrase, or sequence that reads the same
    backward as forward, e.g., madam or nurses run.

    aba=> true
    Abbc =>false
 */
