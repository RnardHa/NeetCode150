package BinarySearch;

public class MedianOf2SortedArr {
    public double solution() {
        return findMedianSortedArrays(new int[]{1,2}, new int[]{3});
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;

        int left = 0;
        int right = 0;

        int mid1 = 0;
        int mid2 = 0;

        for (int count = 0; count < (len1 + len2) / 2 + 1; count++) {
            mid2 = mid1;
            if (left < len1 && right < len2) {
                if (nums1[left] < nums2[right]) {
                    mid1 = nums1[left];
                    left++;
                } else {
                    mid1 = nums2[right];
                    right++;
                }
            } else if (left < len1) {
                mid1 = nums1[left++];
            } else {
                mid1 = nums2[right++];
            }
        }

        if ((len1 + len2) % 2 != 0) {
            return (double) mid1;
        } else {
            return (double) (mid1 + mid2) / 2.0;
        }
    }
}
