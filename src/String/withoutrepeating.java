package String;

import java.util.HashSet;

public class withoutrepeating {
    public int lengthOfLongestSubstring(String s){
        HashSet<Character> ss = new HashSet<>();
        int n = s.length();
        int ll = 0, maxi = 0;

        for(int i = 0; i<n; i++){
            while(ss.contains(s.charAt(i))){
                ss.remove(s.charAt(ll));
                ll++;
            }
            ss.add(s.charAt(i));
            maxi = Math.max(maxi , i - ll + 1);
        }
        return maxi;
    }

    public static void main(String[] args) {
        withoutrepeating solution = new withoutrepeating();
        String s = "abcabcbb";
        int result = solution.lengthOfLongestSubstring(s);
        System.out.println("Length of the longest substring without repeating characters: " + result);

    }

}
