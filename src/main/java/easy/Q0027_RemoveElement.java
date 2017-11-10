package easy;

import java.util.Arrays;

public class Q0027_RemoveElement {
    public static int removeElement(int[] nums, int val) {
        if (nums == null) {
            return 0;
        }

        int len = 0;

        for (int i = 0; i < nums.length; i++) {
            int j = i;

            if (nums[i] != val) {
                len++;
            }

            while (nums[i] == val && j < nums.length) {
                if (nums[j] != val) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    len++;
                }

                j++;
            }
        }

        return len;
    }

    public static void main(String[] args) {
        int[] a = {2, 2};
        System.out.println(removeElement(a, 3));
        System.out.println(Arrays.toString(a));
    }
}
