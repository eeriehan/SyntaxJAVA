package PracticeBin;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class R202 {
    public static void main(String[] args) {
        LinkedHashMap<String,String> data = new LinkedHashMap<>();
        data.put("1 item", "apple");
        data.put("2 item", "banana");
        data.put("3 item", "pear");
        data.put("4 item", "tomato");
        data.put("5 item", "mango");
        data.put("6 item", "kiwi");

        // for (Map.Entry<String,String> dataPrint : data.entrySet()) {
        // String dataKey = dataPrint.getKey();
        // String dataValue = dataPrint.getValue();
        // System.out.println("Key is "+dataKey+" and values is "+dataValue);
        // }

        Iterator<Map.Entry<String, String>> iter =data.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry<String, String> entry =iter.next();
            System.out.println("Key is "+(entry.getKey())+" and values is "+entry.getValue());
        }




    }
}






