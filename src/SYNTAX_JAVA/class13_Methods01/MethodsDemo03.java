package SYNTAX_JAVA.class13_Methods01;

public class MethodsDemo03 {

    boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        MethodsDemo03 md = new MethodsDemo03();

        if (md.isEven(4)) {
            System.out.println("Number is Even");

        } else {
            System.out.println("Number is Odd");

        }
    }
}
