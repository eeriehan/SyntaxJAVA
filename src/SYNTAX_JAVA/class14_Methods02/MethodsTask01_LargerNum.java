package SYNTAX_JAVA.class14_Methods02;

import java.util.Scanner;

public class MethodsTask01_LargerNum {
    static void printLarger(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("num1 is larger " + num1);
        } else if (num2 > num1) {
            System.out.println("num1 is larger " + num2);
        } else {
            System.out.println("numbers are equal");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter the first Numbers");
        int number1 = scan.nextInt();
        System.out.println("Please Enter the second Numbers");
        int number2 = scan.nextInt();
        MethodsTask01_LargerNum task1 = new MethodsTask01_LargerNum();
        MethodsTask01_LargerNum.printLarger(number1, number2);
        MethodsTask01_LargerNum.printLarger(50, 12);
    }
}
// Create a method that will take 2 parameters as a numbers and prints which number is larger.
