package SYNTAX_JAVA.class12_STRING;

public class StringTask02_FindMiddle {
    public static void main(String[] args) {
        String str = "SYNTAXSDETBATCH14";

        int length = str.length();

        if (!str.isEmpty() && length % 2 != 0 && length >= 3) {
            int middleIndex = length / 2;
            System.out.println(str.charAt(middleIndex));

        }
    }
}
/*Create a String and if the String is not empty perform the following:
if the String has an odd number of characters and has 3 or more characters,
print the character in the middle of the String.*/
