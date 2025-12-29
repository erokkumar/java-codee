package Leetcode;

import java.util.Arrays;

public class Appleqution {
        public int minimumBoxes(int[] apple, int[] capacity) {
            int sum = 0;
            int ans = 0, cnt = 0;
            for(int s : apple){
                sum += s;
            }
            Arrays.sort(capacity);

            for (int i = capacity.length - 1; i >= 0 && sum > 0; i--) {
                sum -= capacity[i];
                cnt++;
            }return cnt;

        }


    public static void main(String[] args) {
        Appleqution ob = new Appleqution();
        int[] apple = {1,3,2};
        int [] capacity = {4,3,1,5,2};
        System.out.println(ob.minimumBoxes(apple,capacity));
    }
}
