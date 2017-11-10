package easy;

import java.util.Arrays;

public class Q0026_RemoveDuplicatesSortedArray {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int output = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[output]) {
                output++;
                nums[output] = nums[i];
            }
        }

        System.out.println(Arrays.toString(nums));
        return output + 1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2};
        System.out.println(removeDuplicates(nums));
    }
}
