package Array;

import java.util.HashMap;
import java.util.Hashtable;

public class Kentro {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("1", 1);
        map.put("1", 2);
        System.out.println(map);
        HashMap<String, Integer> tb = new HashMap<>();
        System.out.println("Hashtable");
        tb.put("1", 1);
        tb.put("1", 2);
        System.out.println(tb);
    }
}
