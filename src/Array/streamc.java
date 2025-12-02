package Array;
import java.util.Arrays;

public class streamc {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.stream(num).sum());
        System.out.println(Arrays.stream(num).filter(n -> n%2 == 0).count());
        System.out.println(Arrays.stream(num).max().getAsInt());
        System.out.println(Arrays.stream(num).min().getAsInt());
        Arrays.stream(num).map(n -> n*2)
                .forEach(n -> System.out.print(n));
        Arrays.stream(num)
                .filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        System.out.println("we are Using Map");

        Arrays.stream(num)
                .map(n -> n * 2)
                .forEach(n -> System.out.print(n + " "));


    }
}
