package Linkedlist;

class apnaclg {
    Node head;
    class Node{
        String data;
        Node next;


        Node(String data){
            this.data = data;
            this.next = null;

        }
    }

    //add first node
    public void addfirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add last node

    public void addlast(String data){
        Node newNode = new Node(data);
        //Node head = null;
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // print
    public void printList(){
        Node currNode = head;
        if(head == null){
            System.out.println("empty");
            return;
        }
        while (currNode!= null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[] args) {
        apnaclg list = new apnaclg();
        list.addfirst("a");
        list.addfirst("is");
        list.printList();
    }
}
