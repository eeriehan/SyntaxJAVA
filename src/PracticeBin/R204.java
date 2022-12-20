package PracticeBin;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class R204 {

        public static void main(String[] args) {
            var data = new LinkedHashMap<String, String>();

            data.put("Street", "Patrick ST");
            data.put("Suite", "265");
            data.put("City", "Vienna");
            data.put("Zip", "22180");
            data.put("Country", "United State");

            // Iterator<Map.Entry<String,String>>iterator = data.entrySet().iterator();
            // while(iterator.hasNext()){
            //     Map.Entry<String,String>entry=iterator.next();
            //     System.out.println(entry.getValue());
            // }

            // data.forEach((key,value)->{
            //   System.out.println(value);
            // });

            Iterator<String> iter = data.keySet().iterator();
            while (iter.hasNext()) {
                String value = iter.next();
                System.out.println(data.get(value));
            }



        }
    }
