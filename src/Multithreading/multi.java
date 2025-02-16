package Multithreading;
class Demo2 implements Runnable
{
    public void run(){
        System.out.println("child class thread Executing ");
        try {
            Thread.sleep(3000);
        }catch (Exception e){
            System.out.println("same problem");
        }
        System.out.println("child thread task complited");
    }
}

public class multi {
    public static void main(String[] args) {
        System.out.println("Main Thread started ");

        Demo2 obj = new Demo2();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}
