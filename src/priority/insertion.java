package priority;


public class insertion {
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

    public static void heapify(int [] arr, int n , int i){
        // find parent
        int parent = (i-1)/2;

        //max heap;
        if (arr[parent] > 0){
            if (arr[i] > arr[parent]){
                swap(arr , i , parent);
                heapify(arr , n , parent);
            }
        }
    }

    public static int insert(int arr[] , int n , int value){
       // incrment size of the heap
        n++;
        arr[n-1] = value;
        heapify(arr , n , n-1);
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

        n = insert(arr , n , value);
        System.out.println("afte heap ement are :  ");
        arrayprint(arr , n);
    }
}
