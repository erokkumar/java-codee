package interviewQuestion;

import java.io.InputStream;
import java.util.Scanner;

public class summofNum {
    public static void main(String[] args) {
        InputStream it = summofNum.class.getResourceAsStream("number.txt");
        Scanner sc = new Scanner(it);
        int sum = 0;
        while (sc.hasNext()){
            int n = sc.nextInt();
            sum += n;
        }
        System.out.println(sum);
    }
}
