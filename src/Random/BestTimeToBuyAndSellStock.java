package Random;

public class BestTimeToBuyAndSellStock {
    public int solution() {
        return maxProfit(new int[]{7,1,5,3,6,4});
    }

    public int maxProfit(int[] prices) {
        int max = 0;
        int left = 0;
        int right = 0;

        while(right < prices.length) {
            while (prices[left] > prices[right]) {
                left++;
            }
            max = Math.max(max, prices[right] - prices[left]);
            right++;
        }

        return max;
    }
}
