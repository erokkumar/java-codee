package ExceptionHandling;

class invalid extends Exception {
     public invalid(String str){
         super(str);
     }
}

public class createException {
    static void checkage(int age) throws invalid{
        if(age > 18){
            System.out.println("Welcome to vote");
        }else {
            throw new invalid("Not valid age");
        }
    }

    public static void main(String[] args) {
        try{
            checkage(2);
        }catch (Exception e){
            System.out.println("Caught in main " + e);
        }
    }
}
