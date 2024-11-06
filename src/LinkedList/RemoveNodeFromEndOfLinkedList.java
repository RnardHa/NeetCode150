package LinkedList;

import Helper.ListNode;

import java.util.ArrayList;
import java.util.List;

public class RemoveNodeFromEndOfLinkedList {

    public ListNode solution() {
        return removeNthFromEnd(input(), 2);
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode curr = head;
//        List<ListNode> nodes = new ArrayList<>();
//
//        while (curr != null) {
//            nodes.add(curr);
//            curr = curr.next;
//        }
//
//        int size = nodes.size();
//        int toBeRemoved = size - n;
//
//        if (toBeRemoved == 0) {
//            return head.next;
//        } else {
//            nodes.get(toBeRemoved - 1).next = nodes.get(toBeRemoved - 1).next.next;
//        }
//
//        return head;

        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode left = dummy;
        ListNode right = dummy;

        while (n + 1 > 0) {
            right = right.next;
            n--;
        }

        while (right != null) {
            right = right.next;
            left = left.next;
        }

        left.next = left.next.next;

        return dummy.next;
    }

    private ListNode input() {
        return new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
    }
}
