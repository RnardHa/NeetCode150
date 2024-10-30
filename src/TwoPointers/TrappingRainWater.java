package TwoPointers;

import java.util.Arrays;

public class TrappingRainWater {
    public int solution() {
        return trap(new int[]{0,2,0,3,1,0,1,3,2,1});
    }

    public int trap(int[] height) {
        // contruct 2d array from input
        int maxHeight = Arrays.stream(height).max().getAsInt();
        int[][] arr = new int[maxHeight][height.length];

        for (int i = 0; i < height.length; i++) {
            if (height[i] != 0) {
                int count = 0;
                while (count < height[i]) {
                    arr[count++][i] = 1;
                }
            }
        }

        int left = 0;
        int right = left + 1;
        int sum = 0;
        for (int i = 0; i < maxHeight; i++) {
            while (right < height.length) {
                if (arr[i][right] != 0) {
                    if (arr[i][left] == 1) {
                        sum += right - left - 1;
                    }
                    left = right;
                }
                right++;
            }
            left = 0;
            right = left + 1;
        }

        return sum;
    }
}
