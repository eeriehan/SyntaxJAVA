package SYNTAX_JAVA.class12_STRING;

public class StringTask06_CountLetters {
    public static void main(String[] args) {
    /*    String str = "ABC abc 123 !@#";
        int num = 0;
        for (int i = 0; i <= str.length(); i++) {
            if (str.contains("[a-zA-Z0-9]")) {
                num=num+1;
            }
        }
        System.out.println(num); */

        String str2 = "I tr!ed 123123123 TIMEs Wh% IS iT N@t W@^k!n@?";
        String altStr2 = str2.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(altStr2);
        System.out.println("Alphanumeric in this String: "+altStr2.length());
    }
}
/*Create a String that should be combination of letters, numbers and special characters.
Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
 */
