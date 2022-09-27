package SYNTAX_JAVA.class12_STRING;

import java.util.Arrays;

public class StringDemo10 {
    public static void main(String[] args) {
        String str = "Today is Sunday";
        String day = str.substring(9);
        System.out.println(day);
        System.out.println(str.substring(6, 8));
        char c = str.charAt(4); // calling the method charAt on str object
        System.out.println();

        char[] charArr = str.toCharArray();
        System.out.println(Arrays.toString(charArr)); // print all char in String
        System.out.println(charArr);

        int index = str.indexOf("a"); // locating where A is in String
        System.out.println(index);
        System.out.println(str.indexOf("a", 6));

    }
}
