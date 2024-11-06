package SlidingWindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PermutationString {
    public boolean solution() {
        return checkInclusion("abc", "lecabee");
    }

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] permutationCombo = new int[26];
        int[] wimCount = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            permutationCombo[s1.charAt(i) - 'a'] += 1;
            wimCount[s2.charAt(i) - 'a'] += 1;
        }

        if (Arrays.equals(permutationCombo, wimCount)){
            return true;
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            wimCount[s2.charAt(i) - 'a'] += 1;
            wimCount[s2.charAt(i - s1.length()) - 'a'] -= 1;
            if (Arrays.equals(permutationCombo, wimCount)){
                return true;
            }
        }

        return false;

    }

}
