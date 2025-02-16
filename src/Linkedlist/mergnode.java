package Linkedlist;

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode r1 = head.next;
        ListNode r2 = r1;

        while(r2 != null){
            int sum = 0;
            while(r2 != null && r2.val != 0){
                sum += r2.val;
                r2 = r2.next;
            }
            r1.val = sum;
            r2 = r2.next;
            r1.next = r2;
            r1 = r1.next;
        }
        return head.next;
    }
}

public class mergnode {
    public static void main(String[] args) {
        // Create a sample linked list: 0 -> 3 -> 1 -> 0 -> 4 -> 5 -> 2 -> 0
        ListNode head = new ListNode(0);
        head.next = new ListNode(3);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(0);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next = new ListNode(0);

        // Merge nodes
        Solution solution = new Solution();
        ListNode mergedHead = solution.mergeNodes(head);

        // Print the merged linked list
        ListNode current = mergedHead;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}

