package priority;

public class deletionheap {
    public  static void swap(int arr[] , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void  arrayprint(int arr[] , int n){
        for (int i =0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void heapy(int arr[] , int n , int i){
        // intiitalize largest as root

         int largest = i;
         int l =  2*i + 1;
         int r = 2*i + 2;

         // if left child is larger than the root
        if (l < n && arr[l] > arr[largest]){
            largest = l;
        }
        // if right child is larger than the root
        if (l < n && arr[r] > arr[largest]){
            largest = r;
        }

         // if largest is not root
        if (largest != i){
            swap(arr , i , largest);
            heapy(arr, n , largest);
        }
    }
      public static int delete(int arr[] , int n){
        // get the last element
          int largestelemet = arr[n-1];
          // replace root with the last element
          arr[0] = largestelemet;
          // decremenet n
          n--;
          heapy(arr , n , 0);

          return n;
      }
    public static void main(String[] args) {
        int max = 100;
        int arr [] = new int[max];
        arr[0] = 100;
        arr[1] = 70;
        arr[2] = 60;
        arr[3] = 40;
        arr[4] = 50;

        int n = 5;
        System.out.println("Before insert heap element are :  ");
        arrayprint(arr , n);
        int value = 80;

        n = delete(arr , n );
        System.out.println("afte heap ement are :  ");
        arrayprint(arr , n);
    }
}
