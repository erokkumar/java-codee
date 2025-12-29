package Pattern;

public class AlphabetPattern {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i<n; i++){
            for(int s = i; s<n; s++){
                System.out.print(" ");
            }
            for(char ch = (char)('A' + i); ch >= 'A'; ch--){
                System.out.print(ch);
            }

            for(char ch = 'B'; ch <= (char) ('A' + i); ch++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
