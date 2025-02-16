package Inheritance;

interface Carb{
    void Drive();
}

public class opps11 {
    public static void main(String[] args) {
        Carb obj = () -> System.out.println("Driving...... ");
        obj.Drive();
    }
}
