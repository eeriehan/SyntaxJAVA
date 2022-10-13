package SYNTAX_JAVA.class13_Methods01;

public class MethodsDemo02 {

    void printManyTimes(int times){
        for (int i=0; i < times; i++) {
            System.out.println("Hello Java");
        }

    }
    // in parameters sequence and data type matters.**
    void printCustomWordManyTimes(String word, int times) { // <---
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        MethodsDemo02 md = new MethodsDemo02();
    //    md.printManyTimes(2);
        md.printCustomWordManyTimes("Goodbye Java", 3);
    }
}
