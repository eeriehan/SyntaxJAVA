package SYNTAX_JAVA.class17_Constructors;

public class ThisKeywordDemo {
    String str="Red";

    void print(){
        String str="Blue";

        System.out.println(this.str);
        System.out.println(str);
    }

    public static void main(String[] args) {
        new ThisKeywordDemo().print();
    }
}