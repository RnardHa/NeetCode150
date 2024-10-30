package ArraysAndHashing;

import java.util.HashMap;

public class TwoIntegerSum {
    public int[] solution() {
        return twoSum(new int[]{3, 4, 5, 6}, 7);
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            var complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        return new int[]{};
    }

    // Naive solution: O(n^2)
    // Brute force: try each combination, if found then there is combination

    // Optimized solution: O(n)
    // Use hashSet, target - curr == val stored in the set -> found
    // if not put the curr into set

}
