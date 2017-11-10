package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q0121_BuySellStock {
    public static int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;

        int currLowest = prices[0];
        int sell = prices[0];
        List<Integer> prev = new ArrayList<>();

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < currLowest) {
                prev.add(sell - currLowest);
                currLowest = prices[i];
                sell = currLowest;
            } else if (prices[i] > sell) {
                sell = prices[i];
            }

            prev.add(sell - currLowest);
        }

        return Collections.max(prev);
    }

    // Kadane's algorithm for max-subarray problem
    public static int maxProfit2(int[] prices) {
        int maxCur = 0, maxSoFar = 0;

        for (int i = 1; i < prices.length; i++) {
            maxCur += prices[i] - prices[i - 1];
            maxCur = Math.max(0, maxCur);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] prices = {1};
        System.out.println(maxProfit(prices));
    }
}
