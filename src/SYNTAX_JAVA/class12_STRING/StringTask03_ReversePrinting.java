package SYNTAX_JAVA.class12_STRING;

public class StringTask03_ReversePrinting {
    public static void main(String[] args) {
        String str = "Sunday";

        for (int i = str.length()-1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        char[] charArr = str.toCharArray();
        for (int i = charArr.length - 1; i >= 0; i--) {
            System.out.print(charArr[i]);

        }
    }
}
/*Create a String and print it in reverse order (Sunday → yadnuS).*/
