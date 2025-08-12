package opps;

abstract class Animal {
    abstract void eat();
    abstract void sound();
}

class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("Dog eats bones");
    }
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

public class learnAbsraction {
    public static void main(String[] args) {
        Animal ob = new Dog();
        ob.eat();  // Output: Dog eats bones
        ob.sound(); // Output: Dog barks
    }
}
