package Linkedlist;

public class addnewNode {
    static void printDataa(Node head){
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    static void insertAtend(Node head, int data){
        Node newNode = new Node(data);

        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public static void main(String[] args) {
        Node ff = new Node(1);
        Node ff1 = new Node(2);
        Node ff2 = new Node(3);

        ff.next = ff1;
        ff1.next = ff2;

        Node head = ff;

        System.out.println("Before Insertion");
        printDataa(head);

        insertAtend(head,4);
        insertAtend(head,5);
        System.out.println("After Insertion");
        printDataa(head);

    }
}
