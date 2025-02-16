package Hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ransomer ");
        String r = sc.nextLine();
        System.out.println("Enter the Magazine ");
        String m = sc.nextLine();

        HashMap<Character , Integer > map1 = new HashMap<>();

        for (int i = 0; i<r.length(); i++){
            char C = r.charAt(i);
            if (map1.containsKey(C)){
                map1.put(C,map1.get(C)+1);
            }else {
                map1.put(C,1);
            }
        }

        HashMap <Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i< m.length(); i++){
            char c = m.charAt(i);
            if (map2.containsKey(c)){
                map2.put(c ,map2.get(c)+1);
            }else {
                map2.put(c,1);
            }
        }

        boolean ans = true;
        for (Map.Entry<Character ,Integer> e : map1.entrySet()){
            if (!map2.containsKey(e.getKey()) || e.getKey()>map2.get(e.getKey())){
                ans = false;
                break;
            }
        }
        System.out.println(ans);
    }
}
