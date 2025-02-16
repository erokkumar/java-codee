package Hashmap;

import java.util.Scanner;
import java.util.TreeMap;

public class q4e {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the array element ");
        int [] arr = new int[n];
        for (int  i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        TreeMap<Integer , Integer> map = new TreeMap<>();

        for (int i =0; i<n; i++){
            map.put(arr[i] , 1);
        }

        System.out.println(" My largest element is : " + map.lastEntry().getKey());

    }
}
