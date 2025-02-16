package opps;

public class StudentDemo {
    private int age;
    private String name;

    public void Setdata(){
        age = 18;
        name = "Erok";
    }
    public void Show(){

        System.out.println(name + " " + age);
    }
    public static void main(String[] args) {
        StudentDemo ob = new StudentDemo();
        ob.Setdata();
        ob.Show();

    }
}
