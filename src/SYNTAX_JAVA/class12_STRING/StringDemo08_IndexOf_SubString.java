package SYNTAX_JAVA.class12_STRING;

public class StringDemo08_IndexOf_SubString {
    public static void main(String[] args) {
        String str = "Why am i always so confused";

        System.out.println(str.indexOf("a")); // .indexOf() counts first location of a letter.
        System.out.println(str.indexOf("s"));
        System.out.println(str.indexOf(" "));

        System.out.println(str.substring(2)); // .substring starts from assigned location
        // .substring() give you smaller string from a String we can start the starting part to this
        // method, and it will return us the substring from that index.

        System.out.println(str.substring(2, 10));
        int num = 1231231;
        String numStr = String.valueOf(num).substring(1, 3);

        System.out.println(numStr);  // how to .substring() to Integer
        num = Integer.parseInt(numStr);
        System.out.println(num);
    }
}
