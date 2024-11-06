package LinkedList;

import Helper.ListNode;

import java.util.ArrayList;

public class MergeKSortedLists {
    public ListNode solution() {
        ListNode[] input = new ListNode[]{input1(), input2(), input3()};
        return mergeKLists(input);
    }

    public ListNode mergeKLists(ListNode[] lists) {
        return new ListNode();
    }

    private ListNode input1() {
        return new ListNode(1, new ListNode(2, new ListNode(4)));
    }
    private ListNode input2() {
        return new ListNode(1, new ListNode(3, new ListNode(5)));
    }
    private ListNode input3() {
        return new ListNode(3, new ListNode(6));
    }
}
