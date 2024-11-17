package Random;

public class MaxSubArray {
    public int solution() {
        return maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4});
    }

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int sum = 0;

        for (int n : nums) {
            if (sum < 0) {
                sum = 0;
            }

            sum += n;
            max = Math.max(max, sum);
        }

        return max;
    }
}
