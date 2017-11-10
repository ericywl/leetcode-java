package easy;

import java.util.HashSet;
import java.util.Set;

public class Q0141_LinkedListCycle {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // slow and O(n) space due to comparisons
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

        Set<ListNode> listNodes = new HashSet<>();
        ListNode curr = head.next;
        while (curr.next != null) {
            listNodes.add(curr);

            if (listNodes.contains(curr.next))
                return true;

            curr = curr.next;
        }

        return false;
    }

    // faster and O(1) space
    // tortoise-and-hare algorithm
    public static boolean hasCycle2(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }

        return false;
    }
}
