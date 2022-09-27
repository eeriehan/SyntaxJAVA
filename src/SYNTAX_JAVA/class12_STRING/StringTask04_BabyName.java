package SYNTAX_JAVA.class12_STRING;

import java.util.Scanner;

public class StringTask04_BabyName {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the name of mother?");
        String motherName = scan.next();
        System.out.println("Please Enter the name of father?");
        String fatherName = scan.next();
        System.out.println("Are you expecting a boy? true or false");
        boolean isBoy = scan.nextBoolean();

        String firstHalf;
        String secondHalf;

        if (isBoy) {
            firstHalf = fatherName.substring(0, fatherName.length() / 2);
            secondHalf = motherName.substring(motherName.length() / 2);
            System.out.println(firstHalf + secondHalf);   //  Danry
        } else {
            firstHalf = motherName.substring(0, motherName.length() / 2);
            secondHalf = fatherName.substring(fatherName.length() / 2);
            System.out.println(firstHalf + secondHalf);
        }
    }
}
/*Write a program that reads two people's first names and if they're expecting boy or girl?
Based on the input, program should suggest a name for a baby:
(combination of dad and mom name)

Example Output:
Mom’s first name?       Mary
Dad’s first name?       Daniel
Boy or Girl?            boy
Suggested baby name:    DANRY

Example Output:
Mom’s first name?       Mary
Dad’s first name?       Daniel
Boy or Girl?            girl
Suggested baby name:    MAIEL*/
