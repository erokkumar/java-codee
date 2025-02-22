package opps;


class Human {
    int age;

    void sleep() {
        age = 19;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}
class Student extends Human{

}

 class inheritance1 {
    public static void main(String[] args) {
        Student ob = new Student();
        ob.sleep(); // Not error show becuse using exrends method
    }
}
