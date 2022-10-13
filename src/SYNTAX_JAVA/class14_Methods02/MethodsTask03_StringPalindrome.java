package SYNTAX_JAVA.class14_Methods02;

public class MethodsTask03_StringPalindrome {

    void printPalindrome(String str) {
        str = str.toLowerCase();
        StringBuilder stb = new StringBuilder(str);
        stb.reverse();
        if (stb.toString().equals(str)) {
            System.out.println("The String is Palindrome");
        } else {
            System.out.println("The String not Palindrome");
        }
    }

    public static void main(String[] args) {
        MethodsTask03_StringPalindrome task = new MethodsTask03_StringPalindrome();
        task.printPalindrome("Dad");
        task.printPalindrome("Thor");

    }




}
// Create a method that will print whether given String is palindrome or not
