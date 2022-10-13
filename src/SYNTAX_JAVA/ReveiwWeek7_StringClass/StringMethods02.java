package SYNTAX_JAVA.ReveiwWeek7_StringClass;

public class StringMethods02 {
    public static void main(String[] args) {


        String textFromApplication = "   Enroll today     ";
        String textFromUserStory = "Enroll today";

        if (textFromApplication.trim().equals(textFromUserStory)) {
            System.out.println("text is matched.Test Pass");
        } else {
            System.out.println("Text is NOT matched. Test Failed");
        }
        System.out.println(textFromApplication.trim());
        System.out.println(textFromApplication);

        //Substring
        System.out.print("----------------------------------");
        String str = "Hello Class";
        String part2 = str.substring(6); //Class
        System.out.println(part2);

        String part1 = str.substring(0, 5);
        System.out.println(part1);

        //concat
        System.out.print("----------------------------------");
        String newString = part1.concat(" ").concat(part2);
        System.out.println(newString);

        System.out.println(part1 + part2);

        // some examples

        char single = newString.substring(6).charAt(0);
        System.out.println(single);

        //   newString.charAt(0).substring(6); //CE: char and Substring cant not work.
        // char is primitive: String is Non-primitive

        //replace();    :Replaces each substring of this string that matches target
        //              Sequence with the specified replacement sequence.
        System.out.print("----------------------------------");
        String myString = "Today is September";
        myString = myString.replace("September", "October"); // replaces if find
        System.out.println(myString);

        myString = myString.replace("T", "Yes");
        System.out.println(myString);
        //Does not replace if not Found.

        // split(); : split
        System.out.print("----------------------------------");


        String mystr = "Today is a review class";
        String[] arry = mystr.split(" ");
        System.out.println(arry.length);    // return as 5
        System.out.println(arry[3]);    //Print "review"

        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i]+" ");
        }
            //other way
        System.out.print("----------------------------------");
        for (String arr : arry) {
            System.out.println(arr);
        }


    }
}
