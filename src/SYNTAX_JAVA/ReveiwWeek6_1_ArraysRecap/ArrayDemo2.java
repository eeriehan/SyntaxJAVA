package ReveiwWeek6_1_ArraysRecap;

import java.util.Arrays;

public class ArrayDemo2 {

    public static void main(String[] args) {

        int[] arr = new int[]{10, 20, 30};
        // last index is always sized -1 because arrays index start from zero.
        System.out.println(arr.length);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 20;
        }
        System.out.println(Arrays.toString(arr));

    }

}
