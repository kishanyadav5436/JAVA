import java.util.*;

class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];

        for (char task : tasks) {
            freq[task - 'A']++;
        }

        PriorityQueue<Integer> pq =
            new PriorityQueue<>(Collections.reverseOrder());

        for (int count : freq) {
            if (count > 0) {
                pq.add(count);
            }
        }

        int time = 0;

        while (!pq.isEmpty()) {

            List<Integer> temp = new ArrayList<>();

            int cycle = n + 1;

            while (cycle > 0 && !pq.isEmpty()) {

                int count = pq.poll();
                count--;

                if (count > 0) {
                    temp.add(count);
                }

                time++;
                cycle--;
            }

            for (int count : temp) {
                pq.add(count);
            }

            if (!pq.isEmpty()) {
                time += cycle;
            }
        }

        return time;
    }
}