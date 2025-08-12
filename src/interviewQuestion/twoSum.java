package interviewQuestion;

class twoSum{

    public int[] twoSumm(int [] nums, int target){
        int n = nums.length;
        int[] arr = new int[2];
        for(int i = 0; i<n-1; i++){
            for(int j = i; j<n; j++){
                if(nums[i] + nums[j] == target){
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }return arr;
    }

    public static void main (String[] args) {
        int[] nums = {2,7,11,15,55}; int target = 9;
        twoSum ob = new twoSum();

        int []ans = ob.twoSumm(nums , target);
        for(int i = 0; i<2; i++){
            System.out.println(ans[i]);
        }
    }
}
