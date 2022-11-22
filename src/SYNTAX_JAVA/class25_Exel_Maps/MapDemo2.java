package SYNTAX_JAVA.class25_Exel_Maps;

import java.util.LinkedHashMap;

public class MapDemo2 {
    public static void main(String[] args) {
        LinkedHashMap<String, Double> beautyProducts = new LinkedHashMap<>();
        beautyProducts.put("Foundation", 50.5);
        beautyProducts.put("Blush", 20.9);
        beautyProducts.put("Lipstick", 15.9);

        LinkedHashMap<String, Double> cosmetics = new LinkedHashMap<>();
        cosmetics.put("Soap", 4.0);
        cosmetics.put("Conditioner", 11.2);
        cosmetics.put("Shampoo", 10.2);

        LinkedHashMap<String, Double> grocery = new LinkedHashMap<>();
        grocery.putAll(beautyProducts);
        System.out.println(grocery);
        grocery.putAll(cosmetics);
        System.out.println(grocery);
        //grocery.remove(beautyProducts); does not work we can't remove all entries from the map
        System.out.println(grocery);
        grocery.clear();
        System.out.println(grocery);
    }
}
