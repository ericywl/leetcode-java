public class Q0083_RemoveDuplicatesSortedList {
    /**
     * Given a sorted linked list, delete all duplicates such that each element appear only once.
     * For example,
     * Given 1->1->2, return 1->2.
     * Given 1->1->2->3->3, return 1->2->3.
     *
     * @return ListNode without duplicates
     */
    public static ListNode deleteDuplicates() {
        return new ListNode(1);
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
