package ArraysAndHashing;

import java.util.Arrays;
import java.util.HashMap;

public class IsAnagram {

    public boolean solution() {
        return isAnagram("jar", "jam");
    }

    public boolean isAnagram(String s, String t) {
//        var sChar = s.toCharArray();
//        var tChar = t.toCharArray();
//        Arrays.sort(sChar);
//        Arrays.sort(tChar);
//
//        if (s.length() != t. length()) {
//            return false;
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            if (sChar[i] != tChar[i]) {
//                return false;
//            }
//        }
//        return true;

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sCount = new HashMap<>();
        HashMap<Character, Integer> tCount = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            sCount.put(s.charAt(i), sCount.getOrDefault(s.charAt(i), 0) + 1);
            tCount.put(t.charAt(i), tCount.getOrDefault(t.charAt(i), 0) + 1);
        }

        return sCount.equals(tCount);

//        int[] alphabets = new int[26];
//
//        if (s.length() != t. length()) {
//            return false;
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            alphabets[s.charAt(i) - 'a']++;
//            alphabets[t.charAt(i) - 'a']--;
//        }
//
//        for (int i = 0; i < alphabets.length; i++) {
//            if (alphabets[i] != 0) {
//                return false;
//            }
//        }
//        return true;
    }

    // Naive solution: O(nlogn)
    // Sort the 2 string then compare 1 by 1

    // Optimized solution: O(n)
    // HashMap. Foreach of the char in the string, put into the hashMap.
    // Result need to match for each alphabet count.

    // Optimized solution: O(n)
    // Using hashtable, init the 20 alphabets(must only contain small letters) then ++ or --.
    // Final result all the val in hashtable need to be 0;
}
