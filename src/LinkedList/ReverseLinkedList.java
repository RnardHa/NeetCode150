package LinkedList;

import Helper.ListNode;

public class ReverseLinkedList {
    public ListNode solution() {
        return reverseList(input());
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }

    private ListNode input() {
        return new ListNode(0, new ListNode(1, new ListNode(2, new ListNode(3))));
    }
}
