package TwoPointers;

public class RemoveElement {

    public int solution() {
        return removeElement(new int[]{0,1,2,2,3,0,4,2}, 2);
    }

    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        int count = 0;

        while (left <= right) {
            if (nums[left] == val) {
                count++;
                nums[left] = nums[right--];
            } else {
                left++;
            }
        }

        return nums.length - count;
    }
}
