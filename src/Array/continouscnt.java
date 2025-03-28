package Array;

 class continouscnt {
    public int maxConsecutiveCount(int[] arr) {
        // code here
        int n = arr.length;
        int z = 0 , one = 0;
        int ans = 0 , anso = 0;
        for(int i = 0; i<n; i++){
            if(arr[i] == 0){
                z++;
            } else if (arr[i]  == 1) {
                z = 0;
            }
            ans = Math.max(ans , z);
        }
        for(int i = 0; i<n; i++){
            if(arr[i] == 1){
                one++;
            }else if (arr[i]  == 0) {
                one = 0;
            }
            anso = Math.max(anso , one);
        }
        return Math.max(anso , ans);
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,1,0,0,1};
        continouscnt ob = new continouscnt();
        int ans = ob.maxConsecutiveCount(arr);
        System.out.println(ans);
    }
}
