import java.util.ArrayList;
import java.util.List;

public class revstring {
    public static void main(String[] args) {
        String str = "Rohit";
        char[] ch = str.toCharArray();
        int cnt = 0;

        for(int i = cnt - 1; i>=0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
