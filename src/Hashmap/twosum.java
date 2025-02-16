package Hashmap;

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class twosum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array of size");
        int n = sc.nextInt();

        System.out.println("Enter array input ");

        int arr[] = new int [n];

        for (int i = 0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target value");
        int target = sc.nextInt();

        HashMap <Integer, Integer> map = new HashMap<>();

        for (int i = 0; i<n; i++)
        {
            map.put(arr[i],i);
        }

        int result[] = new int[2];

        for (int i =0; i<n; i++) {
            if (arr[i] == target && map.containsKey(0)) {
                result[0] = i;
                result[1] = map.get(0);
                break;
            } else if (map.containsKey(target - arr[i])) {
                if (map.get(target - arr[i]) > i) {
                    result[0] = i;
                    result[1] = map.get(target - arr[i]);
                    break;
                }
            }
        }
        System.out.println("Two sum index value are : ["+result[0] +","+ result[1]+"]");

        }
    }
