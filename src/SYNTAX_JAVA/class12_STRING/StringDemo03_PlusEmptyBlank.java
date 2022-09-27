package SYNTAX_JAVA.class12_STRING;

public class StringDemo03_PlusEmptyBlank {
    public static void main(String[] args) {
        String firstName = "Olena";
        String lastName = "Dudka";

        System.out.println(firstName + lastName); // Mostly this is used
        System.out.println(firstName.concat(lastName)); // does similar to + above
        System.out.println(firstName.concat(" ").concat(lastName));

        String str = "     ";
        System.out.println(str.isEmpty()); // ask for boolean. if Empty then True
        System.out.println(str.isBlank()); //
        // isEmpty() returns true if a String is empty. this method will return false even if you have
        // a space in a String variable. however the isBlank() method does not count the spaces

    }
}
