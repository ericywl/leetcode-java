package easy;

public class Q0070_ClimbingStairs {
    /**
     * You are climbing a stair case. It takes n steps to reach to the top.
     * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
     *
     * @param n: Number of stair steps, positive integer
     * @return Number of distinct ways to climb
     */
    public static int climbStairs(int n) {
        int first = 0, second = 1, sum = 0;

        for (int i = 0; i < n; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }

        return sum;
    }

    /*
        1 - 1
        2 - 11, 2
        3 - 111, 2(12)
        4 - 1111, 3(112), 22
        5 - 11111, 4(1112), 3(122)
        6 - 111111, 5(11112), 6(1122), 222
        7 - 1111111, 6(111112), 10(11122), 4(1222)
     */

    // 1, 2, 3, 5, 8, 13, 21...

    public static void main(String[] args) {
        System.out.println(climbStairs(44));
    }
}
