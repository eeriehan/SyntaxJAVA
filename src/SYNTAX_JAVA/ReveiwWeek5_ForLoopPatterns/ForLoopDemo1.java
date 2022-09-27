package ReveiwWeek5_ForLoopPatterns;

public class ForLoopDemo1 {

    public static void main(String[] args) {
// 1 3 7 9 ...
        for (int u = 1; u <= 9; u += 2) {
            if (u != 5) { // or if(i++5) { continue; }
                System.out.println(u);
            }
        }
        System.out.println("___________");

        for (int k = 1; k <= 12; k += 2) {
            if (k == 5) {
                continue;
            }
            System.out.println(k);

        }
    }
}
