package LinkedList;

public class FindDuplicateIntegerWithNoExtraSpace {
    public int solution() {
        return findDuplicate(new int[]{1,2,3,2,2});
    }

    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;

        while (fast + 1 < nums.length) {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (nums[fast] == nums[slow]) {
                return nums[slow];
            }
        }
        return nums[slow];
    }
}
