package String;

public class swaptw {
    public static void main(String[] args) {
        int a = 10, b = 20;
        a = b + a; // total sum
        b = a - b;
        a = a - b;
        System.out.println("Swap  a = "+ a +" b = "+ b);
    }
}
