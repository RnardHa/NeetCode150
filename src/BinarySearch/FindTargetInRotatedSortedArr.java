package BinarySearch;

public class FindTargetInRotatedSortedArr {

    public int solution() {
        return search(new int[]{4,5,6,7,0,1,2}, 0);
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + ((right - left)/2);
            if (nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        int pivot = left;
        left = 0;
        right = nums.length - 1;

        //isolate left or right
        if (nums[pivot] <= target && target <= nums[right]) {
            left = pivot;
        } else {
            right = pivot - 1;
        }

        while(left <= right) {
            int mid = left + ((right - left) / 2);
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
