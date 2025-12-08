package interviewQuestion;

import java.util.Arrays;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        int [] arr = {2,4,6,8,10};
        iterateArray(arr);
    }
    public static void iterateArray(int[] arr){
        Iterator<Integer> it = Arrays.stream(arr).iterator();

        while (it.hasNext()){
            int num = it.next();
            System.out.println(num);
        }
    }
}
