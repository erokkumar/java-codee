package loop;

import java.util.Arrays;

public class minplatfrom {
    int findPlatform(int arr[], int dep[]) {
        // add your code here
        Arrays.sort(arr);
        Arrays.sort(dep);

        int platforms = 0, maxPlatforms = 0;
        int i = 0, j = 0, n = arr.length;

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) { // A train arrives
                platforms++;
                maxPlatforms = Math.max(maxPlatforms, platforms);
                i++;
            } else { // A train departs
                platforms--;
                j++;
            }
        }
        return maxPlatforms;
    }

    public static void main(String[] args) {
        minplatfrom ob = new minplatfrom();

        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};

        int result = ob.findPlatform(arr, dep);
        System.out.println("Minimum number of platforms required: " + result);
    }
}
