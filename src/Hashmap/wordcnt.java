package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class wordcnt {
    public static void main(String[] args) {
        String str = "i am Rohit am i rohit";
        //String ans = str.trim();
        String[] word = str.split("\\s+");
        HashMap<String,Integer> map = new HashMap<>();
        for(String ch : word){
            map.put(ch , map.getOrDefault(ch,0) + 1);
        }
        for(Map.Entry<String,Integer> en : map.entrySet()){
            System.out.println(en.getKey() + " : " + en.getValue());
        }
    }
}
