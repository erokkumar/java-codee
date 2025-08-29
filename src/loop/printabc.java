package loop;

public class printabc {
    public static void main(String[] args) {

        for(int i = 0; i<5; i++){
            for(char j = 'a'; j<'a'+i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
