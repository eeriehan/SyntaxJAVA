package ReveiwWeek3_SwitchCases;

import java.applet.AppletStub;
import java.util.Scanner;

public class recap01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // Explicit/narrowing/Manual
        // As we can't fit 129 in byte we will get wrong results
        short largerBox = 129;
        byte smallerBox = (byte) largerBox;
        System.out.println(smallerBox);

        // Explicit/narrowing/Manual
        // As we can fit 129 in short we will get proper results
        int largerBox1 = 129;
        short smallerBox2 = (short) largerBox1;
        System.out.println(smallerBox2);

        // Implicit/widening/Automatic
        short smallerBox3 = 45;
        long largerBox3 = smallerBox3;
        System.out.println(largerBox3);

        /**
         * when we have to check if a box contains a value or not we can use == or
         * .equals() when the data type if primitive we use == like char int short, etc.
         * when the datatypes are non-primitive like String we use .equals()
         */

        String uN = "Admin";
        String pW = "password123";
        if (pW.equals("password123")) {
            System.out.println("Welcome " + uN);
        } else {
            System.out.println("Wrong password " + uN);
        }

        /**
         * if we need one outcome based on if conditions we use if if the outcomes are
         * two we use if else if outcoms are more than that we can use if else if
         */

        int num = 10;

        if (num == 10) {
            System.out.println("number is 10");
        } else if (num == 20) {
            System.out.println("number is 20");
        } else if (num == 30) {
            System.out.println("number is 30");
        } else {
            System.out.println("number is not valid");

        }

        // Nested If
        /**
         * Nested if-conditions are conditions which are dependent on each other if
         * outer condition is not true inner-condition is never checked inner-conditions
         * are only checked when outer-condition is passed
         */
        int money = 12;

        if (money > 10) { // outer conditions
            System.out.println("Lets buy some eggs");

            int noOfEggs = 2;

            if (noOfEggs > 0) {
                System.out.println("lets boil the eggs");
            }

        }
        // ============================================================

        boolean studyHard = true;

        if (studyHard) {
            System.out.println("we get the job in first few weeks ");

            boolean goodComSkill = true;

            if (goodComSkill) {
                System.out.println(" can might get job in Apple Amazon, etc.");
            } else {
                System.out.println("it might take longer to get the job");
            }

        }

        Scanner scan = new Scanner(System.in);

        System.out.println("Pelease Enter your age");
        int age = scan.nextInt();

        System.out.println("Pelease Enter your name");

        scan.nextLine();

        String name = scan.nextLine();


        System.out.println(name + " is " + age + " years old");
/**
 * nextLine is a special method that can capture spaces and enters as well
 * when we use any method like nextInt() or nextBoolean(), nextDouble() and after that if we use
 * nextLine() we need to discard that enter by using an extra nextLine() call
 */

    }


}

