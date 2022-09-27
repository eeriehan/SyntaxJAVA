package SYNTAX_JAVA.class12_STRING;

public class StringDemo06_charAt {
    public static void main(String[] args) {

        String str = "I love java programming";

        System.out.println(str.charAt(2));
        // .charAt returns us the character at a specific index.

        for (int i = 0; i < str.length(); i++) {
        // print only the characters not spaces.
            if (!(str.charAt(i) == ' ')) {
                System.out.print(str.charAt(i));

            }
        }
    }
}
