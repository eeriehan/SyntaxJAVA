package SYNTAX_JAVA.class25_Exel_Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MapDemo5 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.99); // to Store the values in a map
        fruit.put("Mango", 2.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 10.1);

        //remove all that is more than 2.00
        Collection<Double> values = fruit.values(); //returns all the values from a Map

        Iterator<Double> iterator = values.iterator();

        while (iterator.hasNext()) {
            Double value = iterator.next();
            if (value > 2) {
                iterator.remove();
            }
        }
        System.out.println(fruit);

//        fruit.values().removeIf(x -> x > 2);    //lambda. same results as code from line 15 to 24
        System.out.println(fruit);

    }
}
