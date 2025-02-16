package ExceptionHandling;

public class Ex1 {
    public static void main(String[] args) {
        int num = 6;
        int num1 = 0;
        int sum = 0;

        try {
            sum = num / num1;
            System.out.println("in try block");
        }catch (Exception e)
        {
            System.out.println("Something went wrong ..." + e);
        }
        System.out.println(sum);
        System.out.println("bye");
    }
}
