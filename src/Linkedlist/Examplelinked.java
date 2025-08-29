package Linkedlist;
import java.util.Arrays;
import java.util.LinkedList;

public class Examplelinked {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(5, 10, 15, 20, 25
        ));

        int idx = list.indexOf(10);
        list.add(idx + 1, 10);
        list.add(list.indexOf(25) - 1, 22);


        System.out.println("Orignal list" + list);

        list.removeFirst();
        list.removeLast();


        System.out.println("Final "+ list);

    }
}
