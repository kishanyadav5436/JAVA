class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n = nums1.length;
        int[] freq = new int[100001];

        long k = (long) k1 + k2;
        int max = 0;
        long total = 0;

        // Find differences and count their frequencies
        for (int i = 0; i < n; i++) {
            int d = Math.abs(nums1[i] - nums2[i]);
            freq[d]++;
            max = Math.max(max, d);
            total += d;
        }

        if (k >= total) {
            return 0;
        }

        // Reduce the largest differences first
        for (int d = max; d > 0 && k > 0; d--) {
            int move = (int) Math.min(k, freq[d]);

            freq[d] -= move;
            freq[d - 1] += move;
            k -= move;
        }

        // Calculate the sum of squares
        long ans = 0;

        for (int d = 1; d < freq.length; d++) {
            ans += (long) freq[d] * d * d;
        }

        return ans;
    }
}