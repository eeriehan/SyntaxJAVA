package SYNTAX_JAVA.class25_Exel_Maps;

import java.util.HashMap;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.99); // to Store the values in a map
        fruit.put("Mango", 2.99);
        fruit.put("Orange", 4.99);

        fruit.put("Banana", 10.1);
        System.out.println(fruit);
        fruit.put("Banana", 2000.1); // it replaces. duplicate is not allowed
        System.out.println(fruit);

        Set<String> keySet = fruit.keySet();    //return
        System.out.println(keySet);
        var values = fruit.values();
        System.out.println(values);
    }
}
