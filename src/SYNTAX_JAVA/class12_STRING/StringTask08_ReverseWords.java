package SYNTAX_JAVA.class12_STRING;

public class StringTask08_ReverseWords {
    public static void main(String[] args) {
        String trs = "This is sentence i want to reverse"; //33-1
        int i;
        System.out.println(trs);

        for (i = trs.length() - 1; i >= 0; i--) {
            System.out.print(trs.charAt(i));
        }
        System.out.println();
        System.out.println("--------------");

        String[] strArr = trs.split(" "); //array by " "

        System.out.println("--------------");
        for (int r = 0; r < strArr.length; r++) {   //Best answer.
            StringBuilder rev = new StringBuilder(strArr[r]);
            System.out.print(rev.reverse() + " ");
        }
        System.out.println();
        System.out.println("--------------"); // not sure how to add space
        for (int j = 0; j <= strArr.length; j++) {
            for (int k = strArr[j].length() - 1; k >= 0; k--) {
                System.out.print(strArr[j].charAt(k));
            }
        }
        System.out.println("--------------"); // Asghar demo

        String[] asg = trs.split(" ");
        StringBuilder st = new StringBuilder();
        for (int k = 0; k < asg.length; k++) {
            String word = asg[i];
            StringBuilder stb = new StringBuilder(word);
            stb.reverse();
            asg[i] = stb.toString();
            st.append(asg[i]).append(" "); // need to figure out. why " " didn't added. in answer.
        }
        System.out.println("asg"+ asg);
    }
}
/*How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever

 */
