package Queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class ksiedsubarray {
    public ArrayList<Integer> maxOfSubarrays(int[] arr, int k) {
        // code here
        Deque<Integer> dq = new ArrayDeque<>();
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            while (!dq.isEmpty() && arr[dq.getLast()] < arr[i]) {
                dq.removeLast();
            }
            dq.addLast(i);
            if (i - dq.getFirst() == k) dq.removeFirst();
            if (i >= k - 1) {
                ans.add(arr[dq.getFirst()]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] arr = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        ksiedsubarray obj = new ksiedsubarray();
        ArrayList<Integer> ans = obj.maxOfSubarrays(arr, k);
        System.out.println(ans);
    }
}
