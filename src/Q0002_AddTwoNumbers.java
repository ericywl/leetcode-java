import java.util.ArrayList;
import java.util.List;

/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order
and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
*/

public class Q0002_AddTwoNumbers {
    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        List<ListNode> sumNodeList = new ArrayList<>();
        int carry = 0;

        while (true) {
            int digit = (l1.val + l2.val + carry) % 10;
            ListNode sumNode = new ListNode(digit);

            carry = (l1.val + l2.val + carry) / 10;
            sumNodeList.add(sumNode);
            l1 = l1.next;
            l2 = l2.next;

            if (l1 == null && l2 == null) {
                if (carry > 0) {
                    sumNode.next = new ListNode(1);
                }

                break;
            }

            if (l1 == null) {
                l1 = new ListNode(0);
            }

            if (l2 == null) {
                l2 = new ListNode(0);
            }
        }

        for (int i = 0; i < sumNodeList.size() - 1; i++) {
            sumNodeList.get(i).next = sumNodeList.get(i + 1);
        }

        return sumNodeList.get(0);
    }

    public ListNode addTwoNumbersAns(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;

        int carry = 0;

        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;

            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }

        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return dummyHead.next;
    }
}
