package loop;
import java.util.Arrays;

public class posibaletringle {
    static int countTriangles(int arr[]){
        int n = arr.length;
        int res  = 0;
        Arrays.sort(arr);

        for (int i = 0; i<n; i++){
            int left = 0, right = i - 1;
            while (left < right){
                if (arr[left] + arr[right] > arr[i]){
                    res += right - left;
                    right--;
                }else {
                    left++;
                }
            }
        }
        return res;

    }
    public static void main(String[] args) {
        int [] arr = {4 , 2 , 3 , 4};
        System.out.println(countTriangles(arr));
    }
}
