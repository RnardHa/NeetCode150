package LinkedList;

import Helper.ListNode;

public class Add2Numbers {
    public ListNode solution() {
        return addTwoNumbers(input1(), input2());
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode dummy = ans;
        int carry = 0;

        while (carry > 0 || l1 != null && l2 != null){
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;
            dummy.next = new ListNode(sum % 10);
            dummy = dummy.next;
        }

        if (l1 != null) {
            dummy.next = l1;
        }

        if (l2 != null) {
            dummy.next = l2;
        }

        return ans.next;
    }

    private ListNode input1() {
        return new ListNode(9);
    }

    private ListNode input2() {
        return new ListNode(9);
    }
}
