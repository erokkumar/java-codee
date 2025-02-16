package Hashmap;

import java.util.Scanner;
import java.util.TreeMap;

public class q1 {
    public static void main(String[] args) {
        TreeMap<Integer , String > map = new TreeMap<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the key value pairs " );

        int n = sc.nextInt();

        System.out.println("Enter the key value pairs");

        for(int i =0; i<n; i++){
            int key = sc.nextInt();
            String value = sc.nextLine();
            map.put(key,value);
        }

        System.out.println("The map is : " + map);
    }
}
