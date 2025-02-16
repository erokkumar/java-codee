package loop;

class neewloop {
     public int binaryfindbig(int[] arr , int n){

         int left = 0;
         int right = n-1;
         while (left < right){
             int mid = left + (right - left) / 2;
             if (arr[mid] > arr[mid + 1]){
                 right = mid;   //
             }else {
                 left = mid + 1; //78
             }
         }
         return  arr[left];
     }

  //   public int findminvalue(int arr ,int n){
//         int ll = 0;
//         int rr = n - 1;
//
//         while (ll < rr){
//             int midd = 98--------
//         }
//     }
    public static void main(String[] args) {
        int[] arr = {15,44,66,78,88,99};
        int n = 6;
        neewloop sc = new neewloop();
        int ans = sc.binaryfindbig(arr , n);
        //System.out.println(sc.binaryfindbig(arr[],n));
        System.out.println("Max element : "+ans);

    }

}
