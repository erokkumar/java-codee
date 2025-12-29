package interviewQuestion;

import java.io.InputStream;
import java.util.Scanner;

public class sumofNumber {
    public static void main(String[] args) {
        int sum = 0;
        InputStream it = sumofNumber.class.getResourceAsStream("number.txt");

        Scanner sc = new Scanner(it);
        while (sc.hasNext()){
            int n = sc.nextInt();
            sum += n;
        }
        System.out.println(sum);
    }
}
