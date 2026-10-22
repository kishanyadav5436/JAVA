import java.util.*;

class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        if (n <= 1) return 0;

        // Check if the array is already sorted
        boolean sorted = true;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) return 0;

        // We can use a BFS on the 2n states: (type, shift)
        // type 0: rotation of original array
        // type 1: rotation of reversed array
        Queue<int[]> queue = new LinkedList<>();
        // visited[type][shift]
        boolean[][] visited = new boolean[2][n];

        // Initial state: type = 0, shift = 0
        queue.offer(new int[]{0, 0, 0}); // {type, shift, dist}
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int type = curr[0];
            int shift = curr[1];
            int dist = curr[2];

            // Operation 1: Rotate Left by One
            int nxtType1 = type;
            int nxtShift1 = (shift + 1) % n;
            if (!visited[nxtType1][nxtShift1]) {
                if (isSorted(nxtType1, nxtShift1, nums, n)) {
                    return dist + 1;
                }
                visited[nxtType1][nxtShift1] = true;
                queue.offer(new int[]{nxtType1, nxtShift1, dist + 1});
            }

            // Operation 2: Reverse the array
            int nxtType2 = 1 - type;
            int nxtShift2 = (n - shift) % n;
            if (!visited[nxtType2][nxtShift2]) {
                if (isSorted(nxtType2, nxtShift2, nums, n)) {
                    return dist + 1;
                }
                visited[nxtType2][nxtShift2] = true;
                queue.offer(new int[]{nxtType2, nxtShift2, dist + 1});
            }
        }

        return -1;
    }

    private boolean isSorted(int type, int shift, int[] nums, int n) {
        if (type == 0) {
            // Original array rotated left by `shift`
            // Needs to form sequence 0, 1, 2, ..., n-1
            for (int i = 0; i < n; i++) {
                if (nums[(shift + i) % n] != i) return false;
            }
        } else {
            // Reversed array rotated left by `shift`
            // Reversed original sequence: n-1, n-2, ..., 0 rotated by shift
            for (int i = 0; i < n; i++) {
                if (nums[(n - 1 - (shift + i) % n + n) % n] != i) return false;
            }
        }
        return true;
    }
}