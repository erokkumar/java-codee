package Hashmap;

import Maping.map;

import java.util.HashMap;
import java.util.Map;

public class mojority {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = {2, 5, 2, 5, 8, 6, 5};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> en : map.entrySet()) {
            System.out.println(en.getKey() + " " + en.getValue());
            if(en.getValue() >= arr.length/2){
                System.out.println("this is Majority Element "+ en.getKey());
            }
        }
    }
}
