package Easy;

import java.util.Arrays;

public class Q0189_RotateArray {
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        if (k == 0) return;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        int temp;
        while (end - start > 0) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate2(int[] nums, int k) {
        k %= nums.length;
        if (k == 0) return;

        int[] tempArr = new int[k];
        System.arraycopy(nums, nums.length - k, tempArr, 0, k);
        System.arraycopy(nums, 0, nums, k, nums.length - k);
        System.arraycopy(tempArr, 0, nums, 0, k);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotate2(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}
