package SYNTAX_JAVA.class12_STRING;

public class StringDemo09_Replace {
    public static void main(String[] args) {

        String str = "Batch 14 is good 312131321312!@#!$!$ !@good#aASDFAFD";
        /*
        replace()       method replaces one String with another in a String
        replaceAll()    method takes a pattern and replace all the characters that follow that pattern
         */
        System.out.println(str.replace("good", "piece of shit"));
        System.out.println(str);

        System.out.println("---------------");

        System.out.println(str.replaceAll("[a-z]", ""));

        System.out.println("---------------");

        String str2 = "SomeTimes I really want to say, Fuck you ^%$%##@@%&* 123123123545";
        // search and replace selected.
        // follows Asci table for range info
        System.out.println(str2.replaceAll("[0-9]", "@"));  //remove all letters a-z
        System.out.println(str2.replaceAll("[0-5]", "@"));
        System.out.println(str2.replaceAll("[a-z]", "@"));
        System.out.println(str2.replaceAll("[0-Z]", "@"));
        System.out.println(str2.replaceAll("[^A-Z]", "@")); // ^ ,= same as !, not.
        System.out.println(str2.replaceAll("[^a-zA-Z]", "@"));
        System.out.println(str2.replaceAll("[^a-zA-Z0-9]", "@"));
            //Remove all letters  other than A to Z and a to z and 0 to 9

    }
}
