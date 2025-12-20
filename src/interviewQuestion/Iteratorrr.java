package interviewQuestion;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iteratorrr {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            int n = it.next();
            System.out.print(n * 2 + ",");
        }
    }
}
