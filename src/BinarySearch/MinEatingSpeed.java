package BinarySearch;

import java.util.Arrays;

public class MinEatingSpeed {
    public int solution() {
        return minEatingSpeed(new int[]{1,4,3,2}, 9);
    }

    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();

        while (left < right) {
            int sumTime = 0;
            int mid = left + ((right - left) / 2);

            for (int p : piles) {
                sumTime += Math.ceil((double) p / mid);
            }

            if (sumTime > h) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
