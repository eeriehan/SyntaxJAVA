package PracticeBin;

public class replitDoodle2 {
    public static void main(String[] args) {
        int[][] a = {  // -5, -3, 1, 3
                {-5, -2, -3, 7},
                {1, -5, -2, 2},
                {1, -2, 3, -4}
        };
        int i;
        int j;
        int sum = 0;
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    sum = sum + a[i][j];
                }
            }
        }                // -5 -3 1 3
        System.out.println(sum);
    }
}

