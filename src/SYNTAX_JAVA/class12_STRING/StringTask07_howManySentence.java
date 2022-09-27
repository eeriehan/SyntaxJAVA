package SYNTAX_JAVA.class12_STRING;

public class StringTask07_howManySentence {
    public static void main(String[] args) {
        String a = "Is it saturday ? Is it raining?Do we have a Java Class today ?";

        String[] strArr = a.split("[.?!]");
        System.out.println(a);
        System.out.println("above line contains " + strArr.length + " sentences.");
    }
}
/*You have a String
a=”Is it saturday? Is it raining? Do we have a Java Class today?”
How would you find out how many sentences are in that String?

 */
