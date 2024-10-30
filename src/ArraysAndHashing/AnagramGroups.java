package ArraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramGroups {
    public List<List<String>> solution() {
        return groupAnagrams(new String[]{"act","pots","tops","cat","stop","hat"});
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map  = new HashMap<>();

        for (String s : strs) {
            var charArr = s.toCharArray();
            Arrays.sort(charArr);

            if (!map.containsKey(Arrays.toString(charArr))) {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(Arrays.toString(charArr), list);
            } else {
                map.get(Arrays.toString(charArr)).add(s);
            }
        }

        for (String s : map.keySet()) {
            ans.add(map.get(s));
        }

        return ans;
    }

    // Solution:
    // Sort all the item in string list
    // put into map <Sorted, original>
}
