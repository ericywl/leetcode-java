package Easy;

public class Q0167_TwoSumSorted {
    // two pointers but O(n^2)
    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int targetCopy = target;
            targetCopy -= numbers[i];

            if (targetCopy >= 0) {
                for (int j = i + 1; j < numbers.length; j++) {
                    if (targetCopy - numbers[j] == 0)
                        return new int[]{i + 1, j + 1};
                }
            }
        }

        return null;
    }

    // two pointers O(n) solution
    public static int[] twoSum2(int[] numbers, int target) {
        int low = 0, high = numbers.length - 1;
        while (numbers[low] + numbers[high] != target) {
            if (numbers[low] + numbers[high] < target)
                low++;

            else high--;
        }

        return new int[]{low + 1, high + 1};
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0};
        int[] twoSum = twoSum(nums, -1);

        if (twoSum == null) {
            System.out.println("NAY");
            return;
        }

        System.out.println(twoSum[0] + " AND " + twoSum[1]);
    }
}
