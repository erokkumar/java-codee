package DSA;

public class plandroic {
    public static void main(String[] args) {
        int arr[] = {1,4,5,4,1};

        int n = arr.length;
        int flag =0;

        for (int i= 0; i<n/2;i++){
            if (arr[i]!= arr[n-i-1]){
                flag = 1;
                System.out.println("not plandroic numbaer");
                break;
            }
        }
        if (flag == 0){
            System.out.println("Palindroic array");
        }
    }
}
