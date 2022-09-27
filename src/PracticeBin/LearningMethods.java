package PracticeBin;

public class LearningMethods {
    public static void main(String[] args) {

        int a = 5;                  // hard coding. takes time....
        int b = 10;
        System.out.println(a * b);

        System.out.println("----------------");

        multiply(5, 10);
        multiply(556, 10);
        multiply(5, 1012);
        welcome();
        divide(10, 5);
        divide(10444, 5);
        divide(103333, 5);
    }
    // instead, create methods and call it where you want.
    public static void welcome() {
        System.out.println("Welcome to our calculator!");
    }

    public static void multiply(int a, int b) {
        System.out.println(a * b);
    }

    public static void divide(int a, int b) {
        System.out.println(a / b);
    }
}
