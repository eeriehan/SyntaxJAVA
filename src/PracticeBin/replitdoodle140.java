package PracticeBin;

public class replitdoodle140 {
    public static void main(String[] args) {
        String[] arr = {"hey", "yolo", "hi", "this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }

    static String maxLength(String[] array) {
        String largestStringSoFar = "";


        for (int i = 0; i < array.length; i++) {
            if (largestStringSoFar.length() < array[i].length()) {
                largestStringSoFar = array[i];
            }
        }
        return largestStringSoFar;
    }
}
/*Create the maxLength method
that will accept String array of words
and return the word with the largest length.
Method should visible only within same package!
**Expected Output:**

this is long*/

