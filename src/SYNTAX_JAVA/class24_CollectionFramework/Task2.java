package SYNTAX_JAVA.class24_CollectionFramework;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        /*
        create an arraylist of drinks.if any drink has letter "a" or "e" replace it with water.
         */
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Coffee");
        drinks.add("Tea");
        drinks.add("fresh Juice");
        drinks.add("Iced Tea");
        drinks.add("Soda");
        drinks.add("canned Juice");
        drinks.add("Milk");
        drinks.add("Chocolate Milk");

        for (int i = 0; i < drinks.size(); i++) {
            if (drinks.get(i).contains("a") || drinks.get(i).contains("e")) {
                drinks.set(i, "Water");     // set = should've called replace
            }
        }
        System.out.println(drinks);
//
//        Iterator<String> iterator = drinks.iterator();
//        while (iterator.hasNext()) {
//            String drink = iterator.next();
//            if (drink.contains("e") || drink.contains("e")) {
//
//            }
//          it searches the elements first and then loop again to get the idex
//          wrong approaches
//        }


    }
}
