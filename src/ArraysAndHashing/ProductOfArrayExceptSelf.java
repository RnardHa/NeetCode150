package ArraysAndHashing;

public class ProductOfArrayExceptSelf {
    public int[] solution() {
        return productExceptSelf(new int[]{1,2,4,6});
    }

    public int[] productExceptSelf(int[] nums) {
        int[] leftMult = new int[nums.length];
        int[] rightMult = new int[nums.length];
        int left = 1;
        int right = 1;
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int j = nums.length - 1 - i;
            leftMult[i] = left;
            left *= nums[i];
            rightMult[j] = right;
            right *= nums[j];
        }

        for (int i = 0; i < nums.length; i++) {
            ans[i] = leftMult[i] * rightMult[i];
        }
        return ans;
    }
}
