package LinkedList;

import Helper.ListNode;

import java.util.ArrayList;
import java.util.List;

public class ReorderLinkedList {
    public ListNode solution() {
        return reorderList(input());
    }

    public ListNode reorderList(ListNode head) {
        List<ListNode> nodes = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            nodes.add(curr);
            curr = curr.next;
        }

        int left = 0;
        int right = nodes.size() - 1;

        while (left < right) {
            nodes.get(left++).next = nodes.get(right);
            if (left >= right) {
                break;
            }
            nodes.get(right--).next = nodes.get(left);
        }
        nodes.get(left).next = null;

        return head;
    }

    private ListNode input() {
        return new ListNode(2, new ListNode(4, new ListNode(6, new ListNode(8))));
    }
}
