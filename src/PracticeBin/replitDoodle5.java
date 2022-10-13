package PracticeBin;

import java.util.Scanner;

public class replitDoodle5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String names[] = new String[5];
//        names[0] = "";
//        names[1] = "";
//        names[2] = "";
//        names[3] = "";
//        names[4] = "";
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter five names, longer than 5 letters:");
            names[i] = scan.nextLine();
        }
        for (int i = 0; i < names.length; i++) {

            System.out.println((names[i].substring(0, 3)));
        }
    }
}

