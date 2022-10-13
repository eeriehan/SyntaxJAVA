package SYNTAX_JAVA.class13_Methods01;

public class MethodsDemo01 {


    void printHello(){   // A Method that does not take any parameters and prints some lines on the console
        System.out.println("Hello World");
        System.out.println("Hello Java");
        System.out.println("Hello Aladin");
        }

        void printWord(String word){ // A Method that takes a single parameter of type String and prints it
            System.out.println(word);
        }

    public static void main(String[] args) {
        MethodsDemo01 obj = new MethodsDemo01();
        obj.printHello();
        obj.printWord("Taivion Don't worry its Java");
        obj.printWord("No!!!!!!! Athira it does not make sense");
    }
}
