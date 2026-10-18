import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final long MOD = 1000000007;
    private long[][] table;

    // Helper to compute combination C(n, k) using Pascal's Triangle
    private long comb(int n, int k) {
        if (k == 0 || k == n) return 1;
        if (table[n][k] != -1) return table[n][k];
        return table[n][k] = (comb(n - 1, k - 1) + comb(n - 1, k)) % MOD;
    }

    private long solve(List<Integer> nums) {
        int m = nums.size();
        if (m <= 2) return 1;

        List<Integer> leftSubtree = new ArrayList<>();
        List<Integer> rightSubtree = new ArrayList<>();
        int root = nums.get(0);

        for (int i = 1; i < m; i++) {
            if (nums.get(i) < root) {
                leftSubtree.add(nums.get(i));
            } else {
                rightSubtree.add(nums.get(i));
            }
        }

        long leftWays = solve(leftSubtree) % MOD;
        long rightWays = solve(rightSubtree) % MOD;

        int L = leftSubtree.size();
        int R = rightSubtree.size();

        // Ways to interleave left and right subtree elements = C(L + R, L)
        long ways = comb(L + R, L);

        return (((ways * leftWays) % MOD) * rightWays) % MOD;
    }

    public int numOfWays(int[] nums) {
        int n = nums.length;
        table = new long[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                table[i][j] = -1;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }

        // Subtract 1 because the original array ordering itself does not count as a "reordering"
        return (int) ((solve(list) - 1 + MOD) % MOD);
    }
}