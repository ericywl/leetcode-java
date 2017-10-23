public class Q0053_MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int numsLength = nums.length;
        int[] subarrayMax = new int[numsLength];
        int currMax = nums[0];

        subarrayMax[0] = nums[0];

        for (int i = 1; i < numsLength; i++) {
            // if subarrayMax[i - 1] < 0, start over with nums[i],
            // else just add it to nums[i],
            // store this value to subarrayMax[i]
            subarrayMax[i] = nums[i] + (subarrayMax[i - 1] >= 0 ? subarrayMax[i - 1] : 0);
            currMax = Math.max(currMax, subarrayMax[i]);
        }

        return currMax;
    }

    public static void main(String[] args) {
        int[] a = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(a));
    }
}
