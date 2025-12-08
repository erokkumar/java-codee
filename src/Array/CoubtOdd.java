package Array;

public class CoubtOdd {
    public static int countOdd(int low, int high){
        int cnt = 0;
        for(int i = low; i<= high; i++){
            if(i % 2 != 0){
                cnt++;
            }
        }return cnt;
    }

    public static void main(String[] args) {
        int low = 3 , high = 7;
        System.out.println(countOdd(low, high));
    }
}
