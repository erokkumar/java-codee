package DSA;

public class SecondLargest {
    public static void main(String[] args) {
        int []  arr = {5 , 3 , 8, 1 , 9 , 2};

        int large = Integer.MIN_VALUE;
        int SecondLarge = Integer.MIN_VALUE;

        for (int i = 0; i< arr.length; i++){
            if (arr[i] > large){
                SecondLarge = large;
                large = arr[i];
            } else if (arr[i] > SecondLarge){
                SecondLarge = arr[i];
            }
        }
        System.out.println(SecondLarge);
    }
}
