package Hashmap;

import java.util.HashSet;

public class countPalindromicSubsequence {
    public int countpalindrone(String str){
        int n = str.length();
        int ans = 0;
        HashSet<Character> set = new HashSet<>();

        for(int i = 0; i<n; i++){
            set.add(str.charAt(i));
        }

        for (char ch : set){
            int lli = -1;
            int rli = -1;

            for(int i = 0; i<n; i++){
                if (str.charAt(i) == ch){
                    if(lli == -1){
                        lli = i;
                    }
                    rli = i;
                }
            }
            HashSet<Character> midset = new HashSet<>();
            for(int j = lli+1; j<rli; j++){
                midset.add(str.charAt(j));
            }
            ans += midset.size();
        }
        return ans;
    }
    public static void main(String[] args) {
        countPalindromicSubsequence ob = new countPalindromicSubsequence();

        String str = "abcbaba";
        //ob.countpalindrone(str);
        System.out.println("Count of palindromic subsequences: " + ob.countpalindrone(str));

    }
}
