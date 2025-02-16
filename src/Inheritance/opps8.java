package Inheritance;

interface A5
{
    void Show();
    default void config()
    {
        System.out.println("in config");
    }
    static void erok()
    {
        System.out.println("erok");
    }

}
  abstract class DD implements A5
{
    public void show()
    {
        System.out.println("in show");
    }
}



public class opps8 {
    public static void main(String[] args) {
        A5.erok();
      //  A5 obj =new DD();
        //A5.config();

    }
}
