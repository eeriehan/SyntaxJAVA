package PracticeBin;

import java.util.Scanner;

public class replitDoodle1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[] = new int[5];
        int i;
        for (i = 0; i < arr.length; i++) {
            int temp = scan.nextInt();
            arr[i] = temp;
           // System.out.println();
        }

        for (int j =0; j <= arr.length-1; j++) {
            System.out.println(arr[j]*10);
        }
    }
}
