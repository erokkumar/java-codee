package opps;

public class epmloyee {
    private int id;
    private String name;
    private String department;
    private int salary;

    public epmloyee(String name){
        this.name = name;
    }

    public epmloyee(int id, String name){
        this.id = id;
        this.name = name;
    }
    public epmloyee(int id, String name, String department , int salary){
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void Display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        epmloyee emp1 = new epmloyee(1, "John Doe", "IT", 50000);
        emp1.Display();

        epmloyee emp2 = new epmloyee("Jane Smith");
        emp2.Display();

        epmloyee emp3 = new epmloyee(2, "Alice Johnson");
        emp3.Display();
    }
}
