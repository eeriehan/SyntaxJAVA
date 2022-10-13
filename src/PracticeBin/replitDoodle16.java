package PracticeBin;

public class replitDoodle16 {
    public static String surround(String s, String search_term){
        String aa = "("+search_term+")";
        String ss = s.replaceAll(search_term, aa);
        return ss;
    }

    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(surround("abcabcabc","c")); //"ab(c)ab(c)ab(c)"
        System.out.println(surround("technology","o")); //"techn(o)l(o)gy"
    }
}


