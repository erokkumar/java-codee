package interviewQuestion;

import java.util.HashMap;
import java.util.Scanner;

public class singleNumber {
    public int singleNum(int[] nums){
//        int ans = 0;
//        for(int num : nums){
//            ans ^= num;
//        }return ans;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(int key : map.keySet()){
            if(1 == map.get(key)){
                return key;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();
        int []num = new int[n];
        System.out.println("Enter the elements in the array");
        for(int i = 0; i<n; i++){
            num[i] = sc.nextInt();
        }
        singleNumber ob = new singleNumber();
        System.out.print(ob.singleNum(num) + ",");

    }
}
