package SlidingWindow;

public class BestTimeToBuyAndSellStock {
    public int solution() {
        return  maxProfit(new int[]{10,8,7,5,2});
    }

    public int maxProfit(int[] prices) {
        int n = prices.length;
        int left = 0;
        int right = 1;
        int max = 0;

        while (right < n) {
            if (prices[left] < prices[right]) {
                max = Math.max(max, prices[right] - prices[left]);
            } else {
                left = right;
            }
            right++;
        }

        return max;
    }
}
