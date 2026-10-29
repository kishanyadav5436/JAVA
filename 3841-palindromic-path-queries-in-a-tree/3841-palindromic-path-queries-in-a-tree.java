
import java.util.*;

class Solution {
    private List<Integer>[] adj;
    private int[] tin, tout, depth, parent, bit;
    private int[][] up;
    private int timer, LOG;

    public List<Boolean> palindromePath(
            int n, int[][] edges, String s, String[] queries) {

        adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            adj[e[0]].add(e[1]);
            adj[e[1]].add(e[0]);
        }

        LOG = 1;
        while ((1 << LOG) <= n) LOG++;

        tin = new int[n];
        tout = new int[n];
        depth = new int[n];
        parent = new int[n];
        up = new int[LOG][n];
        bit = new int[n + 2];

        char[] chars = s.toCharArray();

        // Iterative DFS to compute Euler entry/exit times.
        int[] stack = new int[n];
        int[] next = new int[n];
        int top = 0;
        timer = 0;

        stack[0] = 0;
        parent[0] = 0;
        up[0][0] = 0;
        tin[0] = ++timer;

        while (top >= 0) {
            int u = stack[top];

            if (next[top] < adj[u].size()) {
                int v = adj[u].get(next[top]++);

                if (v == parent[u]) continue;

                parent[v] = u;
                depth[v] = depth[u] + 1;
                up[0][v] = u;

                for (int j = 1; j < LOG; j++) {
                    up[j][v] = up[j - 1][up[j - 1][v]];
                }

                tin[v] = ++timer;
                stack[++top] = v;
                next[top] = 0;
            } else {
                tout[u] = timer;
                top--;
            }
        }

        // Each node's character affects its entire subtree.
        for (int u = 0; u < n; u++) {
            int mask = 1 << (chars[u] - 'a');
            rangeXor(tin[u], tout[u], mask);
        }

        List<Boolean> ans = new ArrayList<>();

        for (String query : queries) {
            String[] p = query.split(" ");

            if (p[0].equals("update")) {
                int u = Integer.parseInt(p[1]);
                char c = p[2].charAt(0);

                int oldMask = 1 << (chars[u] - 'a');
                int newMask = 1 << (c - 'a');

                rangeXor(tin[u], tout[u], oldMask ^ newMask);
                chars[u] = c;

            } else {
                int u = Integer.parseInt(p[1]);
                int v = Integer.parseInt(p[2]);

                int lca = getLCA(u, v);

                int mask = pointQuery(tin[u])
                         ^ pointQuery(tin[v])
                         ^ (1 << (chars[lca] - 'a'));

                ans.add((mask & (mask - 1)) == 0);
            }
        }

        return ans;
    }

    // Apply XOR to every Euler position in [l, r].
    private void rangeXor(int l, int r, int mask) {
        add(l, mask);
        add(r + 1, mask);
    }

    private void add(int i, int mask) {
        for (; i < bit.length; i += i & -i) {
            bit[i] ^= mask;
        }
    }

    // XOR of all range updates covering this position.
    private int pointQuery(int i) {
        int result = 0;
        for (; i > 0; i -= i & -i) {
            result ^= bit[i];
        }
        return result;
    }

    private int getLCA(int u, int v) {
        if (depth[u] < depth[v]) {
            int temp = u;
            u = v;
            v = temp;
        }

        int diff = depth[u] - depth[v];

        for (int j = 0; j < LOG; j++) {
            if ((diff & (1 << j)) != 0) {
                u = up[j][u];
            }
        }

        if (u == v) return u;

        for (int j = LOG - 1; j >= 0; j--) {
            if (up[j][u] != up[j][v]) {
                u = up[j][u];
                v = up[j][v];
            }
        }

        return parent[u];
    }
}
