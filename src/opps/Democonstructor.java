package opps;

class Demo2 {
    private int a;
    private int b;

    // public Democonstructor{
    // this is Automatic genrate the defult constructor java compiler
    //}
    Demo2(){
        System.out.println("Zero paramirzed Constructer by program ");
    }
    public Demo2(int a, int b){
        this.a = a;
        this.b = b;
    }

    void disp() {
        System.out.println(a + b);
        System.out.println(b);
    }
}

public class Democonstructor{
    public static void main(String[] args) {
        Demo2 ob = new Demo2();
        ob.disp();
        Demo2 ob1 = new Demo2(5,6);
        ob1.disp();
    }
}
