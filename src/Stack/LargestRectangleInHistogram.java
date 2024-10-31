package Stack;

import java.util.Stack;

public class LargestRectangleInHistogram {
    public int solution() {
        return largestRectangleArea(new int[]{2,1,5,6,2,3});
    }

    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        int max = 0;
        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < len; i++) {
            int start = i;
            while(!stack.isEmpty() && stack.peek()[0] > heights[i]) {
                var item = stack.pop();
                var area = item[0] * (i - item[1]);
                max = Math.max(max, area);
                start = item[1];
            }
            stack.push(new int[]{heights[i], start});
        }

        for (var pair : stack) {
            max = Math.max(max, pair[0] * (len - pair[1]));
        }

        return max;
    }
}
