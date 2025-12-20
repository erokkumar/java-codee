package ExceptionHandling;

public class InsufficentFunds extends Exception{
    public InsufficentFunds(){
        super("Insufficient funds for this transaction.");
    }
}
