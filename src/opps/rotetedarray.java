package opps;

public class rotetedarray {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) { // Count decreasing points
                count++;
            }
            if (count > 1) {
                return false; // More than one drop means it's not a rotated sorted array
            }
        }
        return true; // At most one drop is allowed
    }

    public static void main(String[] args) {
        rotetedarray sc = new rotetedarray();
        int arr[] = {3,4,5,1,2};
        boolean ans = sc.check(arr);
        System.out.println(ans);
    }

}
