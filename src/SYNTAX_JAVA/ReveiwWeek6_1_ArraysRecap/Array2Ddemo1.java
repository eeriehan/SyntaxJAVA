package SYNTAX_JAVA.ReveiwWeek6_1_ArraysRecap;

import java.util.Arrays;
import java.util.Scanner;

public class Array2Ddemo1 {

    public static void main(String[] args) {

        String[] individualInRoom1 = new String[]{"Sabej", "Shah", "Mina"};
        String[] individualInRoom2 = new String[]{"Roman", "Mina"};
        String[] individualInRoom3 = new String[]{"Asad", "Paki", "Ali"};
        // an 2D array that will store 3 single d arrays
        String[][] rooms = new String[3][];

        rooms[0] = individualInRoom1;
        rooms[1] = individualInRoom2;
        rooms[2] = individualInRoom3;

        System.out.println(rooms[2][2]);
    }

}
