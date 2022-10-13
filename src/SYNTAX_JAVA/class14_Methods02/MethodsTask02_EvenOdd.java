package SYNTAX_JAVA.class14_Methods02;

public class MethodsTask02_EvenOdd {

    void printEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");

        }
    }

    public static void main(String[] args) {
        MethodsTask02_EvenOdd task = new MethodsTask02_EvenOdd();
        task.printEvenOdd(45);
        task.printEvenOdd(50);
    }

}
// Create a method that will take a number and prints whether the number is even or odd.
