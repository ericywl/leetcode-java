public class Q0083_RemoveDuplicatesSortedList {
    /**
     * Given a sorted linked list, delete all duplicates such that each element appear only once.
     * For example,
     * Given 1->1->2, return 1->2.
     * Given 1->1->2->3->3, return 1->2->3.
     *
     * @return ListNode without duplicates
     */
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode current = head;
        ListNode lookAhead;

        while (current.next != null) {
            lookAhead = current.next;
            if (current.val == lookAhead.val) {
                current.next = lookAhead.next;
            } else {
                current = lookAhead;
            }
        }

        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(1);
        ListNode c = new ListNode(2);

        a.next = b;
        b.next = c;

        ListNode start = deleteDuplicates(a);

    }
}
