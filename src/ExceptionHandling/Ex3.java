package ExceptionHandling;

class Demo{
    ///handling vs duking the exception

    public void a(){
        try {
            b();
        }
        catch (Exception e){
            System.out.println("error  "  + e);
        }
    }
    public void b() throws Exception
    {
        int num = 8;
        int num1 =0;
        int divid = num/num1;
        System.out.println(divid);
    }
}

public class Ex3 {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.a();
        
    }
}
