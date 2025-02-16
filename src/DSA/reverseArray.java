package DSA;

public class reverseArray {
    public static void main(String[] args) {

        int arr[] ={5,4,6,3,2,9};
        int n = arr.length;

        for (int i= 0; i<n/2; i++){

            int temp = arr[i];
            arr[i] = arr[n-i- 1];
            arr[n-i-1] =  temp;
        }
        System.out.println("reverse array answer : ");
        for (int i = 0;  i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
