package Easy;

public class Q0206_ReverseLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode nextNode = head.next;
        ListNode newHead = reverseList(nextNode);
        nextNode.next = head;
        head.next = null;

        return newHead;
    }
}
