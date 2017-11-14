package easy;

public class Q0198_HouseRobber {
    public static int rob(int[] nums) {
        int odd = 0;
        int even = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) even = Math.max(even + nums[i], odd);
            else odd = Math.max(odd + nums[i], even);
        }

        return Math.max(odd, even);
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 1, 2};
        System.out.println(rob(nums));
    }
}
