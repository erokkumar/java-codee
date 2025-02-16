package priority;

import java.util.PriorityQueue;

class nearlysorted {
    public boolean nearlySorted(int[] arr, int k) {
        // code
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int ind = 0;
        for(int i = 0; i < arr.length; i++){
            pq.add(arr[i]);

            if(pq.size() > k){
                arr[ind++] = pq.peek();
                pq.poll();
            }
        }

        while(!pq.isEmpty()){
            arr[ind++] = pq.peek();
            pq.poll();
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {6, 5, 3, 2, 8, 10, 9};
        int k = 3;
        nearlysorted sc = new nearlysorted();

        System.out.println(sc.nearlySorted(arr, k));
    }
}
