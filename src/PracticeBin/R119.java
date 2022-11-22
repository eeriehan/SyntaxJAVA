package PracticeBin;

public class R119 {
    void censorLetter(String str, char cha) {
        System.out.println(str.replaceAll(String.valueOf(cha), "*"));

    }

    public static void main(String[] args) {
        R119 parameters = new R119();
        parameters.censorLetter("computer science",'e');
        parameters.censorLetter("trick or treat",'t');
    }

}


