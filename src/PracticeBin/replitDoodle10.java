package PracticeBin;

public class replitDoodle10 {
    static String mixString(String s1, String s2){
        for (int i=0; i<(Math.max(s1.length(), s2.length())); i++){ // web sourced.
            if(i < s1.length()){
                System.out.print(s1.charAt(i));
            }
            if(i < s2.length()) {
                System.out.print(s2.charAt(i));
            }}
        return s1;
    }

    //test case below (dont change):
    public static void main(String[] args) {
        String firstValue = mixString("12345", "abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy", "hello");
        System.out.println(secondValue);
    }}

