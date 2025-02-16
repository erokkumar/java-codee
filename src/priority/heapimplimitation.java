package priority;

public class heapimplimitation {
    static int n = 0;
    static int heap[] = new int[100];
    public static void swap(int a, int b){
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }
    public static void print(){
        for (int i =0; i<n; i++){
            System.out.println(heap[i] + " ");
        }
    }

    public static void insert(int x){
        n++;
        // insert element at last position - maintain CBT
        heap[n-1] = x;
        int i = n-1;
        //int parent = (i-1)/2;
        // if parent is smaller , then swap
        while (i>0 && heap[(i-1)/2] < heap[i]){
            swap((i-1)/2, i); // swap element
            i = (i-1)/2;
        }
    }
    public static void main(String[] args) {
        insert(50);
        insert(30);
        insert(40);
        insert(10);
        insert(5);
        insert(20);
        insert(30);
        insert(60);
        print();

    }
}
