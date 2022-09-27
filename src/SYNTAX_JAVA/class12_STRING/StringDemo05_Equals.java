package SYNTAX_JAVA.class12_STRING;

public class StringDemo05_Equals {
    public static void main(String[] args) {

        String str = "Shah";    // store id=20.
        String str2 = "Shah";   // store id=20.
        String str3 = new String("Shah");    // store id=30.


        if (str.equals(str2)) {   // checks contents and name of variable.
            System.out.println("I found it");
        }
        if (str == str2) {    // does not go inside and check the contents.
            System.out.println("I found it");
        }
        if (str.equalsIgnoreCase("Shah")) {   // checks contents and name of variable.
            System.out.println("I found it with .equalsIgnoreCase");
            /* .equals() checks if two Strings are exactly the same with exact same case
             * .equalsIgnoreCase checks if two Strings are exactly the same with exact same case
             *  but does not care about the case of letters.
             * */
        }
    }
}

