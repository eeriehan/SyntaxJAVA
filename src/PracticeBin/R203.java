package PracticeBin;

import java.util.HashMap;

public class R203 {

    public static void main(String[] args) {

        var data=new HashMap<String,Integer>();
        data.put("mango", 10);
        data.put("apple", 30);
        data.put("orange", 20);
        data.put("mango", 40);
        data.put("mango", 40);

        data.forEach((key,value) -> {
            System.out.println("Key = "+key+" and value = "+value);
        });
    }
}
