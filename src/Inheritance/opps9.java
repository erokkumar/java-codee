package Inheritance;



// inner class

class A9
{
    public void show()
    {
        System.out.println("in shoe");
    }
    class B
    {
        public void display()
        {
            System.out.println("in display");
        }
    }
}
public class opps9 {
    public static void main(String[] args)
    {
        A9 obj = new A9();
        A9.B obj1 = obj.new B();
        obj.show();
        obj1.display();
    }
}
