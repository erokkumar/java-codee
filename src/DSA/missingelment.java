package DSA;

public class missingelment {
    public static void main(String[] args) {
         int arr[] = {1,2,3,5,6,7};
         int n = arr.length;

         int sum_natural = (n+1)*(n+2)/2;
         int sum = 0;

         for (int i = 0; i<n; i++){
             sum+= arr[i];
         }

         int mising_number = sum_natural - sum;

        System.out.println("mising number of array :"+ mising_number);
    }
}
