package Easy;

public class Q0203_RemoveLLElements {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        head.next = removeElements(head.next, val);

        return head.val == val ? head.next : head;
    }

    public static ListNode removeElements2(ListNode head, int val) {
        while (head != null && head.val == val) head = head.next;

        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.next.val == val) curr.next = curr.next.next;
            else curr = curr.next;
        }

        return head;
    }
}
