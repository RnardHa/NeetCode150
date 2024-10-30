package Stack;

import java.util.Stack;

public class DailyTemperatures {

    public int[] solution() {
        return dailyTemperatures(new int[]{30,38,30,36,35,40,28});
    }

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<int[]> stack = new Stack<>();
        int[] ans = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            if (stack.isEmpty()) {
                int[] item = new int[]{temperatures[i], i};
                stack.push(item);
            } else {
                while (!stack.isEmpty() && temperatures[i] > stack.peek()[0]) {
                    var pair = stack.pop();
                    ans[pair[1]] = i - pair[1];
                }
                stack.push(new int[]{temperatures[i], i});
            }
        }
        return ans;
    }

}
