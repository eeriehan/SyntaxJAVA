package SYNTAX_JAVA.ReveiwWeek14_HashTable;

import java.util.HashMap;
import java.util.Map;

public class InterviewQ {


    // Create a method that returns a map of characters and their count in a String
    //


    public static void main(String[] args) {

        String str="bdfjhdfbewqbcnsdfsdf";

        System.out.println(getCount(str));
    }

    public static Map<Character,Integer> getCount(String str){
        char[] charArr=str.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(char charCounter:charArr){

            if(map.get(charCounter)==null){
                map.put(charCounter,1);
            }else{
                int count=map.get(charCounter);
                count=count+1;
                map.put(charCounter,count);
            }
        }

        return map;
    }
}