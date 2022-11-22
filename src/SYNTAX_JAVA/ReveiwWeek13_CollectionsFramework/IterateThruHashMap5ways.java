package SYNTAX_JAVA.ReveiwWeek13_CollectionsFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateThruHashMap5ways {
    /**
     * 5 Best Ways to Iterate Over HashMap in Java
     *
     */
}

class IterateHashMapExample1 {
    public static void main(String[] args) {
        // 1. Iterate through a HashMap EntrySet using Iterator
        Map<Integer, String> coursesMap = new HashMap<Integer, String>();
        coursesMap.put(1, "C");
        coursesMap.put(2, "C++");
        coursesMap.put(3, "Java");
        coursesMap.put(4, "Spring Framework");
        coursesMap.put(5, "Hibernate ORM framework");

        Iterator<Entry<Integer, String>> iterator = coursesMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println("-----------------------------------------------");
    }
}

class IterateHashMapExample2 {
    public static void main(String[] args) {
        Map<Integer, String> coursesMap = new HashMap<Integer, String>();
        coursesMap.put(1, "C");
        coursesMap.put(2, "C++");
        coursesMap.put(3, "Java");
        coursesMap.put(4, "Spring Framework");
        coursesMap.put(5, "Hibernate ORM framework");

        // 2. Iterate through HashMap KeySet using Iterator
        Iterator<Integer> iterator = coursesMap.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            System.out.println(key);
            System.out.println(coursesMap.get(key));
        }
        System.out.println("-----------------------------------------------");
    }
}

class IterateHashMapExample3 {
    public static void main(String[] args) {
        // 1. Iterate through a HashMap EntrySet using Iterator
        Map<Integer, String> coursesMap = new HashMap<Integer, String>();
        coursesMap.put(1, "C");
        coursesMap.put(2, "C++");
        coursesMap.put(3, "Java");
        coursesMap.put(4, "Spring Framework");
        coursesMap.put(5, "Hibernate ORM framework");

        // 3. Iterate HashMap using For-each Loop
        for (Map.Entry<Integer, String> entry : coursesMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println("-----------------------------------------------");
    }
}

class IterateHashMapExample4 {
    public static void main(String[] args) {
        Map<Integer, String> coursesMap = new HashMap<Integer, String>();
        coursesMap.put(1, "C");
        coursesMap.put(2, "C++");
        coursesMap.put(3, "Java");
        coursesMap.put(4, "Spring Framework");
        coursesMap.put(5, "Hibernate ORM framework");

        // 4. Iterating through a HashMap using Lambda Expressions
        coursesMap.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
        });
        System.out.println("-----------------------------------------------");
    }
}

class IterateHashMapExample5 {
    public static void main(String[] args) {
        Map<Integer, String> coursesMap = new HashMap<Integer, String>();
        coursesMap.put(1, "C");
        coursesMap.put(2, "C++");
        coursesMap.put(3, "Java");
        coursesMap.put(4, "Spring Framework");
        coursesMap.put(5, "Hibernate ORM framework");

        // 5. Loop through a HashMap using Stream API
        coursesMap.entrySet().stream().forEach((entry) -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        });
        System.out.println("-----------------------------------------------");
    }
}