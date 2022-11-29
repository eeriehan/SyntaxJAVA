package PracticeBin;

import java.util.Arrays;

public class R216 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arraySumToZero(5)));
    }

    public static int[] arraySumToZero(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i += 2) {
            array[i] = n / 2 + i / 2;
            if (i < (n - 1)) {
                array[i + 1] = -(n / 2 + i / 2);
            } else {
                array[i] = 0;

            }

        }
        return array;
    }
}
