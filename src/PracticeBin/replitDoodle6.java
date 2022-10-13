package PracticeBin;

public class replitDoodle6 {
    public static void main(String[] args) {
        StringBuffer stf = new StringBuffer();
        String stf1;
        stf.append("Hello");
        stf.append(" ");
        stf.append("World");

        for (int i = 0; i < stf.length(); i++){
            char c = stf.charAt(i);
            stf.setCharAt(i, Character.toUpperCase(c));
        }
        System.out.print(stf);
    }
}

