package Multithreading;

class Mythread extends Thread{
    public void rrr(){
        System.out.println("child thread");
    }
}


public class multi1 {
    public static void main(String[] args) {
        System.out.println("Main thread");
        Mythread obj = new Mythread();
        obj.start();
    }

}
