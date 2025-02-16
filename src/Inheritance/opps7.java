package Inheritance;

interface A1
{
    void show();
}
interface B
{
    void fun();
}

class C implements A1
{
    public void show(){
        System.out.println("in show");
    }
    public void fun(){
        System.out.println("lets play");
    }

}

public class opps7 {
    public static void main(String[] args) {
       C obj = new C();
       obj.show();
       obj.fun();
    }
}
