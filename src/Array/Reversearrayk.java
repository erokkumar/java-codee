package Array;

import java.util.ArrayList;
import java.util.Collections;

public class Reversearrayk {
    void reverseInGroups(ArrayList<Long> arr, int k) {
        int n = arr.size();
        for (int i=0; i<n ; i+=k){
            int left = i;
            int right = Math.min(i + k-1, n-1);
            while (left<right){
                Collections.swap(arr,left,right);
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;

        ArrayList<Long> arrayList = new ArrayList<>();
        for (int num : arr) {
            arrayList.add((long) num);
        }

        Reversearrayk ob = new Reversearrayk();
        ob.reverseInGroups(arrayList, k);

        System.out.println(arrayList);
    }
}
