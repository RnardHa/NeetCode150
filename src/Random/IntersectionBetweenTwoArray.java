package Random;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public  class IntersectionBetweenTwoArray {
    public int[] solution() {
        return intersection(new int[]{1,2,2,1}, new int[]{2,2});
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> res = new ArrayList<>();
        for (int n : nums1) {
            set.add(n);
        }

        for (int n : nums2) {
            if (set.contains(n)) {
                res.add(n);
                set.remove(n);
            }
        }

        return res.stream().mapToInt(i -> i).toArray();
    }
}
