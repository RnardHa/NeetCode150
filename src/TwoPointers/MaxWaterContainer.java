package TwoPointers;

public class MaxWaterContainer {
    public int solution() {
        return maxArea(new int[]{2,2,2});
    }

    public int maxArea(int[] heights) {
        int n = heights.length;
        int left = 0;
        int right = n - 1;
        int max = 0;

        while (left < right) {
            int area = (right - left) * Math.min(heights[left], heights[right]);
            max = Math.max(max, area);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}
