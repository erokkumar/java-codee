package Array;

public class SeconLargestNum {
    public static void main(String[] args) {
        int[] arr = {25,26,12,35,44};
        int sum = arr[0];

        for (int k : arr) {
            if (k > sum) {
                sum = k;
            }
        }

        int sec = 0;

        for (int j : arr) {
            if (j != sum && j > sec) {
                sec = j;
            }
        }

        System.out.println(STR."Second Largest Number \{sec}");
    }
}
