package DSA;

import java.util.Scanner;

public class  linearSearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println("Enter the number array");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // input data using sccaner basically used in input

        int x= sc.nextInt();
        int idx =-1;

        for (int i=0; i<n; i++) {
            if (arr[i] == x) {
                idx = i;
                break;
            }
        }
        // check the condition it if idx = -1  then print the "not found th
        if (idx == -1) {
            System.out.println(" not found this number");
        }
        else {
            System.out.print("Searched elements  index " +  idx);
        }
    }
}

