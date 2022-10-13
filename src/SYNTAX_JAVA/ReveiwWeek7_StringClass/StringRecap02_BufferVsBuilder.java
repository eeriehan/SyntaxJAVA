package SYNTAX_JAVA.ReveiwWeek7_StringClass;

public class StringRecap02_BufferVsBuilder {
    public static void main(String[] args) {
        StringBuilder stb = new StringBuilder("Today is java class");
        // StringBuilder:   Mostly used class newer better faster
        StringBuffer stbf = new StringBuffer("Today is Java Class");
        // StringBuffer:    Older one slow and not used mostly

        //If we want to convert the String to a StringBuilder we can use the below Syntax

        String str = "Java is very easy"; //convert String -> StringBuilder
        StringBuilder stb1 = new StringBuilder(str);
        //If we want to convert from a StringBuilder to A string we can use the below Syntax

        System.out.println("stb1 = " + stb1);
        String newStr = stb1.toString();


    }
}


