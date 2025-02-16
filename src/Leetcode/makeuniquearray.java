package Leetcode;

import java.util.Arrays;

class makeuniquearray {
    public int minIncrements(int[] arr) {
        // Code here
        int N = arr.length;
        Arrays.sort(arr);
        int ans =0;

        for(int i=1;i<N;i++) {
            if(arr[i-1]>=arr[i]) {
                ans+=(long)(arr[i-1]-arr[i]+1);
                arr[i]=arr[i-1]+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,2};
        int [] arr1 = {1,1,2,3};
        makeuniquearray sc = new makeuniquearray();
        System.out.println(sc.minIncrements(arr));
        System.out.println(sc.minIncrements(arr1));
    }
}
