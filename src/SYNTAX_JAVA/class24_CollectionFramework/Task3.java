package SYNTAX_JAVA.class24_CollectionFramework;

import java.util.ArrayList;

public class Task3 {
    /* Create an arrayList of even numbers from 1 to 500.
    Remove any number that is divisible by 5 from that arrayList. */
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 2; i <= 500; i = i + 2) {
            numbers.add(i);
//for(int i=0; i<500; i++){
//        if (i%2==0){
//could be above but adopt more efficient way
        }
        System.out.println(numbers);

        var iter = numbers.iterator();

        while (iter.hasNext()) {
            Integer num=iter.next();
            if (num % 5 == 0) {
                iter.remove();
            }
        }
        System.out.println(numbers);
    }
}
/*ArrayList faster to get data
LinkedList faster to add/remove data*/
