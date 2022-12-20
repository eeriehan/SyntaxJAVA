package PracticeBin;

import java.util.LinkedList;
import java.util.List;

public class R194 {
    public static void main(String[] args) {

        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        removeStartsWith(countries, 'A');
    }
     static void removeStartsWith(List<String> countriesList, char c) {
        List<String> bullyA = new LinkedList<>();
        for (Object country : countriesList) {
            if (!(country.toString().startsWith(String.valueOf(c)))) {
                bullyA.add((String) country);
            }
        }
        System.out.println(bullyA);
    }

}

/*
        **For you to do:**

                Create a method that takes a list as a paramter.
                removes an element, if it starts with letter A from given List
                and return new List
                then in the main method, print that list.

                **Expected Output:**

                ```
                [USA, Kazakhstan, Pakistan, Russia]
*/
