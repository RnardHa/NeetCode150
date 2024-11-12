package TwoPointers;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicate {
    public int solution() {
        return removeDuplicates(new int[]{1,1,1,2,2,2,2,2,3});
    }
    public int removeDuplicates(int[] nums) {
        // int index = 1;
        // for (int i = 1; i < nums.length; i++) {
        //     if (nums[i] != nums[i-1]) {
        //         nums[index++] = nums[i];
        //     }
        // }
        // return index;

//        int j = 1;
//
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] != nums[i-1]) {
//                nums[j++] = nums[i];
//            }
//        }
//
//        return j;

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        var sorted = map.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).toList();

        return sorted.get(0).getKey();
    }
}
