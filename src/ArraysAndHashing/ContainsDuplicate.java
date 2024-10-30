package ArraysAndHashing;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean solution() {
        return hasDuplicate(new int[]{1,2,3,3});
    }

    public boolean hasDuplicate(int[] nums) {
//        int len = nums.length;
//
//        for (int i = 0; i < len; i++) {
//            for (int j = i+ 1; j < len; j++) {
//                if (nums[i] == nums[j]) {
//                    return true;
//                }
//            }
//        }
//        return false;

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;

    }

    // Naive solution: O(n^2)
    // for each item in the list, check if there is another item that is the same

    // Set solution: O(n)
    // for each item put into set, if set return false then item is alerady inside
}
