package interviewQuestion;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class insertionofTwoarrays {
    public int [] insertion(int[] num1 , int[] num2){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num :  num1){
            map.put(num , map.getOrDefault(num,0) + 1);
        }

        List<Integer> list = new ArrayList<>();

        for (int num :  num2){
            if(map.containsKey(num) && map.get(num) > 0){
                list.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        //convert List to int
        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++){
            ans[i] = list.get(i);
        }

        return ans;

    }
    public static void main(String[] args) {
        int [] arr1 = {1,2,2,1};
        int [] arr2 = {2,2};
        insertionofTwoarrays ob = new insertionofTwoarrays();
        int []ans = ob.insertion(arr1,arr2);
        System.out.println(Arrays.toString(ans));
    }
}
