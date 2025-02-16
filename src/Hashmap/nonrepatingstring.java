package Hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class nonrepatingstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sting ");
        String  n = sc.nextLine();
        HashMap <Character , Integer> map = new HashMap<>();

        for (int i =0; i<n.length(); i++){
            if (map.containsKey(n.charAt(i))){
                map.put(n.charAt(i),map.get(n.charAt(i)) + 1);
            }else {
                map.put(n.charAt(i),1);
            }
        }

        //  scan the hashtable and the index of the non repeating char
        int res = 1;

        for (int i =0; i<n.length(); i++){
            if (map.get(n.charAt(i)) == 1){
                System.out.println("First non-repeating char index is :" + i);
                res = 1;
                break;
            }
        }

        if (res == -1){
            System.out.println("No non-repeating char present in the string ");
        }

    }
}
