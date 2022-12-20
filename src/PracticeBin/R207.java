package PracticeBin;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class R207 {
    public static void main(String[] args){
        var map = new HashMap<String, String>();
        map.put("ONE","AAA");
        map.put("TWO","BBB");
        map.put("THREE","CCC");
        map.put("FOUR","DDD");
        map.put("FIVE","EEE");

        Iterator<Map.Entry<String, String>> iter = map.entrySet().iterator();

        System.out.println("HashMap Before Remove :");

        while(iter.hasNext()){
            Map.Entry<String, String> entry = iter.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        Iterator<Map.Entry<String, String>> replace = map.entrySet().iterator();
        while(replace.hasNext()){
            Map.Entry<String, String> entry = replace.next();
            var asdf=entry.getValue();
            if(asdf.equals("AAA")){
                asdf.replace("AAA","SUMAIR");
            }
        }

        System.out.println("------------------");

        System.out.println("HashMap After Remove :");
        Iterator<Map.Entry<String, String>> itera = map.entrySet().iterator();

        while(itera.hasNext()){
            Map.Entry<String, String> entry = itera.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }








    }
}
