package SYNTAX_JAVA.ReveiwWeek7_StringClass;

import java.util.Arrays;

public class StringRecap01 {
    public static void main(String[] args) {
        String str = "lkjlkjasflkj@#()!)(390290r5)(@$)";
        str = str.replace("[^a-zA-z]", "");
        System.out.println(str);
        System.out.println("str = " + str);

        String sentence = "Batch 14 is Great. batch 14 is excellent. Batch 14 is just amazing";
        String[] split = sentence.split("[.!?]");
        System.out.println("split = " + Arrays.toString(split));

        String str2 = "Batch 14 is Great.Batch 14 is Great";
        String replace = str2.replaceFirst("Great", "Good");
        System.out.println(replace);


    }
}


