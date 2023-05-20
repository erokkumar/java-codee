package Inheritance;

class Aeroplane{
    public void takeoff(){
        System.out.println("Aeroplane is taking off");
    }
    public void fly(){
        System.out.println("Aeroplane is flying");
    }
}
class Cargoplane extends Aeroplane{

}

class Passengerpalne extends Aeroplane{

}

public class opps1 {
    public static void main(String[] args) {
        Cargoplane cp = new Cargoplane();
        cp.takeoff();
        cp.fly();

        Passengerpalne rr = new Passengerpalne();
        rr.takeoff();
        rr.fly();

    }
}
