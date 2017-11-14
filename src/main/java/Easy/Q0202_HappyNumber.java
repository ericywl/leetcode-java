package easy;

import java.util.HashSet;
import java.util.Set;

public class Q0202_HappyNumber {
    public static boolean isHappy(int n) {
        Set<Integer> sumsInLoop = new HashSet<>();
        int sum = sumSquares(String.valueOf(n));

        while (!sumsInLoop.contains(sum)) {
            if (sum == 1)
                return true;

            sumsInLoop.add(sum);
            sum = sumSquares(String.valueOf(sum));
        }

        return false;
    }

    private static int sumSquares(String numStr) {
        int sum = 0;
        for (int i = 0, len = numStr.length(); i < len; i++) {
            int num = Integer.parseInt(numStr.substring(i, i + 1));
            sum += num * num;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(7));
    }
}
