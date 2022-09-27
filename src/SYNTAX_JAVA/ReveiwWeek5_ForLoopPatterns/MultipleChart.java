package ReveiwWeek5_ForLoopPatterns;

public class MultipleChart {

    public static void main(String[] args) {
        // 구구단
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + "=" + (i * j));

            }
            System.out.println();
        }
    }

}
