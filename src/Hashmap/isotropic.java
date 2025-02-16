package Hashmap;

import java.util.HashMap;

public class isotropic {
    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        HashMap<Character, Character> rr1 = new HashMap<>();
        HashMap<Character, Character> rr2 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            if ((rr1.containsKey(ch1) && rr1.get(ch1) != ch2) || (rr2.containsKey(ch2) && rr2.get(ch2) != ch1)) {
                return false;
            }
            rr1.put(ch1, ch2);
            rr2.put(ch2, ch1);
        }
        return true;
    }

    public static void main(String[] args) {
        isotropic solution = new isotropic();
        System.out.println(solution.isIsomorphic("egg", "add")); // true
        System.out.println(solution.isIsomorphic("foo", "bar")); // false
    }
}
