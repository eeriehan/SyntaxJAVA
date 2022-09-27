package PracticeBin;

import java.util.Scanner;

public class replitDoodle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuilder[] arr = new StringBuilder[7];
        int i;
        for (i = 0; i <= arr.length - 1; i++) {
            System.out.println("Please enter day " + (i + 1) + " of the week");
            StringBuilder str2 = new StringBuilder(scan.nextLine());
            arr[i] = str2;
        }
        System.out.println("-----------");
        for (int j = 0; j <= arr.length; j++) {
            System.out.println(arr[j]);
        }
    }

}
/*Write a program that creates a String array with size 7.
Ask the user to input Days of a week beginning with Sunday using Scanner class.
Add these inputs to your array and then print all values from that array

**Example Output:**
Please enter day 1 of the week
Sunday
Please enter day 2 of the week
Monday
Please enter day 3 of the week
Tuesday
Please enter day 4 of the week
Wednesday
Please enter day 5 of the week
Thursday
Please enter day 6 of the week
Friday
Please enter day 7 of the week
Saturday*/