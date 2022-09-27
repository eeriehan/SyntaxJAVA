package SYNTAX_JAVA.class10_Arrays;

public class Hw05CharReverse {

    public static void main(String[] args) {

        char letters[] = new char[3];

        letters[0] = 'a';
        letters[1] = 'b';
        letters[2] = 'c';

        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.println(letters[i] + " ");


        }
    }

}


/*
 * Create an array to store char values and then print those in reverse order
 */
