package interviewQuestion;

import java.util.Scanner;

public class isPowertwo {

    public boolean isPower(int n){
        return n <0 ? false : Integer.bitCount(n) == 1;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPowertwo ob = new isPowertwo();
        boolean ans = ob.isPower(n);
        System.out.println(ans);
    }
}
