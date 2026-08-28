import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];

        // 1. Copy both arrays into the merged array
        System.arraycopy(nums1, 0, merged, 0, m);
        System.arraycopy(nums2, 0, merged, m, n);

        // 2. Sort the merged array
        Arrays.sort(merged);

        // 3. Find and return the median
        int total = merged.length;
        if (total % 2 != 0) {
            return (double) merged[total / 2];
        } else {
            return (merged[(total / 2) - 1] + merged[total / 2]) / 2.0;
        }
    }
}