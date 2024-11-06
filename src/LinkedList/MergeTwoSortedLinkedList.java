package LinkedList;

import Helper.ListNode;

public class MergeTwoSortedLinkedList {
    public ListNode solution() {
        return mergeTwoLists(input1(), input2());
    }

    private ListNode input1() {
        return new ListNode(1, new ListNode(2, new ListNode(4)));
    }

    private ListNode input2() {
        return new ListNode(1, new ListNode(3, new ListNode(5)));
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        ListNode curr = ans;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }

        return ans.next;
    }
}
