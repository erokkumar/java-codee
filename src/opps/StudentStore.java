package opps;

import java.util.ArrayList;

public class StudentStore {

    private ArrayList<Studentsss> st = new ArrayList<>();

    public void addStudent( int rollNo , String name ){
        Studentsss s = new Studentsss(rollNo ,name);
        st.add(s);
    }
    public void displayStudent(){
        for (Studentsss s : st){
            System.out.println("Name: " + s.getName() + ", Roll No: " + s.getRollNo());
        }
    }

    public static void main(String[] args) {
        StudentStore store = new StudentStore();
        store.addStudent(1, "Alice");
        store.addStudent(2, "Bob");
        store.addStudent(3, "Erok");
        store.displayStudent();
    }
}
