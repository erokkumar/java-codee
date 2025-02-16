package loop;

 class maxprosubarray {
    int maxProduct(int arr[]){
       int n = arr.length;
       int max = Integer.MIN_VALUE;
       for (int i = 0; i< n; i++){
           int sum = 1;
           for (int j = i; j<n; j++){
               sum *= arr[j];
               max = Math.max(sum , max);
           }
       }
       return max;
    }

    public static void main(String[] args) {
        maxprosubarray ob = new maxprosubarray();

        int [] arr = {-2,6,-3,-10,0,2};
        int [] arr1 = {-1, -3, -10, 0, 60};
        int ans = ob.maxProduct(arr);
        int ans1 = ob.maxProduct(arr1);
        System.out.println("arr = "+ans +" arr1 = " + ans1);

    }
}
