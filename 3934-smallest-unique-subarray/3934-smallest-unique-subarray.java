import java.util.*;

class Solution {
    private static final long BASE1 = 100003L;
    private static final long MOD1 = 1000000007L;
    private static final long BASE2 = 100019L;
    private static final long MOD2 = 1000000009L;

    public int smallestUniqueSubarray(int[] nums) {
        int n = nums.length;
        long[] pow1 = new long[n + 1];
        long[] pow2 = new long[n + 1];
        pow1[0] = 1;
        pow2[0] = 1;

        for (int i = 1; i <= n; i++) {
            pow1[i] = (pow1[i - 1] * BASE1) % MOD1;
            pow2[i] = (pow2[i - 1] * BASE2) % MOD2;
        }

        int lo = 1, hi = n, ans = n;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (hasUniqueSubarray(nums, mid, pow1, pow2)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    private boolean hasUniqueSubarray(int[] nums, int len, long[] pow1, long[] pow2) {
        int n = nums.length;
        long h1 = 0, h2 = 0;

        for (int i = 0; i < len; i++) {
            long val = nums[i] + 1L;
            h1 = (h1 * BASE1 + val) % MOD1;
            h2 = (h2 * BASE2 + val) % MOD2;
        }

        Map<Long, Integer> counts = new HashMap<>();
        long key = pack(h1, h2);
        counts.put(key, 1);

        long remPow1 = pow1[len - 1];
        long remPow2 = pow2[len - 1];

        for (int i = len; i < n; i++) {
            long outVal = nums[i - len] + 1L;
            long inVal = nums[i] + 1L;

            h1 = (h1 - (outVal * remPow1) % MOD1 + MOD1) % MOD1;
            h1 = (h1 * BASE1 + inVal) % MOD1;

            h2 = (h2 - (outVal * remPow2) % MOD2 + MOD2) % MOD2;
            h2 = (h2 * BASE2 + inVal) % MOD2;

            key = pack(h1, h2);
            counts.put(key, counts.getOrDefault(key, 0) + 1);
        }

        for (int freq : counts.values()) {
            if (freq == 1) {
                return true;
            }
        }
        return false;
    }

    private long pack(long h1, long h2) {
        return (h1 << 32) | (h2 & 0xffffffffL);
    }
}