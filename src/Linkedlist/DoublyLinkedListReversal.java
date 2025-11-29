package Linkedlist;

class Node {
    int data;
    Node next;
    Node prev;

    // The constructor initializes a new node with the given data.
    // The 'next' and 'prev' pointers are set to null by default.
    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

// This class contains the logic to reverse the doubly linked list.
class Solution {
    public Node reverse(Node head) {
        // If the list is empty or has only one node, no reversal is needed.
        if (head == null || head.next == null) {
            return head;
        }

        Node current = head;
        Node temp = null;

        // We traverse the list, and for each node, we swap its 'next' and 'prev' pointers.
        while (current != null) {
            // Store the original 'prev' pointer in 'temp'
            temp = current.prev;

            // Swap the 'prev' and 'next' pointers
            current.prev = current.next;
            current.next = temp;

            // Move to the next node in the original list. Since 'next' is now 'prev',
            // we move forward by following the new 'prev' pointer.
            current = current.prev;
        }

        // After the loop, the last node of the original list is now the first.
        // The new head is located at 'temp.prev'.
        if (temp != null) {
            head = temp.prev;
        }

        return head;
    }
}

// The main class to create and test the doubly linked list.
public class DoublyLinkedListReversal {

    // A utility function to print the doubly linked list from a given starting node.
    static void printList(Node node) {
        if (node == null) {
            System.out.println("List is empty.");
            return;
        }

        // Traverse the list using the 'next' pointer
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a new doubly linked list
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);

        // Manually link the nodes together to form the list: 10 <-> 20 <-> 30 <-> 40
        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        third.next = fourth;
        fourth.prev = third;

        System.out.println("Original Doubly Linked List:");
        printList(head);

        // Reverse the list using the Solution class
        Solution solution = new Solution();
        Node reversedHead = solution.reverse(head);

        System.out.println("\nReversed Doubly Linked List:");
        printList(reversedHead);
    }
}