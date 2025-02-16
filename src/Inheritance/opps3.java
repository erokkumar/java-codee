package Inheritance;


class Demo1{
    int a,b;
    public Demo1(){
        System.out.println("parent class constructer");

    }
    public Demo1(int x, int y){
        System.out.println("parameterized parent class constructor");
        a=x;
        b=y;
    }
}
class Demo2 extends Demo1{
    int m,n;
    public Demo2(){
        System.out.println("child class constructor");
    }
    public Demo2(int x, int y){
        System.out.println("parameterized child class constructor");
        m=x;
        n=y;
    }
}

public class opps3 {
    public static void main(String[] args) {
        Demo2 d=new Demo2();
    }
}
