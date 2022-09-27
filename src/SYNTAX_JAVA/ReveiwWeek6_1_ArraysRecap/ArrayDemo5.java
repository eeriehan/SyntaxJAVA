package ReveiwWeek6_1_ArraysRecap;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter the number of dresses you want to buy");
        int numOfDresses = scan.nextInt();

        double[] prices = new double[numOfDresses];

        for (int i = 0; i < numOfDresses; i++) {
            System.out.println("PLEASE ENTER THE PRICE OF DRESS NO " + i + 1);
            prices[i] = scan.nextDouble();
        }
        System.out.println(Arrays.toString(prices));
        //Limitations of enhanced for loop
        // we can only go in one direction
        // we can't skip the elements
        // we can't use enhanced for loop to update the elements in an array
        // we can only use it to access the elements.
        double sum = 0;
        for (double price : prices) {
            sum += price;        //	sum=sum+price
        }
        System.out.println("Total for all the dresses = " + sum);
    }

}
