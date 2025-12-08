package loop;

import java.util.Scanner;

public class paternn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            //print spaces
            for(int s = i; s<n; s++){
                System.out.print(" ");
            }
        }
    }
}
