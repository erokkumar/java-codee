package Hashmap;

import java.util.HashSet;
import java.util.Set;

public class bitwisesub {

    public int subarrayBitwiseOR(int arr[]){
        Set<Integer> prev = new HashSet<>();
        Set<Integer> curr = new HashSet<>();
        Set<Integer> ans = new HashSet<>();

        for(int num : arr){
            for(int x : prev){
                curr.add(x | num);
                ans.add(x | num);
            }

            curr.add(num);
            ans.add(num);

            prev = curr;
            curr = new HashSet<>();
        }
        return ans.size();
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 4};
        bitwisesub ob = new bitwisesub();
        int result = ob.subarrayBitwiseOR(arr);
        System.out.println("Number of unique bitwise ORs of all subarrays: " + result);
    }
}
