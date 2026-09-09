public class CountCommas {

    static int countCommasss(int n){
        if (n < 1000){
            return 0;
        }
        return n - 999;
    }
    public static void main(String[] args) {
        int n = 1002;
        System.out.println(STR."No Of Commas\{countCommasss(n)}");
    }
}
