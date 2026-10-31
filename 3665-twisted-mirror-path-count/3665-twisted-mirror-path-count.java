import java.util.Arrays;

class Solution {
    public int uniquePaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int MOD = 1_000_000_007;

        // dp[i][j] stores the number of unique valid paths to reach (i, j)
        long[][] dp = new long[m][n];
        dp[0][0] = 1;

        // Precompute jump targets for each cell:
        // jump[i][j][0] -> target if we try to move RIGHT from (i, j)
        // jump[i][j][1] -> target if we try to move DOWN from (i, j)
        int[][][] jump = new int[m][n][2];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Compute jump for moving right from (i, j)
                jump[i][j][0] = getLanding(grid, i, j, 0, 1);
                // Compute jump for moving down from (i, j)
                jump[i][j][1] = getLanding(grid, i, j, 1, 0);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dp[i][j] == 0) continue;

                // Try moving right
                int nextRight = jump[i][j][0];
                if (nextRight != -1) {
                    int ni = nextRight >> 16;
                    int nj = nextRight & 0xFFFF;
                    dp[ni][nj] = (dp[ni][nj] + dp[i][j]) % MOD;
                }

                // Try moving down
                int nextDown = jump[i][j][1];
                if (nextDown != -1) {
                    int ni = nextDown >> 16;
                    int nj = nextDown & 0xFFFF;
                    dp[ni][nj] = (dp[ni][nj] + dp[i][j]) % MOD;
                }
            }
        }

        return (int) dp[m - 1][n - 1];
    }

    // Simulates the reflection chain and returns packed coordinates (r << 16 | c), or -1 if out of bounds
    private int getLanding(int[][] grid, int r, int c, int dr, int dc) {
        int m = grid.length;
        int n = grid[0].length;

        int currR = r + dr;
        int currC = c + dc;
        int moveDir = (dr == 0) ? 0 : 1; // 0 for moving horizontally (right), 1 for vertically (down)

        while (currR >= 0 && currR < m && currC >= 0 && currC < n) {
            if (grid[currR][currC] == 0) {
                // Reached an empty cell
                return (currR << 16) | currC;
            } else {
                // Hit a mirror, reflect immediately
                if (moveDir == 0) {
                    // Entered moving right -> turn down
                    currR += 1;
                    moveDir = 1;
                } else {
                    // Entered moving down -> turn right
                    currC += 1;
                    moveDir = 0;
                }
            }
        }
        return -1; // Out of bounds
    }
}