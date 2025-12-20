package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Testt {
    public static void main(String[] args) throws InsufficentFunds {
        int amt = 1000;
        if (0 < amt){
            throw new InsufficentFunds();
        }
    }
}
