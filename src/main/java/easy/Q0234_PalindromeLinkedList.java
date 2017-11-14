package easy;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q0234_PalindromeLinkedList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static boolean isPalindrome(ListNode head) {
        List<Integer> valList = new ArrayList<>();
        List<Integer> revValList = new ArrayList<>();

        while (head != null) {
            valList.add(head.val);
            revValList.add(head.val);

            head = head.next;
        }

        Collections.reverse(revValList);
        for (int i = 0; i < valList.size(); i++) {
            if (!valList.get(i).equals(revValList.get(i)))
                return false;
        }

        return true;
    }
}
