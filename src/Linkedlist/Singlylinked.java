package Linkedlist;
class Node{
    Node next;
    int data;

    Node (int data){
        this.data = data;
        this.next = null;
    }
}



    public void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("null");
    }



    public static void main(String[] args) {
        Singlylinked list  = new Singlylinked();
        list.add(10);
        list.add(20);
        list.add(30);

        list.print();
    }
}
