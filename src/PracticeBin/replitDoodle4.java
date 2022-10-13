package PracticeBin;

import java.util.Scanner;

public class replitDoodle4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String givenString = inp.nextLine();
        //write your code below

        String reverseStr = "";
        givenString = givenString.replaceAll(" ", "");
        for (int i = givenString.length()-1; i >= 0; i--) {
            reverseStr = reverseStr + givenString.charAt(i);
        }
        givenString.equalsIgnoreCase(reverseStr);
        if (givenString.equalsIgnoreCase(reverseStr)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }
}
