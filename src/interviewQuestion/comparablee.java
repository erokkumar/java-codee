package interviewQuestion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Stu implements Comparable<Stu>{
    int id;
    String name;
    int age;

    Stu(int id, String name , int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
    @Override
    public int compareTo(Stu s){
        return this.id - s.id;
    }
}


public class comparablee {
    public static void main(String[] args) {
        List<Stu> list = new ArrayList<>();
        list.add(new Stu(5,"Erok",25));
        list.add(new Stu(7,"Rohit",22));
        list.add(new Stu(4,"Shiv",23));
        Collections.sort(list);

        for(Stu ch : list){
        System.out.println(ch.id + "," + ch.name + "," + ch.age);
        }
    }
}
