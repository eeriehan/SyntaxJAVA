package SYNTAX_JAVA.class25_Exel_Maps;

import java.util.HashMap;
import java.util.Iterator;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 1.99); // to Store the values in a map
        fruit.put("Mango", 2.99);
        fruit.put("Orange", 4.99);
        fruit.put("Banana", 10.1);

        var allKeys = fruit.keySet();   //method to get all the Keys in Map
        System.out.println(allKeys);

        Iterator<String> iterator = allKeys.iterator(); //Getting an iterator on that set
        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.contains("n")) {
                iterator.remove();
            }
        }
        fruit.keySet().removeIf(x -> x.contains("n"));
        System.out.println(fruit);
    }
}
