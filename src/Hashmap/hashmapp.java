package Hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class hashmapp {
    public static void main(String[] args) {

        //unorderd return hashamp
        HashMap<Integer , String > map = new HashMap<>();
        map.put(1, "erok");
        map.put(5,"jani");
        map.put(4, "priya");
        map.put(7,"rocky");
        System.out.println("Hashmap value present: "+map);

        // order of insertion retained in LinkedHashMap

        LinkedHashMap<Integer , String > map1 = new LinkedHashMap<>();
        map1.put(1, "erok");
        map1.put(5,"jani");
        map1.put(4, "priya");
        map1.put(7,"rocky");
        for(Map.Entry<Integer,String> s : map1.entrySet()){
            System.out.println("LinkedHashmap value present:" + s.getKey()+ " : " + s.getValue());
        }
        // TreeMap

        TreeMap<Integer , String > map2 = new TreeMap<>();
        map2.put(1, "erok");
        map2.put(5,"jani");
        map2.put(4, "priya");
        map2.put(7,"rocky");
        for (Map.Entry<Integer,String> e :map2.entrySet()){
            System.out.println("hashmap is: " + ":" + e.getKey() + ":" + e.getValue());
        }
        //System.out.println("TreeMap value present: "+map2);
    }
}
