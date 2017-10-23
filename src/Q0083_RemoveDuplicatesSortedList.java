public class Q0083_RemoveDuplicatesSortedList {
    /**
     * Given a sorted linked list, delete all duplicates such that each element appear only once.
     * For example,
     * Given 1->1->2, return 1->2.
     * Given 1->1->2->3->3, return 1->2->3.
     *
     * @return ListNode without duplicates
     */
    public static ListNode deleteDuplicates(ListNode start) {
        ListNode current = start;
        ListNode lookAhead;

        while (current.next != null) {
            lookAhead = current.next;
            if (current.val == lookAhead.val) {
                current.next = lookAhead.next;
            } else {
                current = lookAhead;
            }
        }

        return start;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode b = new ListNode(1);
        ListNode a = new ListNode(1);

        deleteDuplicates(a);
    }
}
