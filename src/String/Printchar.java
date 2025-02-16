package String;

public class Printchar {
    static void printSubstrings(String s){
        int n = s.length();

        for (int i = 0; i<=n; i++){
                System.out.println(s.substring(0,i));
        }
    }
    public static void main(String[] args) {
        String  s = "abcd";
        printSubstrings(s);
    }
}
