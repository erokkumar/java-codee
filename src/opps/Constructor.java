package opps;

public class Constructor {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Constructor ob  = new Constructor();
        
    }
}
