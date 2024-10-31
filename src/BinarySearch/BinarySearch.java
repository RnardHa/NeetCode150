package BinarySearch;

public class BinarySearch {
    public int solution() {
        return search(new int[]{-1,0,2,4,6,8}, 4);
    }

    public int search(int[] nums, int target) {
        int len = nums.length;
        int left = 0;
        int right = len - 1;

        while (left <= right) {
            var mid = left + ((right - left) / 2);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
