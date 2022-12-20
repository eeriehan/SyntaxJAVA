package PracticeBin;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class R205 {
    public static void main(String[] args) {
        var data = new HashMap<String, String>();
        data.put("Street", "Patrick ST");
        data.put("Suite", "265");
        data.put("City", "Vienna");
        data.put("Zip", "22180");
        data.put("Country", "United State");

        Iterator<Map.Entry<String, String>> info = data.entrySet().iterator();
        while(info.hasNext()){
            Map.Entry<String, String> entry = info.next();
            System.out.println(entry.getValue().toUpperCase());
        }

        // for(Map.Entry<String,String>printUpper:info){
        //     System.out.println(printUpper.getValue().toUpperCase());
        // }

        // data.forEach((key,value) -> {System.out.println(value.toUpperCase()); });

    }
}

