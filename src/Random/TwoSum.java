package Random;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] solution() {
        return twoSum(new int[]{2,7,11,15}, 9);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            var complement = target - nums[i];
            if (!map.containsKey(complement)) {
                map.put(nums[i], i);
            } else {
                return new int[]{map.get(complement), i};
            }
        }

        return new int[]{};
    }
}
