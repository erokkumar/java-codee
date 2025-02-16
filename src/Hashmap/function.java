package Hashmap;

import java.util.HashMap;
import java.util.Map;

public class function {
    public static void main(String[] args) {
        HashMap <Integer,String> hashMap = new HashMap<>();

        hashMap.put(1 ,"erok");
        hashMap.put(2 , "rani");
        hashMap.put(3,"ritu");
        hashMap.put(4,"sonam");
        System.out.println("Hashmap given value are data "+hashMap);

        // get
        System.out.println("get() fuuction ");

        String result = hashMap.get(3);
        System.out.println(result);

        // containsKey
        System.out.println("containskey() function");

        System.out.println(hashMap.containsKey(2));

        // remove
        System.out.println("remove() function");
        hashMap.remove(1);
        System.out.println(hashMap);

        // iterating
        System.out.println("iterating() function");

        for (Map.Entry<Integer,String> e :hashMap.entrySet()){
            System.out.println("hashmap is: " + ":" + e.getKey() + ":" + e.getValue());
        }
    }
}
