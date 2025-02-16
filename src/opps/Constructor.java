package opps;

public class Constructor {
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
        Constructor ob  = new Constructor();
        ob.Setdata();
        ob.Show();
    }
}
