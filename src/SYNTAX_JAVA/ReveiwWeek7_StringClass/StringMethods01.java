package SYNTAX_JAVA.ReveiwWeek7_StringClass;

public class StringMethods01 {
    public static void main(String[] args) {

        String str = "hello"; //reference String.

        //toUpperCase or toLowerCase

        str.toUpperCase();
        System.out.println(str); //hello.

        System.out.println("--------------");


        str=str.toUpperCase();
        System.out.println(str); //HELLO.

        //length() -> Returns the length of this string.
        int size = str.length();
        System.out.println(size);

        //charAt() -> Returns the char value at the specified index

        char letter = str.charAt(3);
        System.out.println(letter);

        //How to get last Character
        char lastCharacter = str.charAt(str.length() - 1);
        System.out.println(lastCharacter);  //0

        //indexOf - Returns the index within this string of the first occurrence of index value
        int index=str.indexOf(lastCharacter);
        System.out.println(index);

        System.out.println(str.indexOf('e')); // -1
        System.out.println(str);

        //isEmpty() -   returns true if length is more than 0.
        boolean empty = str.isEmpty();
        System.out.println(empty);

        //trim()    -   remove spaces: before the string and after the string

        //
    }
}
