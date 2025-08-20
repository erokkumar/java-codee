package interviewQuestion;

import java.util.Arrays;

public class findHindex {
    public int hIndex(int[] citations){
        int n = citations.length;
        Arrays.sort( citations );
        int maxi = 0;
        for( int i =0; i<n; i++){
            int h = n - i; // number of papers with at least h citations
            if( citations[i] >= h ){
                maxi = h; // update the maximum h-index found
                break; // since the array is sorted, we can break early
            }
        }return maxi;
    }
    public static void main(String[] args) {
        int[] citations = {3, 0, 6, 1, 5};
        findHindex finder = new findHindex();
        System.out.println(finder.hIndex(citations));
    }
}
