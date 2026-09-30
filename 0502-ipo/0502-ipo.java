import java.util.*;

class Solution {
    public int findMaximizedCapital(
            int k, int w, int[] profits, int[] capital) {

        // [capital, profit]
        PriorityQueue<int[]> minHeap =
            new PriorityQueue<>((a, b) -> a[0] - b[0]);

        // Add all projects
        for (int i = 0; i < profits.length; i++) {
            minHeap.offer(new int[]{capital[i], profits[i]});
        }

        // Highest profit among affordable projects
        PriorityQueue<Integer> maxHeap =
            new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < k; i++) {

            // Move all affordable projects
            while (!minHeap.isEmpty()
                    && minHeap.peek()[0] <= w) {

                int[] project = minHeap.poll();
                maxHeap.offer(project[1]);
            }

            // No project can be started
            if (maxHeap.isEmpty()) {
                break;
            }

            // Choose highest profit
            w += maxHeap.poll();
        }

        return w;
    }
}