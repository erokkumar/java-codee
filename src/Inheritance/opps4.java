package Inheritance;

//final class Animal{
//    void sleep(){
//        System.out.println("Animal is sleeping");
//    }
//}

 class Animal{
     int age =18;
    final void sleep(){
        // age =20;
        System.out.println("Animal is sleeping");
    }
}

class Tiger1 extends Animal{
//     void sleep()  final method we can overrite in child class
//     {
//
//     }

}

public class opps4 {
    public static void main(String[] args) {
        Tiger1 t=new Tiger1();
        t.sleep();
    }
}
