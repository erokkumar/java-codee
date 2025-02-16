package Inheritance;


class Animal1{
    public void eat(){
        System.out.println("Animal eats everyday");
    }
    public void age(int x){
        System.out.println("Animal age is");
    }

}

class Tiger extends Animal1{
    public void eat(){
        System.out.println("Tiger hunts and eat");
    }


//    public void age() {
//         return 10;
//    }
}

public class opps2 {
    public static void main(String[] args) {
        Tiger t=new Tiger();
        t.eat();
    }
}
