package SYNTAX_JAVA.ReveiwWeek13_CollectionsFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListsDemo {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Dog"); // when we use the simple add method that takes one parameter
        animals.add("Cat"); // elements are added at the end of the List
        animals.add("Lion");
        animals.add("Monkey");
        animals.add("Tiger");
        animals.add("Panda");
        animals.add("Horse");
        System.out.println(animals);

        System.out.println("---------size of Each word--------------");
        // how to print the size of Each word from this list?

        for (String animal : animals) {
            System.out.println(animal.length());    // .length() used. animal is String type.
        }

        System.out.println("-------remove words which have less or equal to 3 letters----------------");
        // how can we remove words which have less or equal to 3 letters?

        animals.removeIf(x -> x.length() <= 3);  // lambda!!!!
        System.out.println(animals);

        System.out.println("-----more than 5 letters----replace that with Camel--------------");
        // if element is more than 5 letters we want to replace that with Camel

        /*
         Note:  -When simply Replacing, we should not use 'Iterator', because we are not performing any
                 operation that can change the size of the List.

                -We should not use 'enhanced for-loop here'. As we are not printing the data,
                 We are updating the data as we need the index to update the data

                -We should use simple for loop
         */

        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).length() > 5) {
                animals.set(i, "Camel"); // set methods replaces the elements
            }
        }
        System.out.println(animals);

        System.out.println("------print subList from index[0] to index[3]-----------------");

        System.out.println(animals.subList(0, 3));

        System.out.println("----print each on separate line-------List Iterator------------");
        // ListIterator is advanced version of simple Iterator. allow us to use more methods

        ListIterator<String> stringListIterator = animals.listIterator();
        while (stringListIterator.hasNext()) {      //used while technic because iterator.
            System.out.println(stringListIterator.next());
        }
    }
}