package InterstingCodes;

public class AlphabeticPattern02 {

	public static void main(String[] args) {
		int letter = 65; // ASCII value of capital A is 65
		// inner loop for rows
		for (int i = 0; i <= 9; i++) {
			// outer loop for columns
			for (int j = 0; j <= i; j++) {
				// prints the character
				System.out.print((char) letter + " ");
			}
			letter++;
			System.out.println();
		}
	}

}
