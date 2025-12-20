package Array;

import java.util.HashMap;

public class CountSpacialTriple {
    public static void main(String[] args) {
        int[] num = {6,3,6};
        System.out.println(countSpecialTriples(num));
    }

    public static int countSpecialTriples(int[] nums){
        int n = nums.length;
        int cnt = 0;
        HashMap<Integer,Integer>  left = new HashMap<>();
        HashMap<Integer,Integer> right = new HashMap<>();

        for(int val : nums){
            right.put(val, right.getOrDefault(val,0) + 1);
        }

        for (int num : nums){
            right.put(num, right.get(num) - 1);

            int lf = left.get(num*2);
        }return cnt;
    }
}
