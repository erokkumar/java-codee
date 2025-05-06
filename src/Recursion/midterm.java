package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class midterm {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        midterm ob = new midterm();
        // Example of using recursion
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the length of the list:");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the list:");
        for(int i =0; i<n; i++){
            list.add(sc.nextInt());
        }
        System.out.println("The list is: " + list);
        System.out.println("The size of the list is: " + list.size());
        System.out.println("The first element of the list is: " + list.get(0));
        int ans = ob.hashCode();
        System.out.println("Hash code of the object is: " + ans);
    }
}
