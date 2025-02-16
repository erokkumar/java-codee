package Multithreading;

class A extends Thread{
    public void run(){
        try {
            for (int i=0; i<4; i++){
                System.out.println("******");
                sleep(3000);
            }
        }
        catch (Exception e){
            System.out.println("wrong");
        }

    }
}

public class Multi3
{
    public static void main(String[] args) {
        A ob =new A();
        ob.start();

        for (int i=0; i<4; i++){
            System.out.println("*erok*");
        }

    }
}
