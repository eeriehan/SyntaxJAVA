package PracticeBin;

public class replitDoodle15 {
    public static int countA(String s){
        String aa = s.replaceAll("[^aA]", "");
        return aa.length();

    }
    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(countA("aaA")); //3
        System.out.println(countA("aaBBdf8k3AAadnklA")); //6
    }
}


