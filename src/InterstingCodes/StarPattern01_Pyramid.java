package InterstingCodes;

import java.util.*;

public class StarPattern01_Pyramid {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Tri-Loops# : ");
		int input = scan.nextInt();
		
		System.out.println();

		for (int a = 1; a <= input; a++) {
			for (int b = input; b >= a; b--) {
				System.out.print(" ");
			}

			for (int b = 1; b <= a; b++) {
				System.out.print("* ");
			}

		System.out.println();

		}
	}
}
// Star pyramid using - for loop