package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class PermutationString {
    public boolean solution() {
        return checkInclusion("abc", "lecabee");
    }

    public boolean checkInclusion(String s1, String s2) {
        // find the shorter string
        // use that string as the string to compare
        String shortest = s1.length() < s2.length() ? s1 :  s2;
        String longest = s1.length() < s2.length() ? s2 :  s1;

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < shortest.length(); i ++) {
            map.put(shortest.charAt(i), map.getOrDefault(shortest.charAt(i), 0) + 1);
        }

        int left = 0;
        for (int r = 0; r < longest.length(); r++) {

        }

        return false;
    }

}
