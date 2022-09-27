package SYNTAX_JAVA.class12_STRING;

public class StringDemo04_NavigatingString {
    public static void main(String[] args) {
        String str = "             i love java       !!!       ";
        System.out.println(str);
        /* Remove the spaces before and after the String
        but not the ones which are present in between*/
        System.out.println(str.trim());

        String str2 = "Java is very easy";
        /*  startsWith()    =>  Checks if a String starts with a specific letter or word
        *   endsWith()      =>  Checks if a String Ends with a specific letter or word
        *   contains()      =>  Checks if a String Contains a specific letter or word */
        System.out.println(str2.startsWith("J"));
        System.out.println(str2.startsWith("j")); // false. because Lowercase

        System.out.println("------------------");

        System.out.println(str2.endsWith("y"));
        System.out.println(str2.endsWith("Y")); // false. because Uppercase

        System.out.println("------------------");

        System.out.println(str2.contains("very"));
        System.out.println(str2.contains("Very")); // case-sensitive thus False
        System.out.println(str2.toLowerCase().contains("Very"));
                // .toLowerCase() convert than check if it contains letter or word.
        // It's called [Method chaining].
        // helps us call multiple methods on a single line one method after one other.

    }
}
