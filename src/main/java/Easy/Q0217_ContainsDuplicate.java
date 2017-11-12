package Easy;

import java.util.HashSet;
import java.util.Set;

public class Q0217_ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueNums = new HashSet<>();
        for (int n : nums) {
            uniqueNums.add(n);
        }

        return uniqueNums.size() != nums.length;
    }
}
