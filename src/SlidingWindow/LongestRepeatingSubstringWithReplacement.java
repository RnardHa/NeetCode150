package SlidingWindow;

import java.util.*;

public class LongestRepeatingSubstringWithReplacement {
    public int solution() {
        return characterReplacement("AAABABB", 1);
    }

    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int len = s.length();
        int max = 0;

        for (int r = 0; r < len; r++) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            int winLen = r- left + 1;
            int maxCount = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getValue();
            if (winLen - maxCount <= k) {
                max = Math.max(max, winLen);
            } else {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
        }
        return max;
    }
}
