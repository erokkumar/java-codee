package Pattern;

public class nunmberPlaindron {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 0; i<=n; i++){
            for(int k = i; k<n; k++){
                System.out.print(" ");
            }
            for(int j = i; j>0; j--){
                System.out.print(j);
            }
            for(int r = 2; r<=i; r++){
                System.out.print(r);
            }
            System.out.println();
        }
    }
}
