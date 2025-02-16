package Inheritance;

interface Car
{
    void Drive();
}

public class opps10 {
    public static void main(String[] args) {
        Car obj = new Car(){
            public void Drive(){
                System.out.println("Driving...");
            }
        };
        obj.Drive();

    }
}
