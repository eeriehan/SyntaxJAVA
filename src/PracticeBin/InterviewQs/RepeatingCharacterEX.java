package PracticeBin.InterviewQs;

public class RepeatingCharacterEX {
    public static void main(String[] args) {

    }

    int findRepeatingCharacter(char[] arr, char target) {
        int counter=0;
        for (char c : arr) {
            if (target == c) {
                counter++;
            }
        }
        return counter;
    }

}
