
class Solution {
    static final long MOD = 1_000_000_007L;

    int n;
    long[] sum;
    long[] sumSq;
    long[] lazy;

    public int sumCounts(int[] nums) {
        n = nums.length;

        sum = new long[4 * n];
        sumSq = new long[4 * n];
        lazy = new long[4 * n];

        int[] last = new int[100001];
        java.util.Arrays.fill(last, -1);

        long ans = 0;

        for (int i = 0; i < n; i++) {
            int prev = last[nums[i]];

            // Increase distinct counts for affected subarrays.
            update(1, 0, n - 1, prev + 1, i, 1);

            // Sum of squares for all subarrays ending at i.
            ans = (ans + sumSq[1]) % MOD;

            last[nums[i]] = i;
        }

        return (int) ans;
    }

    void update(int node, int start, int end,
                int left, int right, long val) {

        if (left > end || right < start) {
            return;
        }

        if (left <= start && end <= right) {
            apply(node, start, end, val);
            return;
        }

        pushDown(node, start, end);

        int mid = start + (end - start) / 2;

        update(node * 2, start, mid, left, right, val);
        update(node * 2 + 1, mid + 1, end, left, right, val);

        sum[node] = (sum[node * 2] + sum[node * 2 + 1]) % MOD;

        sumSq[node] = (sumSq[node * 2] + sumSq[node * 2 + 1]) % MOD;
    }

    void apply(int node, int start, int end, long val) {
        long len = end - start + 1L;
        long v = val % MOD;

        sumSq[node] = (
            sumSq[node]
            + 2L * v % MOD * sum[node] % MOD
            + v * v % MOD * len % MOD
        ) % MOD;

        sum[node] = (sum[node] + v * len) % MOD;

        lazy[node] = (lazy[node] + v) % MOD;
    }

    void pushDown(int node, int start, int end) {
        if (lazy[node] == 0 || start == end) {
            return;
        }

        int mid = start + (end - start) / 2;
        long val = lazy[node];

        apply(node * 2, start, mid, val);
        apply(node * 2 + 1, mid + 1, end, val);

        lazy[node] = 0;
    }
}
