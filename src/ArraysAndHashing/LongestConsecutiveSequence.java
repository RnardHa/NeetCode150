package ArraysAndHashing;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int solution() {
        return longestConsecutive(new int[]{2,20,4,10,3,4,5});
    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int length = 1;
                while (set.contains(num + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
