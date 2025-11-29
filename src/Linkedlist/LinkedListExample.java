package Linkedlist;

public class LinkedListExample {
    static void prtindata(Node head){
        while(head != null){
            System.out.print(head.data );
            if(head.next != null){
                System.out.print(" -> ");
            }
            head = head.next;
        }
    }

    public static void main(String[] args) {
        Node ff = new Node(1);
        Node ff1 = new Node(2);
        Node ff2 = new Node(3);

        ff.next = ff1;
        ff1.next = ff2;

        Node head = ff;

        Node curr = head;

        prtindata(curr);
    }
}
