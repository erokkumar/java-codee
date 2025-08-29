package Hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class countWord {
    public static void main(String[] args) {
        List<String> ob = Arrays.asList("india" , "USA" , "india" , "USA", "NEPAL" ,"NEPAL");
        HashMap<String,Integer> map = new HashMap<>();

        for(String s : ob){
            map.put(s,map.getOrDefault(s, 0)+1);
        }
        System.out.println(map);

    }
}
