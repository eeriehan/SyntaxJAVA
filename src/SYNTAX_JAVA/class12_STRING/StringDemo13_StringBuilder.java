package SYNTAX_JAVA.class12_STRING;

public class StringDemo13_StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("IJ is Great");
        System.out.println(stringBuilder);
        // when StringBuilder is used. value can be changed but Faster and need more memory.

        stringBuilder.reverse();
        System.out.println(stringBuilder);
        // String does not allow any methods to change the original contents of the variables
        // because String is IMMUTABLE

        String str = "Intellij";
        str.toLowerCase();
        System.out.println(str); // does not change to lower case because used String.

        String country = "USA";
        String home = "USA";
        StringBuilder state = new StringBuilder("New York");
        StringBuilder state2 = new StringBuilder("New York");

    }
}
