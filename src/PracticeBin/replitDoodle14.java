package PracticeBin;

public class replitDoodle14 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4},
                {4, 5, 6, 7},
                {1, 3, 5, 7}
        };
        reduce10(a);
    }

    //create method reduce10 here
    static void reduce10(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
               int b = a[i][j] - 10;
                System.out.print(b+" ");
        }
            System.out.println();

        }
}}
/*Complete the reduce10 method by making it
subtract 10 from every element of the double array nums.
The method should static and it should return a new 2D array object
Print values from new array in the format below
input
1 2 3 4
4 5 6 7
1 3 5 7

**Expected Output:**
-9 -8 -7 -6
-6 -5 -4 -3
-9 -7 -5 -3*/


