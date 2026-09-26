import java.util.*;

class Solution {
    public int kthSmallest(int[][] matrix, int k) {

        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a, b) -> a[0] - b[0]);

        // Add first element of every row
        for (int row = 0; row < matrix.length; row++) {
            pq.offer(new int[]{matrix[row][0], row, 0});
        }

        // Remove smallest k - 1 times
        for (int i = 0; i < k - 1; i++) {

            int[] current = pq.poll();

            int row = current[1];
            int col = current[2];

            // Add next element from the same row
            if (col + 1 < matrix[0].length) {
                pq.offer(new int[]{
                    matrix[row][col + 1],
                    row,
                    col + 1
                });
            }
        }

        // kth smallest
        return pq.poll()[0];
    }
}