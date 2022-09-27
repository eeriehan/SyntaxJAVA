package SYNTAX_JAVA.class12_STRING;

public class StringDemo01_Length {
    public static void main(String[] args) {
        String str = new String("Java");    // <= proper way of creating an object
        String name = "Java";  // <= preferable! simpler & shorter & life easier
        // about two code are pretty much same. #6 converts to #5 at behind
        // Only works for String and Wrapper classes


        // .length() <= Counts the number of characters in a string including the spaces
        System.out.println(str.length());
        System.out.println(name.length());
        String name1 = "Han Jo the IT-GRU";
        if (name.length() < 8) {
            System.out.println("Name can't be more than 15 characters");

        }


    }

}
