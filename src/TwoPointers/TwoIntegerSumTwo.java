package TwoPointers;

public class TwoIntegerSumTwo {
    public int[] solution() {
        return twoSum(new int[]{1,2,3,4}, 3);
    }

    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                return new int[]{left+1, right+1};
            }
        }
        return new int[]{};
    }
}
