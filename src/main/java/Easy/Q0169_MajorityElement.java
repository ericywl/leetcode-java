package easy;

import java.util.HashMap;
import java.util.Map;

public class Q0169_MajorityElement {
    public static int majorityElement(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> intMap = new HashMap<>();

        for (int n : nums) {
            int count = intMap.getOrDefault(n, 0);
            if (count + 1 > len / 2)
                return n;

            intMap.put(n, count + 1);
        }

        return nums[0];
    }

    public static int majorityElement2(int[] nums) {
        int major = nums[0], count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (count == 0 || major == nums[i]) {
                count++;
                major = nums[i];
            } else {
                count--;
            }
        }

        return major;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 1, 5, 1};
        System.out.println(majorityElement2(nums));
    }
}
