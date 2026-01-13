package Linkedlist;

import java.util.ArrayList;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
        this.next = null;
    }
}


public class PlainDromeLinked {
    public static boolean isPalindrome(ListNode head){
        ArrayList<Integer> list = new ArrayList<>();

        while(head != null){
            list.add(head.val);
            head = head.next;
        }
        int r = list.size() - 1;
        int l = 0;

        while (l < r){
            if(!list.get(l).equals(list.get(r))){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        if (isPalindrome(head)) {
            System.out.println("LinkedList is PlainDrome");
        }else{
            System.out.println("LinkedList is Not PlainDrome");
        }
    }
}
