package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutDuplicate {
    public int solution() {
        return lengthOfLongestSubstring("zxyzxyz");
    }

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int left = 0;
        Set<Character> set = new HashSet<>();
        int max = 0;

        for (int r = 0; r < n; r++) {
            while (set.contains(s.charAt(r))) {
                set.remove(s.charAt(left++));
            }
            int len = r - left + 1;
            max = Math.max(max, len);
            set.add(s.charAt(r));
        }

        return max;
    }
}
