package Stack;

import java.util.Stack;

public class LargestRectangleInHistogram {
    public int solution() {
        return largestRectangleArea(new int[]{1,3,7});
    }

    public int largestRectangleArea(int[] heights) {
        int len = heights.length;

        Stack<int[]> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            while(!stack.isEmpty() && heights[i] >= stack.peek()[0]) {
                stack.pop();
            }
            stack.push(new int[]{heights[i], i});
        }

        int ans = 0;
        //getting solution
        if (stack.size() == 1) {
            ans = stack.peek()[0];
        } else {
            var last = stack.lastElement();
            var first = stack.firstElement();
            ans = (last[1] - first[1] + 1) * Math.min(first[0], last[0]);
        }

        return ans;
    }
}
