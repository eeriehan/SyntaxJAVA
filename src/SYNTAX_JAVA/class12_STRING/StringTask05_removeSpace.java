package SYNTAX_JAVA.class12_STRING;

public class StringTask05_removeSpace {
    public static void main(String[] args) {
        String str = "Let's not give up this time.";
        System.out.println(str.replaceAll(" ", ""));
        //or
        str=str.replaceAll(" ", "");
        System.out.println(str);
    }
}
/*Create a String that will hold a sentence. Write a program to get a new String without any spaces*/
