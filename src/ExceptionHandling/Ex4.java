package ExceptionHandling;


public class Ex4 {
    public static void main(String[] args) {
        int num = 8;
        int num1 =-2;
        int divi = 0;
        try {
            if(num1 <0){
                Exception e = new Exception();
                throw e;
            }else {
                 divi = num/num1;
                System.out.println(divi);
            }
        }
        catch (Exception e){
            System.out.println("Enter the valid nuumber ");
        }
    }
}
