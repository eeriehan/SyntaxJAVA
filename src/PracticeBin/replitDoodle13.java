package PracticeBin;

public class replitDoodle13 {
    static char thirdLetter(String a) {
        for (int i = 0; i < a.length(); i++) {
            if (i % 3 == 0) {
                char what = a.charAt(i);
                String the = String.valueOf(what);
                System.out.print(the.trim());
            }
        }
        return 0;
    }
    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly
  //      thirdLetter("hello there");

    }
}


