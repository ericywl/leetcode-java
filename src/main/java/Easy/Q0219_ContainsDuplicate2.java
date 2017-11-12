package Easy;

import java.util.HashMap;
import java.util.Map;

public class Q0219_ContainsDuplicate2 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> numsIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numsIndex.containsKey(nums[i]) &&
                    Math.abs(i - numsIndex.get(nums[i])) <= k) return true;

            numsIndex.put(nums[i], i);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {-1, -1};
        System.out.println(containsNearbyDuplicate(nums, 1));
    }
}
