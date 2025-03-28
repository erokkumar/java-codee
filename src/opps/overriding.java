package opps;


class Aeroplane {
    public void takeOff() {
        System.out.println("Aeroplane is taking off");
    }

    public void fly() {
        System.out.println("AeroPlane is Flying");
    }
}
    class Cargopplane extends Aeroplane{
        public void takeOff(){
            System.out.println("Cargoplane require longer runway");
        }
        public void fly(){
            System.out.println("CargoPlane files at lower height");
        }
    }
    class PassengerPlane1 extends Aeroplane{
        public void takeOff(){
            System.out.println("PassengerPlane requires medium size runway");
        }
        public void fly(){
            System.out.println("PassengerPlane files at medium height");
        }
    }
public class overriding {
    public static void main(String[] args) {
        Cargopplane ob = new Cargopplane();
        PassengerPlane1 ob1 = new PassengerPlane1();

        Aeroplane ref;
        ref = ob;
        ref.takeOff();
        ref.fly();
        System.out.println("impliment___the___Polymorrphism ");
        ref = ob1;
        ref.takeOff();
        ref.fly();
    }
}
