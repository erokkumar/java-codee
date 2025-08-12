package interviewQuestion;

public class counttotalnumber {
    public long coloredCells(int n) {
        return 2 * n * n - 2 * n + 1;
    }

    public static void main(String[] args) {
        int n = 2;
        counttotalnumber ob = new counttotalnumber();
        System.out.println(ob.coloredCells(n));
    }
}
