package HackerRank;

import java.util.ArrayList;
import java.util.List;

public class miniMinMax {
    public void solution () {
        List<Integer> input = new ArrayList<>();
        input.add(769082435);
        input.add(210437958);
        input.add(673982045);
        input.add(375809214);
        input.add(380564127);
        miniMaxSum(input);
    }

    public void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long sum = 0;
        // Collections.sort(arr);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            int val = arr.get(i);
            min = Math.min(min, val);
            max = Math.max(max, val);
            sum += val;
        }
        System.out.println((long)(sum - max) + " " + (long)(sum - min));

    }
}
