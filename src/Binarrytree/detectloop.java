package Binarrytree;


    class Node {
        int data;
        Node next;

        // Constructor to initialize a node
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public class detectloop {
        // Function to check if the linked list has a loop.
        public static boolean detectLoop(Node head) {
            // If the head is null, there can't be any loop
            if (head == null) {
                return false;
            }

            // Initialize two pointers: slow and fast
            Node slow = head;
            Node fast = head.next;

            // Traverse the linked list with slow and fast pointers
            while (slow != null && fast != null && fast.next != null) {
                if (slow == fast) {
                    // Loop detected if slow and fast pointers meet
                    return true;
                }
                slow = slow.next;
                fast = fast.next.next;
            }

            // No loop detected
            return false;
        }

        public static void main(String[] args) {
            // Create nodes
            Node head = new Node(1);
            Node second = new Node(2);
            Node third = new Node(3);
            Node fourth = new Node(4);

            // Link nodes to form a linked list: 1 -> 2 -> 3 -> 4
            head.next = second;
            second.next = third;
            third.next = fourth;

            // Introduce a loop: 4 -> 2 (creating a cycle)
            fourth.next = second;

            // Check for loop
            boolean hasLoop = detectLoop(head);
            if (hasLoop) {
                System.out.println("Loop detected in the linked list.");
            } else {
                System.out.println("No loop detected in the linked list.");
            }

            // Now, let's break the loop and check again
            fourth.next = null;
            hasLoop = detectLoop(head);
            if (hasLoop) {
                System.out.println("Loop detected in the linked list.");
            } else {
                System.out.println("No loop detected in the linked list.");
            }
        }


}
