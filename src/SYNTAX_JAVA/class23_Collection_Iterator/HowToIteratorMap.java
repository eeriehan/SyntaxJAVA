package SYNTAX_JAVA.class23_Collection_Iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HowToIteratorMap {

    // Five ways to Iterator through Map

    public static void main(String[] args) {
        HashMap<Integer, String> exampleMap = new HashMap<Integer, String>();
        exampleMap.put(1, "One");
        exampleMap.put(2, "TWO");
        exampleMap.put(3, "THREE");
        exampleMap.put(4, "FOUR");
        exampleMap.put(5, "FIVE");


        System.out.println("-------------------#1");
        //1) Iterate through a HashMap / EntrySet using Iterator
        Iterator<Map.Entry<Integer, String>> iterator1 = exampleMap.entrySet().iterator();
        while (iterator1.hasNext()) {
            Map.Entry<Integer, String> entry = iterator1.next();
            System.out.println("Key = " + entry.getKey() + " : " + "Value = " + entry.getValue());
        }
        System.out.println("-------------------#2");
        //2) Iterate through HashMap / KeySet using Iterator
        Iterator<Integer> iterator2 = exampleMap.keySet().iterator();
        while (iterator2.hasNext()) {
            Integer key = iterator2.next();
            System.out.println(key);    // print 'key' from iterator2
            System.out.println(exampleMap.get(key));    // <-- how to print 'value', when using keySet()
        }

        System.out.println("-------------------#3");
        //3) Iterate HashMap using For-each Loop w/ entrySet()
        for (Map.Entry<Integer, String> entry : exampleMap.entrySet()) {
            System.out.println("Key = " + entry.getKey() + " : " + "Value = " + entry.getValue());
        }

        System.out.println("-------------------#4");
        //4) Iterating through a HashMap using Lambda Expressions ((HOT))
        exampleMap.forEach((key, value) -> {
            System.out.println("Key = " + key + " : " + "Value = " + value);
        });

        System.out.println("-------------------#5");
        //5) Loop through a HashMap using Stream API
        exampleMap.entrySet().stream().forEach((entry)->{
            System.out.println("Key = " + entry.getKey() + " : " + "Value = " + entry.getValue());
            });

    }

}
