package ArraysAndHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKElementInList {
    public int[] solution() {
        return topKFrequent(new int[]{1,1,1,1,2,3,2,2,3,3,3}, 2);
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] freq = new List[nums.length + 1];

        for (int i = 0; i < nums.length + 1; i++) {
            freq[i] = new ArrayList<>();
        }

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (var each : map.entrySet()) {
            freq[each.getValue()].add(each.getKey());
        }

        int[] ans = new int[k];
        int index = 0;
        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            for (int n : freq[i]) {
                ans[index++] = n;
                if (index == k) {
                    return ans;
                }
            }
        }

        return ans;
    }

    // Bucket sort
}
