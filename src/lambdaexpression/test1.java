package lambdaexpression;

interface A{
    default void printassignment() {
        System.out.println("This is parent class");
    }
}

interface B{
    default void printassignment() {
        System.out.println("This is child class");
    }
}


public class test1 implements A,B {
    public static void main(String[] args) {
        test1 obj = new test1();
        obj.printassignment(); // Ambiguous method call
    }
        public void printassignment() {
            B.super.printassignment(); // Resolving ambiguity by calling A's method
        }
}