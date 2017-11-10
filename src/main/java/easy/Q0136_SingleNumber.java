package easy;

public class Q0136_SingleNumber {
    // XOR all numbers together
    public static int singleNumber(int[] nums) {
        int output = 0;

        for (int num : nums) {
            output ^= num;
        }

        return output;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 4, 3};

        System.out.println(singleNumber(nums));
    }
}
