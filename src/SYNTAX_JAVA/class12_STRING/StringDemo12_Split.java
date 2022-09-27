package SYNTAX_JAVA.class12_STRING;

import java.util.Arrays;

public class StringDemo12_Split {
    public static void main(String[] args) {

        String str = "Batch 14 is really good";
        String[] arr=str.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
        System.out.println(arr[3]);

        String str2 = "Today is Sunday. Sunday is good. Java is also good. fml";
        String[] arr2 = str2.split("[.]"); // split on every [.]
        System.out.println(Arrays.toString(arr2));

    }

}
