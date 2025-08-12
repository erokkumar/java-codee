package opps;


interface bnimal{
    void eat();
    void color();
}
interface House{
    void floor();
    void area();
}

abstract class person implements bnimal ,House {
    String name;

    person (String name){
        this.name=name;
    }

    //abstract methods
    abstract void Sound();
}
class display extends person {

    display(String name) {
        super(name);
    }

    public void getName() {
        System.out.println(name);
    }

    public void Sound(){
        System.out.println("Dog barks");
    }

    @Override
    public void eat() {
        System.out.println("Dog eats bones");
    }

    @Override
    public void color() {
        System.out.println("Dog color is brown");
    }

    @Override
    public void floor() {
        System.out.println("floor is made of Wood");
    }

    @Override
    public void area() {
        System.out.println("Area is 1000 sq ft");
    }
}

public class interfacess {
    public static void main(String[] args) {
        display ob = new display("Db vbnvbnvbh");
        ob.eat();  // Output: Dog eats bones
        ob.color(); // Output: Dog color is brown
        ob.floor(); // Output: floor is made of Wood
        ob.area();  // Output: Area is 1000 sq ft
        ob.getName(); // Output: Db vbnvbnvbh

    }
}
