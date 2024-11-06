package LinkedList;

import Helper.ListNode;

public class ReverseNodesInKGroup {
    public ListNode solution() {
        return reverseKGroup(input(), 3);
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        return new ListNode();
    }

    private ListNode input() {
        return new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
    }
}
