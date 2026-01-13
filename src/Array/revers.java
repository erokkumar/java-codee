package Array;

public class revers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int left = (arr.length -1) /2;
        int right = arr.length - 1;

        while (left < right) {
            // swap
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        // print array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
