package Inheritance;

class Laptop{
    public void compilecode(){
        System.out.println("Error code");
    }
}

class Developer{
    public void buildapp(){
        System.out.println("Bulding App");
        Laptop rr= new Laptop();
        rr.compilecode();
    }
}

public class opps6 {
    public static void main(String[] args) {
        Developer dev = new Developer();
        dev.buildapp();
        
    }
}
