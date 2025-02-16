package Multithreading;

class Car implements Runnable
{
    synchronized public void run(){
        try {
            System.out.println(Thread.currentThread().getName() + " Has enterd the pakimg lot");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Got into Car to drive ");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Started to drive the car");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + " Came back and parked the car");
            Thread.sleep(2000);


        }catch (Exception e){
            System.out.println("Some problem");
        }
    }

}

public class multi4 {
    public static void main(String[] args) {
        Car ob = new Car();
        Thread t1 = new Thread(ob);
        Thread t2 = new Thread(ob);
        Thread t3 = new Thread(ob);

        t1.start();
        t2.start();
        t3.start();



    }
}
