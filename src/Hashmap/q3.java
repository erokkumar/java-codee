package Hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array :");

        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        HashMap <Integer , Integer> map = new HashMap<>();
        boolean duplicate = false;

        for (int i =0; i<n; i++){
            if (map.containsKey(arr[i])){
                duplicate = true;
                System.out.println("yes");
                break;
            }
            map.put(arr[i] ,1);
        }
        if(duplicate == false){
            System.out.println("No");
        }
    }
}
