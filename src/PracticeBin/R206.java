package PracticeBin;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class R206 {
    public static void main(String[] args) {
        var map = new HashMap<String, String>();
        map.put("ONE", "AAA");
        map.put("TWO", "BBB");
        map.put("THREE", "CCC");
        map.put("FOUR", "DDD");
        map.put("FIVE", "EEE");

        System.out.println("HashMap Before Remove :");
        map.forEach((key, value) -> {
            System.out.println(key + " : " + value);
        });

        System.out.println("------------------");

        System.out.println("HashMap After Remove :");
        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, String> entry = iter.next();
            if (!(entry.getKey().equals("ONE") || entry.getKey().equals("FOUR"))) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }


    }
}
