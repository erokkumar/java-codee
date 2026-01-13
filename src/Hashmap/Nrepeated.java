package Hashmap;

import java.util.HashMap;

public class Nrepeated {
    static int repeatedNTimes(int[] num){
        int n = num.length/2;
        HashMap<Integer,Integer> ans = new HashMap<>();

        for (int c : num){
            ans.put(c,ans.getOrDefault(c,0)+1);
            if (ans.get(c) == n){
                return c;
            }
        }return -1;
    }
    public static void main(String[] args) {
        int [] num = {1,2,3,3};
        System.out.println(repeatedNTimes(num));
    }
}
